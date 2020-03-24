package com.example.dues;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Lent_Fragment extends Fragment {

    View view;
    RecyclerView borrowedRecyclerView;
    ArrayList<PersonAmountCard> personAmountCards = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_lent__fragment,container,false);
        borrowedRecyclerView = (RecyclerView) view.findViewById(R.id.borrowedRV);
        String[] products = {"pizza","burger"};
        String[] dates = {"02/02/2020","03/02/2020"};
        String[] amounts = {"250","50"};
        for(int i=0;i<2;i++)
        {
            personAmountCards.add(new PersonAmountCard(dates[i],amounts[i],products[i]));
        }
        borrowedRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CardRVAdapter adapter = new CardRVAdapter(personAmountCards,getActivity());
        borrowedRecyclerView.setAdapter(adapter);
        return view;
    }
}
