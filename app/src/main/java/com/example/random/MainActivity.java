package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView num;
    Button go;
    EditText ednum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=findViewById(R.id.num);
        go=findViewById(R.id.go);
        ednum=findViewById(R.id.ednum);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int a=1+random.nextInt(Integer.parseInt(ednum.getText().toString()));
                num.setText(""+a);

            }
        });
    }
}