package com.example.appintrotest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroCustomLayoutFragment;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;
import com.github.appintro.model.SliderPage;


public class MainActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomSlider1 customSlider1 = new CustomSlider1();
        CustomSlider2 customSlider2 = new CustomSlider2();

        customSlider1.setBackgroundColor(Color.parseColor("#FFFFFF"));
        customSlider2.setBackgroundColor(Color.parseColor("#000000"));


        addSlide(new CustomSlider1());
        addSlide(new CustomSlider2());
        setImmersiveMode();

        setIndicatorColor(Color.parseColor("#ffffff") , Color.parseColor("#ffffff"));


        setColorTransitionsEnabled(true);

    }

    @Override
    protected void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Toast.makeText(this, "Skipped", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }
}