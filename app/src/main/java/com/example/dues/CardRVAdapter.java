package com.example.dues;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardRVAdapter extends RecyclerView.Adapter<CardRVAdapter.CardVH>{

    ArrayList<PersonAmountCard> personAmountCards = new ArrayList<>();
    Context context;

    public CardRVAdapter(ArrayList<PersonAmountCard> personAmountCards, Context context) {
        this.personAmountCards = personAmountCards;
        this.context = context;
    }

    @NonNull
    @Override
    public CardVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CardVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.person_amount_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CardVH holder, int position) {
        holder.populate(personAmountCards.get(position));
    }

    @Override
    public int getItemCount() {
        return personAmountCards.size();
    }


    public class CardVH extends RecyclerView.ViewHolder {
        private TextView product,date,amount;
        public CardVH(@NonNull View itemView) {
            super(itemView);
            product=itemView.findViewById(R.id.card_product);
            date = itemView.findViewById(R.id.card_date);
            amount = itemView.findViewById(R.id.card_amount);

        }

        public void populate(PersonAmountCard card){
            product.setText(card.getProduct());
            amount.setText(card.getAmount());
            date.setText(card.getDate());
        }
    }
}
