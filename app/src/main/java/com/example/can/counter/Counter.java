package com.example.can.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    TextView tv;
    Button Plus,Res;
    int Sayac=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tv=(TextView) findViewById(R.id.textView2);
        Plus=(Button)findViewById(R.id.IdPlus);
        Res=(Button)findViewById(R.id.IdRes);

        Plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                tv.setText(String.valueOf(Sayac++));
            }
        });
        Res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sayac=1;
                tv.setText("0");
            }
        });
    }
}
