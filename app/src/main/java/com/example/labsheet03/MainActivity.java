package com.example.labsheet03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

// IT18233704 N.R Yamasinghe
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.labsheet03.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Called when the user taps the Send button
    public void sendMessage(View view) {

        // response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        // Message pass as an extra
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
