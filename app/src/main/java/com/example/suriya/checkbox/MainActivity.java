package com.example.suriya.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    CheckBox c1,c2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.txt);
        c1 = findViewById(R.id.cb1);
        c2 = findViewById(R.id.cb2);
        b  = findViewById(R.id.btn1);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int totalAmount = 0;
        StringBuilder sb = new StringBuilder();

        if (c1.isChecked()){
            sb.append("Tiffin");
            totalAmount+=100;

        }
         if (c2.isChecked()){

            sb.append("Lunch");
            totalAmount+=150;
        }

        sb.append(" total  " + totalAmount+" RS");

        Toast.makeText(getApplicationContext(),sb.toString(),Toast.LENGTH_LONG).show();
    }

    private void Testupload(){

        int i= 1+1;
        int ii= 2+2;
        int iii =  i+ii;

    }
}
