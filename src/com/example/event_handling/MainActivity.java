package com.example.event_handling;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button click;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		click = (Button) findViewById(R.id.btnClick);
		//click.setText(getResources().getString(R.string.caption));
		//click.setTextColor(getResources().getColor(R.color.dk_blue));
		//click.setTextColor(Color.GREEN);
		//click.setBackgroundColor(Color.YELLOW);
		//click.setTextSize((float)17.3);
		
		OnClickListener listener= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				click.setText("Button was clicked!");
				
			}
		};
		click.setOnClickListener(listener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
