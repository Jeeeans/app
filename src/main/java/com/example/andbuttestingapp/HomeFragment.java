package com.example.andbuttestingapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sungjun on 2015-01-08.
 */
public class HomeFragment extends Fragment {
	public HomeFragment(){}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_home, container, false);

		return rootView;
	}
}
