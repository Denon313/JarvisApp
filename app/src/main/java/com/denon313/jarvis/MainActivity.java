package com.denon313.jarvis;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView screen = new TextView(this);
        screen.setText("JARVIS\n\nاپلیکیشن آماده توسعه است");
        screen.setTextSize(24);
        screen.setTextColor(Color.WHITE);
        screen.setGravity(Gravity.CENTER);
        screen.setBackgroundColor(Color.rgb(18, 22, 35));

        setContentView(screen);
    }
}
