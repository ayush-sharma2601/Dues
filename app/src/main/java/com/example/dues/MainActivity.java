package com.example.dues;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView borrowed,lent;
    RecyclerView recyclerView;
    ArrayList<Person> personArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        attachID();
        String[] names = {"ayush","rishabh","pari","mihir","shivansh"};
        for (String name : names)
        {
            Person temp= new Person(name,R.drawable.person_icon);
            personArrayList.add(temp);
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        RVAdapter adapter = new RVAdapter(personArrayList,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    public void attachID(){
        borrowed = findViewById(R.id.borrowed_home_amount);
        lent = findViewById(R.id.lent_home_amount);
        recyclerView = findViewById(R.id.recyclerview);
    }
}
