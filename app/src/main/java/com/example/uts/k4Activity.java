package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class k4Activity extends AppCompatActivity {
    Button s4,link4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k4);

        s4=(Button)findViewById(R.id.s4);
        link4=(Button)findViewById(R.id.link4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syn4=new Intent(k4Activity.this,syntax4Activity.class);
                startActivity(syn4);
            }
        });

        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/providers/content-providers.html?hl=id"));
                startActivity(l4);
            }
        });
    }
}
