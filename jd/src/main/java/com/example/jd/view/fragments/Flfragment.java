package com.example.jd.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jd.R;

/**
 * Created by Administrator on 2018/4/9 0009.
 */

public class Flfragment extends BaseFragment {

    @Override
    View createView(LayoutInflater inflater) {
        View view = View.inflate(getActivity(), R.layout.fl_layout, null);
        return view;
    }
}
