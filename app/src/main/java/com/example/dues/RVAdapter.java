package com.example.dues;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVViewHolder> {

    ArrayList<Person> personArrayList = new ArrayList<>();
    Context context;

    public RVAdapter(ArrayList<Person> personArrayList, Context context) {
        this.personArrayList = personArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RVViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.person_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder holder, int position) {
        holder.populate(personArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public class RVViewHolder extends RecyclerView.ViewHolder {

        private ImageView person_image;
        private TextView name;
        public RVViewHolder(@NonNull final View itemView) {
            super(itemView);
            person_image = itemView.findViewById(R.id.person_icon);
            name = itemView.findViewById(R.id.person_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(context,"clicked",Toast.LENGTH_LONG).show();
                    Intent goToPerson = new Intent(context,Person_page.class);
                    goToPerson.putExtra("person",name.getText().toString());
                    context.startActivity(goToPerson);

                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    Toast.makeText(context,"Delete code",Toast.LENGTH_SHORT).show();
                    return false;
                }
            });


        }

        public void populate(Person person) {
            name.setText(person.getName());
            person_image.setImageResource(person.getImgID());

        }
    }
}
