package com.example.androidassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Calculate, Mode;
    private EditText et1, et2;
    private TextView et3;
    int i = 0;
    double a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        Calculate = (Button) findViewById(R.id.button2);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (TextView) findViewById(R.id.et3);
        Mode = (Button) findViewById(R.id.bt4);

    }
    public void mode_select (View view)
    {
        i=(i+1)%4;

        if (i ==0) {

            Mode.setText("MODE ADDITION");
        } else if (i == 1) {

            Mode.setText("MODE SUBTRACTION");
        } else if (i == 2) {

            Mode.setText("MODE MULTIPLICATION");
        } else {

            Mode.setText("MODE DIVISION");

        }

    }




    public void disp(View view) {

        double a1 = Double.valueOf(et1.getText().toString());
        double a2 = Double.valueOf(et2.getText().toString());
        if(i==0)
        {a3=a1+a2;}
        else if(i==1)
        {a3=a1-a2;}
        else if(i==2)
        {a3=a1*a2;}
        else
        {
            try{a3=a1/a2;}
            catch (Exception e){
                et3.setText("/ by zero");
                return;
            }
        }
        et3.setText(Double.toString(a3));
    }


}

