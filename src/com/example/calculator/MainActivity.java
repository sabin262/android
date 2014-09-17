package com.example.calculator;

import android.R.integer;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	String oper="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView temp=(TextView)findViewById(R.id.txtTemp);
        Button btnClear,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSubtract,btnMultiply,btnDivide,btnPoint,btnShow,btnBack;
        btnClear=(Button)findViewById(R.id.btnClear);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnPoint=(Button)findViewById(R.id.btnPoint);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSubtract=(Button)findViewById(R.id.btnSubtract);
        btnMultiply=(Button)findViewById(R.id.btnMultiply);
        btnDivide=(Button)findViewById(R.id.btnDivide);
        btnShow=(Button)findViewById(R.id.btnShow);
        TextView display=(TextView)findViewById(R.id.lblDisplay);
        btnBack=(Button)findViewById(R.id.btnBack);
        btnClear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText input=(EditText)findViewById(R.id.txtInput);
				TextView temp=(TextView)findViewById(R.id.txtTemp);
				input.setText(" ");
				temp.setText(" ");
				oper="";
				// TODO Auto-generated method stub
				
			}
		});
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText input=(EditText)findViewById(R.id.txtInput);
				input.setText(input.getText()+"1");
				// TODO Auto-generated method stub
				
			}
		});
        btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				EditText input=(EditText)findViewById(R.id.txtInput);
	        	input.setText(input.getText()+"2");
				// TODO Auto-generated method stub
				
			}
		});
        btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText input=(EditText)findViewById(R.id.txtInput);
				input.setText(input.getText()+"3");
				// TODO Auto-generated method stub
				
			}
		});
btn4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		input.setText(input.getText()+"4");
		// TODO Auto-generated method stub
		
	}
});
btn5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		input.setText(input.getText()+"5");
		// TODO Auto-generated method stub
		
	}
});
btn6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		input.setText(input.getText()+"6");
		// TODO Auto-generated method stub
		
	}
});
btn7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		input.setText(input.getText()+"7");
		// TODO Auto-generated method stub
		
	}
});
btn8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		input.setText(input.getText()+"8");
		// TODO Auto-generated method stub
		
	}
});
btn9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		input.setText(input.getText()+"9");
		// TODO Auto-generated method stub
		
	}
});
btn0.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		//to make sure that user can note enter zero when the string is null
		if (input.getText().toString().length()!=0){
			input.setText(input.getText()+"0");
		}
		// TODO Auto-generated method stub
		
	}
});
btnBack.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		String s=input.getText().toString();
		input.setText(s.substring(0, s.length()-1));
		// TODO Auto-generated method stub
		
	}
});
btnPoint.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		input.setText(input.getText()+".");
		// TODO Auto-generated method stub
		
	}
});
btnAdd.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		
		TextView temp=(TextView)findViewById(R.id.txtTemp);
		EditText input=(EditText)findViewById(R.id.txtInput);
		//input.setText(input.getText()+"+");
		///check if any other function is pressed or not
		if (oper!="")
			equalOperation();
		else
			temp.setText(input.getText());			
		
		input.setText(" ");
		oper="+";
		// TODO Auto-generated method stub
		
	}
});
btnShow.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		equalOperation();
		//add=a+Float.parseFloat(input.getText().toString());
		//temp.setText(add+"");
		/*String add="";
		String subtract="";
		String divide="";
		String multiply="";
		add="+";
		subtract="-";
		divide="/";
		multiply="*";
		float show;
		float result=0;
    	final EditText input=(EditText)findViewById(R.id.txtInput);
    	TextView temp=(TextView)findViewById(R.id.txtTemp);
    	String s=input.getText().toString();
    	result=Float.parseFloat(input.getText().toString());
    	show=result;
    	temp.setText(show+"");*/
		
		// TODO Auto-generated method stub
		
	}
});
btnSubtract.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		//input.setText(input.getText()+"-");
		TextView temp=(TextView)findViewById(R.id.txtTemp);
		if (oper!="")
			equalOperation();
		else
			temp.setText(input.getText());			
		
		input.setText(" ");
		oper="-";
		// TODO Auto-generated method stub
		
	}
});
btnDivide.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		//input.setText(input.getText()+"/");
		TextView temp=(TextView)findViewById(R.id.txtTemp);
		if (oper!="")
			equalOperation();
		else
			temp.setText(input.getText());			
		
		input.setText(" ");
		oper="/";
		// TODO Auto-generated method stub
		
	}
});
btnMultiply.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		EditText input=(EditText)findViewById(R.id.txtInput);
		//input.setText(input.getText()+"*");
		TextView temp=(TextView)findViewById(R.id.txtTemp);
		if (oper!="")
			equalOperation();
		else
			temp.setText(input.getText());			
		
		input.setText(" ");
		oper="*";
		// TODO Auto-generated method stub
		
	}
});

	
        }
   
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    
    public void equalOperation(){
    	final TextView temp=(TextView)findViewById(R.id.txtTemp);
		float add;
		float a=0;
		//String oper="";
		//oper="+";
		EditText input=(EditText)findViewById(R.id.txtInput);
		String b=temp.getText().toString();
		a=Float.parseFloat(temp.getText().toString());
		if(oper=="+"){
			add=a+Float.parseFloat(input.getText().toString());
			temp.setText(add+"");
		}
		else if(oper=="-"){
			add=a-Float.parseFloat(input.getText().toString());
			temp.setText(add+"");
		}
		else if(oper=="*"){
			add=a*Float.parseFloat(input.getText().toString());
			temp.setText(add+"");
		}
		else if(oper=="/"){
			add=a/Float.parseFloat(input.getText().toString());
			temp.setText(add+"");
		}
		//////make operand empty after equal to is pressed 
		oper="";
    	
    }

}
