package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nbow extends AppCompatActivity {
    Button selectBowlerButton;
    EditText newBowlerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nbow);

        selectBowlerButton = findViewById(R.id.ok);
        newBowlerName = findViewById(R.id.nb1);

        selectBowlerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bowlerName = newBowlerName.getText().toString().trim();
                if (!bowlerName.isEmpty()) {
                    Intent intent = new Intent();
                    intent.putExtra("newBowlerName", bowlerName);
                    setResult(Activity.RESULT_OK, intent);
                    finish();
                } else {
                    Toast.makeText(nbow.this, "Please enter the new bowler's name", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}