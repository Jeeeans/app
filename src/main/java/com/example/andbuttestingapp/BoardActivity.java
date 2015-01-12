package com.example.andbuttestingapp;

import android.app.Activity;
import android.os.Bundle;

import io.userhabit.service.Userhabit;


/**
 * Created by Sungjun on 2015-01-07.
 */
public class BoardActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.boardactivity);
	}
	@Override
	protected void onStart() {
		super.onStart();
		Userhabit.activityStart(this);
	}
	@Override
	protected void onStop() {
		super.onStop();
		Userhabit.activityStop(this);
	}
}
