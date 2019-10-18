package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class k2Activity extends AppCompatActivity {
    Button s2,link2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k2);

        s2=(Button)findViewById(R.id.s2);
        link2=(Button)findViewById(R.id.link2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syn2=new Intent(k2Activity.this,syntax2Activity.class);
                startActivity(syn2);
            }
        });

        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/services.html?hl=id"));
                startActivity(l2);
            }
        });
    }
}