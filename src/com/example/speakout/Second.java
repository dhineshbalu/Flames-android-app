package com.example.speakout;

import com.example.speakout.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends Activity {

	TextView t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		t=(TextView)findViewById(R.id.textView1);
		Intent i=getIntent();
		Bundle bn=i.getExtras();
		String s=bn.getString("k");
		t.setText(s);
		Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
