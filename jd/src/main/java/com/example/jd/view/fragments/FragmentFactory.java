package com.example.jd.view.fragments;

/**
 * Created by gjl on 2018/3/23.
 */

public class FragmentFactory {

    public static BaseFragment createFragment(int type) {
        BaseFragment fragment = null;
        switch (type) {
            case 0:
                fragment = new Syfragment();
                break;
            case 1:
                fragment = new Flfragment();
                break;
            case 2:
                fragment = new Wdfragment();
                break;
            case 3:
                fragment = new Gwcfragment();
                break;
            case 4:
                fragment = new Xqfragment();
                break;
        }
        return fragment;
    }

}
