package com.example.appintrotest;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.appintro.SlideBackgroundColorHolder;
import com.github.appintro.model.SliderPage;

public class CustomSlider extends Fragment implements SlideBackgroundColorHolder {
    private static final String ARG_LAYOUT_RES_ID = "LAYOUT_RES_ID";
    private int layoutResId = 0;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layoutResId = getArguments().getInt(ARG_LAYOUT_RES_ID);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutResId, container, false);
    }

    static CustomSlider newInstance(@LayoutRes int layoutResId) {
        CustomSlider newFragment = new CustomSlider();
        Bundle args = new Bundle();
        args.putInt(ARG_LAYOUT_RES_ID, layoutResId);
        newFragment.setArguments(args);
        return newFragment;
    }

    @Override
    public int getDefaultBackgroundColor() {

        return Color.RED;
    }

    @Override
    public void setBackgroundColor(int backgroundColor) {

    }
}
