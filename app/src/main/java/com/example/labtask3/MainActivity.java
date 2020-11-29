package com.example.labtask3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color ;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3;
    RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.edittext1);
        et2 = findViewById(R.id.edittext2);
        et3 = findViewById(R.id.edittext3);
        rel = findViewById(R.id.Relativ_Layout);
    }

    public void ColorChanger(View view) {
        if (et1 != null && et2 != null && et3 != null) {
            int RGB1 = Integer.parseInt(et1.getText().toString());
            int RGB2 = Integer.parseInt(et2.getText().toString());
            int RGB3 = Integer.parseInt(et3.getText().toString());

            RGB1 = Math.max(RGB1, 0);
            RGB2 = Math.max(RGB2, 0);
            RGB3 = Math.max(RGB3, 0);

            RGB1 = Math.min(RGB1, 255);
            RGB2 = Math.min(RGB2, 255);
            RGB3 = Math.min(RGB3, 255);

            rel.setBackgroundColor(Color.rgb(RGB1, RGB2, RGB3));
        }
    }
}