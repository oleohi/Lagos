package com.example.lagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LCCActivity extends AppCompatActivity {
    ImageView imageView;
    TextView info1, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcc);

        imageView = (ImageView) findViewById(R.id.ivImage);
        info1 = (TextView) findViewById(R.id.tvInfo1);
        location = (TextView) findViewById(R.id.tvLocation);
        location.setText(new Attraction("Location: Lekki Conservation Centre Rd, Eti-Osa, Lekki Peninsula, Lagos.").getLocation());
    }
}
