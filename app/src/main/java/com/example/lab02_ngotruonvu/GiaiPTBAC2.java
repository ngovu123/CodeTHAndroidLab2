package com.example.lab02_ngotruonvu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GiaiPTBAC2 extends AppCompatActivity {

    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextC;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_ptbac2);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        editTextC = findViewById(R.id.editTextC);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateQuadraticEquation(View view) {
        double a = Double.parseDouble(editTextA.getText().toString());
        double b = Double.parseDouble(editTextB.getText().toString());
        double c = Double.parseDouble(editTextC.getText().toString());

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            textViewResult.setText("Nghiệm 1 (x1): " + root1 + ", Nghiệm 2 (x2): " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            textViewResult.setText("Nghiệm kép (x): " + root);
        } else {
            textViewResult.setText("Phương trình vô nghiệm");
        }
    }
}
