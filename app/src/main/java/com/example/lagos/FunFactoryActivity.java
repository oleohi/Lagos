package com.example.lagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FunFactoryActivity extends AppCompatActivity {

    ImageView imageView;
    TextView location, info1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_factory);

        imageView = (ImageView) findViewById(R.id.ivImage);
        info1 = (TextView) findViewById(R.id.tvInfo1);
        location = (TextView) findViewById(R.id.tvLocation);
        location.setText(new Attraction("Location: 4, Admiralty Way, Lekki Phase1, Lagos.").getLocation());
    }
}
