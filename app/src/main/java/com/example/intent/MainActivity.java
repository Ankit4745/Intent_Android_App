package com.example.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
    }


    public void Activity(View view) {
        Toast.makeText(MainActivity.this,"Data has been saved."
                ,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);

         String value = editText.getText().toString();

         if(value.length() ==0){
             editText.setError(" no value");

         }
         else {
              intent = new Intent(MainActivity.this,MainActivity2.class);
             intent.putExtra("name", value);

         }
        startActivity(intent);
    }
}