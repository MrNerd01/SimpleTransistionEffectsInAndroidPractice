package com.example.swarathesh60.angelordevilimagetranseffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView angel,devil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angel = (ImageView) findViewById(R.id.imageView);
        devil = (ImageView) findViewById(R.id.imageView2);
//       uda


    }
    public void transform(View  view){


        devil.animate().alpha(0f).setDuration(2000);
        angel.animate().alpha(1f).setDuration(2000);
        devil.animate().alpha(0.5f).setDuration(2000);
        devil.animate().rotationYBy(1000f).setDuration(2000);
        devil.animate().translationY(500f).setDuration(2000);
        angel.animate().rotationX(1000f).setDuration(20000);
//        devil.animate().rotation(120f).rotationBy(360).setDuration(2000);
    }

}
