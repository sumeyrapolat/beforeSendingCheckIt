package com.sumeyra.writeandforget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class seeWhatUWrite extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_what_uwrite);
        textView=findViewById(R.id.textView);
        Intent intent = getIntent();
        String message =intent.getStringExtra("YourMessage");
        textView.setText(message);
    }
    public void clickMeAgain(View view ){
        Intent intent= new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


}


