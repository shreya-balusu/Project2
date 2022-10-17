package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        TextView textView = (TextView) findViewById(R.id.textViewTitle);
        textView.setText("LOGIN");
    }

    public void login(View view){
        EditText editView = (EditText) findViewById(R.id.editTextUsername);
        String sExtra = editView.getText().toString();

        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("username", sExtra);

        startActivity(intent);
    }
}