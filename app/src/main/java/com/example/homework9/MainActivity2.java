package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView5);
        Intent intent = this.getIntent();
        String Str = intent.getStringExtra("Str");
        if(Str != null){
            textView.setText("A頁面輸入文字:"+Str);
        }
    }

    public void Aswitch(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName2);

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        intent.putExtra("Str",editText.getText().toString());
        startActivity(intent);
        MainActivity2.this.finish();
    }

}