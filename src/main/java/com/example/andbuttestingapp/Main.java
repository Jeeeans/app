package com.example.andbuttestingapp;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBarActivity;

import io.userhabit.service.Userhabit;


/**
 * Created by Sungjun on 2015-01-07.
 */
public class Main extends ActionBarActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		FragmentTabHost mTab = (FragmentTabHost)findViewById(R.id.tabhost);
		mTab.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		mTab.addTab(mTab.newTabSpec("tab1").setIndicator("TAB1"), Fragment1.class, null);
		mTab.addTab(mTab.newTabSpec("tab2").setIndicator("TAB2"), Fragment2.class, null);
		mTab.addTab(mTab.newTabSpec("tab3").setIndicator("TAB3"), Fragment3.class, null);
	}
	@Override
	protected void onStart() {
		super.onStart();
		Userhabit.activityStart(this);

		// 앱이 종료 혹은 백그라운드로 갔을 시, 15초 뒤에 세션을 종료합니다. 한번만 실행시켜주시면 됩니다.
		Userhabit.setSessionEndTime(15);
	}
	@Override
	protected void onStop() {
		super.onStop();
		Userhabit.activityStop(this);
	}
}
