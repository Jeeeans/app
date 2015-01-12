package com.example.andbuttestingapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Sungjun on 2015-01-06.
 */
public class Fragment1 extends Fragment {
	Context context;
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment1, container, false);
		context = view.getContext();
		Button button = (Button) view.findViewById(R.id.activityOneButton);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, BoardActivity.class);
				startActivity(intent);
			}
		});

		return view;
	}
}
