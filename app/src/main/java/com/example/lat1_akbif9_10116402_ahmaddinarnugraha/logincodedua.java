package com.example.lat1_akbif9_10116402_ahmaddinarnugraha;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lat1_akbif9_10116402_ahmaddinarnugraha.R.id.custom_button5;

public class logincodedua extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logincode);

        t= (TextView) findViewById(R.id.custom_button2);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont);

        t= (TextView) findViewById(R.id.custom_button5);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont1);

        t= (TextView) findViewById(R.id.textView5);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont2);

        t= (TextView) findViewById(R.id.textView6);
        Typeface myCustomFont3=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont3);

        t= (TextView) findViewById(R.id.textView2);
        Typeface myCustomFont4=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont4);

        t= (TextView) findViewById(R.id.textView7);
        Typeface myCustomFont5=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont5);

        Button btn = (Button) findViewById(custom_button5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(getApplicationContext(),sayhaidua.class);
                startActivity(i3);
            }
        });
    }
}
