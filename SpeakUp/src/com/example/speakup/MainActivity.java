package com.example.speakup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button startButton;
	private Button stopButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startButton = (Button) findViewById(R.id.btnStartService1);
		stopButton = (Button) findViewById(R.id.btnStopService);

		startButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Start the service
			 startService(new Intent(getBaseContext(), Service.class));
			}
		});

		stopButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Stop the service
			 stopService(new Intent(getBaseContext(), Service.class));
			}
		});
	}
}
