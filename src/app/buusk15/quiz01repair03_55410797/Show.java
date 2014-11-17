package app.buusk15.quiz01repair03_55410797;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Show extends Activity {
	private Button btnback;
	private TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txtcre_grade,txtresultgrade,txtv1,txtv2,txtv3;
	private Double in1,in2,in4,in5,in6,in7,in8,in9,in10,in11,in12,in13,in14,in15,in16,in3,inre1,inre2,inre3,inre4,inre5,inre6,inre7,inre8,var1,var2,inall;
	private String str1,str2,str3,str4,str5,str6,str7,str8;
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.show);
	Bind();	
	getInt();
	calGrade();
	setText();
	btnback.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent j = new Intent(getApplicationContext(),MainActivity.class);
			startActivity(j);
			
		}
	});	
}
private void Bind(){
	txt1 = (TextView) findViewById(R.id.txt1);
	txt2 = (TextView) findViewById(R.id.txt2);
	txt3 = (TextView) findViewById(R.id.txt3);
	txt4 = (TextView) findViewById(R.id.txt4);
	txt5 = (TextView) findViewById(R.id.txt5);
	txt6 = (TextView) findViewById(R.id.txt6);
	txt7 = (TextView) findViewById(R.id.txt7);
	txt8 = (TextView) findViewById(R.id.txt8);
	txt9 = (TextView) findViewById(R.id.txt9);
	txt10 = (TextView) findViewById(R.id.txt10);
	txt11 = (TextView) findViewById(R.id.txt11);
	txt12 = (TextView) findViewById(R.id.txt12);
	txt13 = (TextView) findViewById(R.id.txt13);
	txt14 = (TextView) findViewById(R.id.txt14);
	txt15 = (TextView) findViewById(R.id.txt15);
	txt16 = (TextView) findViewById(R.id.txt16);
	txtcre_grade = (TextView) findViewById(R.id.txtcre_grade);
	txtresultgrade = (TextView) findViewById(R.id.txtresultgrade);
	txtv1 = (TextView) findViewById(R.id.textView1);
	txtv2 = (TextView) findViewById(R.id.textView2);
	txtv3 = (TextView) findViewById(R.id.textView3);
	btnback = (Button) findViewById(R.id.btnback);
}
private boolean setText(){
	
	Typeface thaifont = Typeface.createFromAsset(getAssets(),
			"fonts/THSarabun.ttf");
	txtv1.setTypeface(thaifont, Typeface.BOLD);
	txtv2.setTypeface(thaifont, Typeface.BOLD);
	txtv3.setTypeface(thaifont, Typeface.BOLD);
	txtv1.setText("เกรดเฉลี่ย");
	txtv2.setText("หน่วยกิต");
	txtv3.setText("เกรด");
	txt1.setText(in1+" x "+in9);
	txt2.setText(in2+" x "+in10);
	txt3.setText(in3+" x "+in11);
	txt4.setText(in4+" x "+in12);
	txt5.setText(in5+" x "+in13);
	txt6.setText(in6+" x "+in14);
	txt7.setText(in7+" x "+in15);
	txt8.setText(in8+" x "+in16);
	txt9.setText(""+inre1);
	txt10.setText(""+inre2);
	txt11.setText(""+inre3);
	txt12.setText(""+inre4);
	txt13.setText(""+inre5);
	txt14.setText(""+inre6);
	txt15.setText(""+inre7);
	txt16.setText(""+inre8);
	txtcre_grade.setText(var1+"/"+var2);
	txtresultgrade.setText(""+inall);
	return false;
	
}
private void getInt(){
	Bundle i = getIntent().getExtras();
	in1 = i.getDouble("e1");
	in2 = i.getDouble("e2");
	in3 = i.getDouble("e3");
	in4 = i.getDouble("e4");
	in5 = i.getDouble("e5");
	in6 = i.getDouble("e6");
	in7 = i.getDouble("e7");
	in8 = i.getDouble("e8");
	
	in9 = i.getDouble("e9");
	in10 = i.getDouble("e10");
	in11 = i.getDouble("e11");
	in12 = i.getDouble("e12");
	in13 = i.getDouble("e13");
	in14 = i.getDouble("e14");
	in15 = i.getDouble("e15");
	in16 = i.getDouble("e16");
	inre1 = i.getDouble("result1");
	inre2 = i.getDouble("result2");
	inre3 = i.getDouble("result3");
	inre4 = i.getDouble("result4");
	inre5 = i.getDouble("result5");
	inre6 = i.getDouble("result6");
	inre7 = i.getDouble("result7");
	inre8 = i.getDouble("result8");
	
}
private double calGrade(){
	 var1 = (inre1+inre2+inre3+inre4+inre5+inre6+inre7+inre8);
	 var2 = (in1+in2+in3+in4+in5+in6+in7+in8);
	 inall = var1/var2;
	return 0.0;
	
}
}
