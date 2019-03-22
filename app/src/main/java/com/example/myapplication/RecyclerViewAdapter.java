package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<Card_Class> mDate;

    public RecyclerViewAdapter(Context context, List<Card_Class> mDate) {
        this.context = context;
        this.mDate = mDate;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        view = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.name_of_card.setText(mDate.get(i).getTextView_Name());
        myViewHolder.imge.setImageResource(mDate.get(i).getImageView_Card());
        myViewHolder.price.setText(mDate.get(i).getTextView_price());

    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imge;
        private TextView name_of_card, price, carrnse_name;

        public MyViewHolder( View itemView) {
            super(itemView);

            imge = itemView.findViewById(R.id.card_image);
            name_of_card = itemView.findViewById(R.id.card_name);
            price        = itemView.findViewById(R.id.card_price);
            carrnse_name = itemView.findViewById(R.id.carrnce_name);
        }
    }
}
