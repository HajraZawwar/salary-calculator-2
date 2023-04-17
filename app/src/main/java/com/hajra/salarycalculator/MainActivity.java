package com.hajra.salarycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    TextView netSal,Tax;
    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 = findViewById(R.id.editTextTextPersonName3);
        ed2 = findViewById(R.id.editTextNumberDecimal3);
        netSal = findViewById(R.id.textView18);
        Tax = findViewById(R.id.textView15);
        btn1 = findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double salary=0;
                try
                {
                    salary = Double.parseDouble(ed2.getText().toString());
                }
                catch(Exception E)
                {
                    Toast.makeText(MainActivity.this, "Please Enter Complete Data", Toast.LENGTH_SHORT).show();
                }
                double tax;

                if(salary > 50000)

                {
                    tax =  salary * 10/100;

                }

                else if(salary > 30000)
                {

                    tax =  salary * 5/100;
                }

                else
                {
                    tax = 0;
                }

                Tax.setText(String.valueOf(tax));
                double netsal = salary - tax;
                netSal.setText(String.valueOf(netsal));
            }
        });

    }
}