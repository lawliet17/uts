package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button k1,k2,k3,k4,k5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        k1=(Button)findViewById(R.id.k1);
        k2=(Button)findViewById(R.id.k2);
        k3=(Button)findViewById(R.id.k3);
        k4=(Button)findViewById(R.id.k4);
        k5=(Button)findViewById(R.id.k5);

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this,K1Activity.class);
                startActivity(a);
            }
        });

        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(MainActivity.this,k2Activity.class);
                startActivity(b);
            }
        });

        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(MainActivity.this,k3Activity.class);
                startActivity(c);
            }
        });

        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d=new Intent(MainActivity.this,k4Activity.class);
                startActivity(d);
            }
        });

        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(MainActivity.this,k5Activity.class);
                startActivity(e);
            }
        });
    }
}
