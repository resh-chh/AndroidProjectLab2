package com.xyz.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etn1, etn2;
    Button btnplus, btnsub, btnmul, btndiv;
    TextView tvresult;
    int a, b, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn1= (EditText) findViewById(R.id.etn1);
        etn2= (EditText) findViewById(R.id.etn2);
        btnplus= (Button) findViewById(R.id.btnplus);
        btnsub= (Button) findViewById(R.id.btnsub);
        btnmul= (Button) findViewById(R.id.btnmul);
        btndiv= (Button) findViewById(R.id.btndiv);
        tvresult= (TextView) findViewById(R.id.tvresult);


            btnplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(etn1.getText().toString());
                    b = Integer.parseInt(etn2.getText().toString());

                    result = a + b;
                    tvresult.setText("result=" +result);

                }
            });

            btnsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(etn1.getText().toString());
                    b = Integer.parseInt(etn2.getText().toString());

                    result = a - b;
                    tvresult.setText("result=" +result);

                }
            });

            btnmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(etn1.getText().toString());
                    b = Integer.parseInt(etn2.getText().toString());

                    result = a * b;
                    tvresult.setText("result=" +result);

                }
            });

            btndiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = Integer.parseInt(etn1.getText().toString());
                    b = Integer.parseInt(etn2.getText().toString());

                    result = a / b;
                    tvresult.setText("result=" +result);

                }
            });


    }
}
