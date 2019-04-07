package com.example.lat1_akbif9_10116402_ahmaddinarnugraha;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lat1_akbif9_10116402_ahmaddinarnugraha.R.id.custom_button4;

public class sayhaidua extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayhai);

        t= (TextView) findViewById(R.id.textView3);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont);

        t= (TextView) findViewById(R.id.custom_button4);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont1);

        Button btn = (Button) findViewById(custom_button4);
    }
}
