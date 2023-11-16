package com.sumeyra.writeandforget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    String messagesFromU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.editText);
        messagesFromU= "";


    }
    public void clickMe(View view){
        messagesFromU = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this,seeWhatUWrite.class);
        intent.putExtra("YourMessage",messagesFromU);
        startActivity(intent);

    }
}