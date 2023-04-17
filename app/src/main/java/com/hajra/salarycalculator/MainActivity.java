package com.hajra.salarycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.empname);
        ed2=findViewById(R.id.empsal);
        ed3=findViewById(R.id.emptax);
        ed1=findViewById(R.id.salary);
        btn1=findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                empsal();
            }

            }
        });

        public void empsal()
        {

            double salary = Double.parseDouble(ed2.getText().toString());
            double tax, nsal;

            if (salary> 500000)
            {
                tax= salary * 10/100;
            }

            else if(salary > 1000000 )
            {
                tax= salary * 20/100;
            }

            else
            {  tax= 0;

            }

            ed3.setText(String.valueOf(tax));

            nsal= salary-tax;

            ed4.setText(String.valueOf(nsal));
        }