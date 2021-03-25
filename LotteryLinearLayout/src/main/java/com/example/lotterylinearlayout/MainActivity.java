package com.example.lotterylinearlayout;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
// Apache Library needed for E-Mail Validation
import org.apache.commons.validator.routines.EmailValidator;

public class MainActivity extends AppCompatActivity {

    // GUI controls
    private EditText etName;
    private EditText etEmail;
    private Spinner spNumberTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Getting references to the EditText and the Spinner
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        spNumberTips = findViewById(R.id.spNumberTips);
    }

    public boolean validationName() {
        if (TextUtils.isEmpty(etName.getText().toString()))
            return false;
        else return true;
    }

    public boolean validationMail() {
        if (EmailValidator.getInstance().isValid(etEmail.getText().toString()))
            return true;
        else
            return false;

    }


    public boolean validationTips() {
        if (spNumberTips.getSelectedItemPosition() == 0)   // Default text "Select an item ..."
            return false;
        else return true;
    }


    public void validateEntries(View view) {
        if (validationName() && validationMail() && validationTips()) {
            Toast.makeText(getApplicationContext(), "Valid entries! Thank you!", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "No valid entries! Check name, E-Mail and tips!", Toast.LENGTH_LONG).show();
        }
    }
}
