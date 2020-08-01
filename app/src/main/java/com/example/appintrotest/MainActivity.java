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

        CustomSlider customSlider = CustomSlider.newInstance(R.layout.first_slider_layout);

        CustomSlider customSlider2 = CustomSlider.newInstance(R.layout.second_slider_layout);
        CustomSlider customSlider3 = CustomSlider.newInstance(R.layout.third_slider_layout);

        customSlider.setBackgroundColor(Color.parseColor("#FFFFFF"));

        addSlide(customSlider);
        addSlide(customSlider2);
        addSlide(customSlider3);

        setColorTransitionsEnabled(true);
        setTransformer(AppIntroPageTransformerType.Fade.INSTANCE);
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