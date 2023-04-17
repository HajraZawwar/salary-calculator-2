package com.hajra.salarycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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








    }
}