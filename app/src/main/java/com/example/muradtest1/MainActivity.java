package com.example.muradtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        Button btn1 = findViewById(R.id.btn1);
        TextView tv1 = findViewById(R.id.tv1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ans = Float.parseFloat(et1.getText().toString()) + Float.parseFloat(et2.getText().toString());
                tv1.setText(ans+"");
            }
        });
    }
}