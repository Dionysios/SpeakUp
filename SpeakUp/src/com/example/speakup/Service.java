package com.example.speakup;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.example.shakethephone.MyService;

public class Service extends MyService {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// Toast.makeText(this, "Play music", Toast.LENGTH_SHORT).show();
		Log.e("MyService", "We play music");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "Service Stoped", Toast.LENGTH_SHORT).show();
		// stop the sensor and service
		stopSelf();
		Log.e("MyService", "Destroy service");
	}

	// increase volume by one
	public void setRingerOneMore() {
		AudioManager audioManager = (AudioManager) getBaseContext()
				.getSystemService(Context.AUDIO_SERVICE);
		audioManager.adjustVolume(AudioManager.ADJUST_RAISE,
				AudioManager.FLAG_SHOW_UI);
	}

	// decrease volume by one
	public void setRingerLower() {
		AudioManager audioManager = (AudioManager) getBaseContext()
				.getSystemService(Context.AUDIO_SERVICE);
		audioManager.adjustVolume(AudioManager.ADJUST_LOWER,
				AudioManager.FLAG_SHOW_UI);
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
	}

}