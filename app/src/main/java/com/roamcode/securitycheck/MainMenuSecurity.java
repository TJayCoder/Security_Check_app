package com.roamcode.securitycheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuSecurity extends AppCompatActivity {


    Button webvul,vulrepo,adminpage,adminDirectory,databaseweakness,filetype,findertype,remoteDesktop,accessdoc,accessWebcam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_security);

        webvul=findViewById(R.id.btnWebVul);
        vulrepo=findViewById(R.id.btnVulrep);
        adminpage=findViewById(R.id.btnAccessAdmin);
        adminDirectory=findViewById(R.id.btnActiveDirectory);
        databaseweakness=findViewById(R.id.btndatabasePassword);
        filetype=findViewById(R.id.btnAccessType);
        findertype=findViewById(R.id.btncompanyFinder);
        remoteDesktop=findViewById(R.id.btnRemoteDesktop);
        accessdoc=findViewById(R.id.btnAccessDocument);
        accessWebcam=findViewById(R.id.btnAccessWebcam);

        findertype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,LinkedinFinder.class));
            }
        });

        accessWebcam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,WebCam.class));
            }
        });

        accessdoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,AccessDocument.class));
            }
        });

        remoteDesktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,RemoteDesktop.class));
            }
        });

        filetype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,AccessFileType.class));
            }
        });

        databaseweakness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,databaseWeakPassword.class));
            }
        });

        adminDirectory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,ActiveDirectory.class));
            }
        });

        adminpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,accessAdminPage.class));
            }
        });

        vulrepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,VulReport.class));
            }
        });

        webvul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuSecurity.this,MainActivity.class));
            }
        });

    }
}