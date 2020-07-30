package com.example.appintrotest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.appintro.SlideBackgroundColorHolder;
import com.github.appintro.model.SliderPage;

public class CustomSlider1 extends Fragment implements SlideBackgroundColorHolder {
    @Override
    public int getDefaultBackgroundColor() {
        return 0;
    }

    @Override
    public void setBackgroundColor(int i) {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_slider_layout, container, false);
    }
}
