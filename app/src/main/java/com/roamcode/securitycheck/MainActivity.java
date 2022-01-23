package com.roamcode.securitycheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnsearch;
    EditText txtDomain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDomain=findViewById(R.id.etdomain);
        btnsearch=findViewById(R.id.btnsearch);

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String domain=txtDomain.getText().toString().trim();
                Intent intent=new Intent(MainActivity.this,WebViewerCheck.class);
                intent.putExtra("domain",domain);
                startActivity(intent);
            }
        });


    }
}

