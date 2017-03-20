package com.example.lagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LLLActivity extends AppCompatActivity {

    ImageView imageView;
    TextView info1, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lll);

        imageView = (ImageView) findViewById(R.id.ivImage);
        info1 = (TextView) findViewById(R.id.tvInfo1);
        location = (TextView) findViewById(R.id.tvLocation);
        location.setText(new Attraction("Location: Eti-Osa, Lagos, Nigeria").getLocation());
    }
}
