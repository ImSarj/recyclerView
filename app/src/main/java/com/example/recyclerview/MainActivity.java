package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();


    }

    private void initData() {

        userList=new ArrayList<>();

        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
        userList.add(new ModelClass(R.drawable.ye,"Kanye","Contributions: 69","Followers: 420"));
    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}