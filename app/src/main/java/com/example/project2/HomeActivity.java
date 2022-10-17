package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);

        TextView textView = (TextView) findViewById(R.id.textViewTitle);
        textView.setText("HOME");

        Intent intent = getIntent();
        String sExtra = "Welcome " + intent.getStringExtra("username") + "!";

        textView = (TextView) findViewById(R.id.textViewWelcome);
        textView.setText(sExtra);
    }

    public void profile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("username", getIntent().getStringExtra("username"));
        startActivity(intent);
    }

    public void postInvites(View view) {
        Intent intent = new Intent(this, PostInvitesActivity.class);
        intent.putExtra("username", getIntent().getStringExtra("username"));
        startActivity(intent);
    }

    public void viewInvites(View view) {
        Intent intent = new Intent(this, ViewInvitesActivity.class);
        intent.putExtra("username", getIntent().getStringExtra("username"));
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}