package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewInvitesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_invites);

        TextView textView = (TextView) findViewById(R.id.textViewTitle);
        textView.setText("VIEW INVITES");

        Intent intent = getIntent();
        String sExtra = "Welcome " + intent.getStringExtra("username") + "!";

        textView = (TextView) findViewById(R.id.textViewWelcome);
        textView.setText(sExtra);
    }

    public void back(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("username", getIntent().getStringExtra("username"));
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
