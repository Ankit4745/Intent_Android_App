package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button);
        textView= findViewById(R.id.textview);

        String myvalue = getIntent().getStringExtra("name");
        textView.setText(myvalue);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,"For Exit You Have To Perss Back Button Min 3 Times."
                        ,Toast.LENGTH_LONG).show();
                Intent intent =new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}