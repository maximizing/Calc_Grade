package app.buusk15.quiz01repair03_55410797;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button btncal;
	private EditText edt1,edt2,edt3,edt4,edt5,edt6,edt7,edt8,edt9,edt10,edt11,edt12,edt13,edt14,edt15,edt16;
	private double e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,result1,result2,result3,result4,result5,result6,result7,result8;
   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //////////////////////////////////////////     input  Credit
        btncal = (Button) findViewById(R.id.btncal);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        edt3 = (EditText) findViewById(R.id.edt3);
        edt4 = (EditText) findViewById(R.id.edt4);
        edt5 = (EditText) findViewById(R.id.edt5);
        edt6 = (EditText) findViewById(R.id.edt6);
        edt7 = (EditText) findViewById(R.id.edt7);
        edt8 = (EditText) findViewById(R.id.edt8);
        //////////////////////////////////////////     input  Grade
        edt9 = (EditText) findViewById(R.id.edt9);
        edt10 = (EditText) findViewById(R.id.edt10);
        edt11 = (EditText) findViewById(R.id.edt11);
        edt12 = (EditText) findViewById(R.id.edt12);
        edt13 = (EditText) findViewById(R.id.edt13);
        edt14 = (EditText) findViewById(R.id.edt14);
        edt15 = (EditText) findViewById(R.id.edt15);
        edt16 = (EditText) findViewById(R.id.edt16);
        
        
    	
        
        btncal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v == btncal){					
					
			    	Cal();
			    	Convert();    	
			    	
//				Intent i = new Intent(getApplicationContext(),Show.class);
//				i.putExtra("e1", e1);
//				i.putExtra("e2", e2);
//				i.putExtra("e3", e3);
//				i.putExtra("e4", e4);
//				i.putExtra("e5", e5);
//				i.putExtra("e6", e6);
//				i.putExtra("e7", e7);
//				i.putExtra("e8", e8);
//				i.putExtra("e9", e9);
//				i.putExtra("e10", e10);
//				i.putExtra("e11", e11);
//				i.putExtra("e12", e12);
//				i.putExtra("e13", e13);
//				i.putExtra("e14", e14);
//				i.putExtra("e15", e15);
//				i.putExtra("e16", e16);
//				//////////////////////// intent each result
//				i.putExtra("result1", result1);
//				i.putExtra("result2", result2);
//				i.putExtra("result3", result3);
//				i.putExtra("result4", result4);
//				i.putExtra("result5", result5);
//				i.putExtra("result6", result6);
//				i.putExtra("result7", result7);
//				i.putExtra("result8", result8);
//				startActivity(i);		
				Toast.makeText(getApplicationContext(),""+e1+e9,
						Toast.LENGTH_LONG).show();
				
				}
				
			}
		});
        
        
    }
 
   private void Cal(){
	   result1 = e1*e9;
   	result2 = e2*e10;
   	result3 = e3*e11;
   	result4 = e4*e12;
   	result5 = e5*e13;
   	result6 = e6*e14;
   	result7 = e7*e15;
   	result8 = e8*e16;
   }
    
    private void Convert(){
		
    	final String ed1 = edt1.getText().toString();
    	final String ed2 = edt2.getText().toString();
    	final String ed3 = edt3.getText().toString();
    	final String ed4 = edt4.getText().toString();
    	final String ed5 = edt5.getText().toString();
    	final String ed6 = edt6.getText().toString();
    	final String ed7 = edt7.getText().toString();
    	final String ed8 = edt8.getText().toString();
    	final String ed9 = edt9.getText().toString();
    	final String ed10 = edt10.getText().toString();
    	final String ed11 = edt11.getText().toString();
    	final String ed12 = edt12.getText().toString();
    	final String ed13 = edt13.getText().toString();
    	final String ed14 = edt14.getText().toString();
    	final String ed15 = edt15.getText().toString();
    	final String ed16 = edt16.getText().toString();
    	/////////////////////////////////// convert variable
    	try{
        	e1 = Double.valueOf(ed1).doubleValue();
        	e2 = Double.valueOf(ed2).doubleValue();
        	e3 = Double.valueOf(ed3).doubleValue();
        	e4 = Double.valueOf(ed4).doubleValue();
        	e5 = Double.valueOf(ed5).doubleValue();
        	e6 = Double.valueOf(ed6).doubleValue();
        	e7 = Double.valueOf(ed7).doubleValue();
        	e8 = Double.valueOf(ed8).doubleValue();
        	e9 = Double.valueOf(ed9).doubleValue();
        	e10 = Double.valueOf(ed10).doubleValue();
        	e11 = Double.valueOf(ed11).doubleValue();
        	e12 = Double.valueOf(ed12).doubleValue();
        	e13 = Double.valueOf(ed13).doubleValue();
        	e14 = Double.valueOf(ed14).doubleValue();
        	e15 = Double.valueOf(ed15).doubleValue();
        	 e16 = Double.valueOf(ed16).doubleValue();
        	}catch(NumberFormatException e){
        		
        	}
    	 
    }
    
}
