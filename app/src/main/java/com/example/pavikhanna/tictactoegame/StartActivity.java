package com.example.pavikhanna.tictactoegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    Button start;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        start = findViewById(R.id.start);
        editText = findViewById(R.id.editText);

    }

    public void startGame(View view)
    {

        String name = editText.getText().toString();
        Intent intent = new Intent(this,MainActivity.class);

        intent.putExtra("name",name);
        startActivity(intent);
    }

}
