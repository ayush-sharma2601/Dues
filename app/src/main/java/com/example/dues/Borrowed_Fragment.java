package com.example.dues;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Borrowed_Fragment extends Fragment {
    View view;
    RecyclerView borrowedRecyclerView;
    ArrayList<PersonAmountCard> personAmountCards = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_borrowed__fragment,container,false);
        borrowedRecyclerView = (RecyclerView) view.findViewById(R.id.borrowedRV);
        String[] products = {"pizza","burger","hoodie","pizza","NC"};
        String[] dates = {"02/02/2020","03/02/2020","04/02/2020","05/02/2020","06/02/2020"};
        String[] amounts = {"250","50","600","180","30"};
        for(int i=0;i<5;i++)
        {
            personAmountCards.add(new PersonAmountCard(dates[i],amounts[i],products[i]));
        }
        borrowedRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CardRVAdapter adapter = new CardRVAdapter(personAmountCards,getActivity());
        borrowedRecyclerView.setAdapter(adapter);
        return view;

    }
}
