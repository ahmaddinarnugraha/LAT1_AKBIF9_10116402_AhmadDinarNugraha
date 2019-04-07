package com.example.lat1_akbif9_10116402_ahmaddinarnugraha;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lat1_akbif9_10116402_ahmaddinarnugraha.R.id.custom_button;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t= (TextView) findViewById(R.id.textView);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont);

        Button btn = (Button) findViewById(custom_button);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i1 = new Intent(getApplicationContext(),biodata2.class);
                        startActivity(i1);
                    }
                });
    }
}
