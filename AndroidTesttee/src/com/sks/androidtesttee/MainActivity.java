package com.sks.androidtesttee;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onButtonClick(View view){
		Log.v("testee","button click");
		TextView textview1 = (TextView) findViewById(R.id.textView1);
		EditText et1 = (EditText) findViewById(R.id.editText1);
		textview1.setText(et1.getText().toString());
		Log.v("testee","text view content="+textview1.getText().toString());
		
		
	}
}
