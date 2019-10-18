package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class K1Activity extends AppCompatActivity {
    Button s1,link1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k1);

        s1=(Button)findViewById(R.id.s1);
        link1=(Button)findViewById(R.id.link1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syn1=new Intent(K1Activity.this,syntax1Activity.class);
                startActivity(syn1);
            }
        });

        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/activities.html?hl=id"));
                startActivity(l1);
            }
        });
    }
}
