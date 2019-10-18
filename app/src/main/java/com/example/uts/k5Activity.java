package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class k5Activity extends AppCompatActivity {
    Button s5,link5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k5);

        s5=(Button)findViewById(R.id.s5);
        link5=(Button)findViewById(R.id.link5);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syn5=new Intent(k5Activity.this,syntax5Activity.class);
                startActivity(syn5);
            }
        });

        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/intents-common?hl=id"));
                startActivity(l5);
            }
        });
    }
}
