package com.example.lat1_akbif9_10116402_ahmaddinarnugraha;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lat1_akbif9_10116402_ahmaddinarnugraha.R.id.custom_button3;

public class biodata2 extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata);

        t= (TextView) findViewById(R.id.textView4);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont);

        t= (TextView) findViewById(R.id.textView9);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont2);

        t= (TextView) findViewById(R.id.custom_button3);
        Typeface myCustomFont3=Typeface.createFromAsset(getAssets(),"fonts/nunito_bold.ttf");
        t.setTypeface(myCustomFont3);

        Button btn = (Button) findViewById(custom_button3);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i2 = new Intent(getApplicationContext(),logincodedua.class);
                        startActivity(i2);
                    }
                });
    }
}
