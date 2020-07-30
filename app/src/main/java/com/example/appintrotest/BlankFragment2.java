package com.example.appintrotest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.appintro.SlideBackgroundColorHolder;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class BlankFragment2 extends Fragment implements SlideBackgroundColorHolder {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank3, container, false);
    }

    @Override
    public int getDefaultBackgroundColor() {
        return 0;
    }

    @Override
    public void setBackgroundColor(int i) {

    }
}