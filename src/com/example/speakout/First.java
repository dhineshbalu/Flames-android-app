package com.example.speakout;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class First extends Activity {
	Button b;
   EditText e1,e2;
	TextView t3,t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
      
        b=(Button)findViewById(R.id.button1);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        t3=(TextView)findViewById(R.id.textView3);
        t3.setTextColor(Color.parseColor("#ff0066"));
        t1=(TextView)findViewById(R.id.textView1);
        t1.setTextColor(Color.parseColor("#00ffff"));
        t2=(TextView)findViewById(R.id.textView2);
        t2.setTextColor(Color.parseColor("#ff0000"));
        b.setOnClickListener( new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name1=e1.getText().toString();
				String name2=e2.getText().toString();
				name1=name1.toLowerCase();
				name2=name2.toLowerCase();
				String name1_split[]=name1.split(" ");
				String name2_split[]=name2.split(" ");
				name1=" ";
				name2=" ";
				for(int i=0;i<name1_split.length;i++)
				name1=name1+name1_split[i];
				for(int i=0;i<name2_split.length;i++)
					name2=name2+name2_split[i];
				int length=name1.length()+name2.length();
				int count=0;
				char[] n1=name1.toCharArray();
				char[] n2=name2.toCharArray();
				for(int i=0;i<n1.length;i++)
				{
					for(int j=0;j<n2.length;j++)
					{
						if(n1[i]==n2[j])
						{
							n2[j]='*';
							count++;
							length=length-2;
							break;
						}
					}
				}
				
				String s=Integer.toString(length);
				if(length== 2 || length== 4 || length==7 || length==9 )
					t3.setText("Enemy");
				else if(length == 3 || length==5 ||  length==14 ||  length==16 ||  length==18)
					t3.setText("friends");
				else if(length == 8 || length==12 || length==17)
					t3.setText("Affection");
				else if(length==10)
					t3.setText("Love");
				else if( length== 6 || length==11 || length==15)
					t3.setText("Marriage");
				else
					t3.setText("Sweet Hearts");
				
				//Toast.makeText(getApplicationContext(),,Toast.LENGTH_LONG).show();
			}
		});
       
        
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }
    
}
