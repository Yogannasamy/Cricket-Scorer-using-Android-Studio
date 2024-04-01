package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class playerSelectionActivity extends AppCompatActivity {

    EditText strikerEditText, nonStrikerEditText, bowlerEditText;
    Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_selection);

        // Initialize UI elements
        strikerEditText = findViewById(R.id.openingStriker);
        nonStrikerEditText = findViewById(R.id.openingNonStriker);
        bowlerEditText = findViewById(R.id.opwningBowler);
        confirmButton = findViewById(R.id.button);

        // Retrieve default values from intent extras (if any)
        String defaultStriker = getIntent().getStringExtra("defaultStriker");
        String defaultNonStriker = getIntent().getStringExtra("defaultNonStriker");
        String defaultBowler = getIntent().getStringExtra("defaultBowler");

        // Set default values in the EditText fields
        strikerEditText.setText(defaultStriker);
        nonStrikerEditText.setText(defaultNonStriker);
        bowlerEditText.setText(defaultBowler);

        // Handle confirm button click
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get selected names from EditText fields
                String selectedStriker = strikerEditText.getText().toString();
                String selectedNonStriker = nonStrikerEditText.getText().toString();
                String selectedBowler = bowlerEditText.getText().toString();

                // Pass selected names back to the calling activity
                Intent resultIntent = new Intent();
                resultIntent.putExtra("selectedStriker", selectedStriker);
                resultIntent.putExtra("selectedNonStriker", selectedNonStriker);
                resultIntent.putExtra("selectedBowler", selectedBowler);
                setResult(RESULT_OK, resultIntent);
                finish(); // Finish the activity and return to the calling activity
            }
        });
    }
}
