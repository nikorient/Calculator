//Денисов 303
package com.example.calculator.denisov303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextA;
    EditText editTextB;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewResult = findViewById(R.id.textViewResult);

    }

    public void Calculate(View v) {
        Button button = (Button) v;
        String buttonText = button.getText().toString();

        String strA = editTextA.getText().toString();
        String strB = editTextB.getText().toString();

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        int c = 0;

        if (buttonText == getString(R.string.infoAdd)) {
            c = a + b;
        } else if (buttonText == getString(R.string.infoSub)) {
            c = a - b;
        } else if (buttonText == getString(R.string.infoMul)) {
            c = a * b;
        } else if (buttonText == getString(R.string.infoDiv)) {
            c = a / b;
        }

        String strResult = String.valueOf(c);
        textViewResult.setText(strResult);
    }
}
//Денисов 303