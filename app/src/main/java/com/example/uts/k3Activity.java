package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class k3Activity extends AppCompatActivity {
    Button s3,link3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k3);

        s3=(Button)findViewById(R.id.s3);
        link3=(Button)findViewById(R.id.link3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syn3=new Intent(k3Activity.this,syntax3Activity.class);
                startActivity(syn3);
            }
        });

        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/content/BroadcastReceiver.html?hl=id"));
                startActivity(l3);
            }
        });
    }
}
