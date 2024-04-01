package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nbat_bowl extends AppCompatActivity {

    EditText newBatsmanName;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nbat_bowl);

        newBatsmanName = findViewById(R.id.nb1);
        submitButton = findViewById(R.id.ok);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String batsmanName = newBatsmanName.getText().toString().trim();
                if (!batsmanName.isEmpty()) {
                    Intent intent = new Intent();
                    intent.putExtra("newBatsmanName", batsmanName);
                    setResult(Activity.RESULT_OK, intent);
                    finish();
                } else {
                    Toast.makeText(nbat_bowl.this, "Please enter the new batsman's name", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}