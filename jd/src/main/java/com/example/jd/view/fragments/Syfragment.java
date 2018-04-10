package com.example.jd.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jd.R;
import com.example.jd.model.ShouYeBean;

import java.util.List;

/**
 * Created by Administrator on 2018/4/9 0009.
 */

public class Syfragment extends BaseFragment implements IShouYeView{
    @Nullable


    @Override
    View createView(LayoutInflater inflater) {
        View view = View.inflate(getActivity(), R.layout.sy_layout, null);
        initViews();
        return view;
    }

    private void initViews() {
        
    }

    @Override
    public void showLunbo(List<ShouYeBean.DataBean> list) {

    }

    @Override
    public void showMiaosha(List<ShouYeBean.MiaoshaBean.ListBeanX> list) {

    }

    @Override
    public void showTuiJian(List<ShouYeBean.TuijianBean.ListBean> list) {

    }
}
