package com.example.appintrotest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.github.appintro.SlideBackgroundColorHolder;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment implements SlideBackgroundColorHolder {


    FrameLayout x ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public int getDefaultBackgroundColor() {
        return 0;
    }

    @Override
    public void setBackgroundColor(int i) {
    }
}