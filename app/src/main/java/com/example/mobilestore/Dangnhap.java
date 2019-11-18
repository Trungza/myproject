package com.example.mobilestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dangnhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
    }

    public void click(View view) {

        switch (view.getId()){
            case R.id.btnDangki_Dangnhap:
                Intent intent=new Intent(Dangnhap.this,DangkiActivity.class);
                startActivity(intent);
                break;
            case R.id.btnDangnhp_dangnhap:
                Intent intent1=new Intent(Dangnhap.this,ManHinhChinh.class);
                startActivity(intent1);
                break;
        }
    }
}
