package com.example.mobilestore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mobilestore.Adapter.Home_Adapter;

import java.util.ArrayList;
import java.util.List;

public class ManHinhChinh extends AppCompatActivity {
RecyclerView recyclerView;
Home_Adapter home_adapter;
List<Home> homeList = new ArrayList<>();
RecyclerView recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);
        Loaddata();
        recyclerView =   findViewById(R.id.recycleView_Home);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false );
        recyclerView.setLayoutManager(layoutManager);
        home_adapter = new Home_Adapter(ManHinhChinh.this,homeList);
        recyclerView.setAdapter(home_adapter);

        recyclerView1 =   findViewById(R.id.recycleView_Home1);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false );
        recyclerView1.setLayoutManager(layoutManager1);
        home_adapter = new Home_Adapter(ManHinhChinh.this,homeList);
        recyclerView1.setAdapter(home_adapter);
    }
    private void Loaddata(){
        Home  home =new Home("iphone6","200000vnd");
        Home  home1 =new Home("iphone7","300000vnd");
        Home  home2 =new Home("iphone8","4000000vnd");
        homeList.add(home);
        homeList.add(home1);
        homeList.add(home2);

    }


}
