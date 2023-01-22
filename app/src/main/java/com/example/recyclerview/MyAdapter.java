package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import org.w3c.dom.Text;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Datamodel [] ListData;

    public MyAdapter(Datamodel[] ListData) {
        this.ListData = ListData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View listitem = inflater.inflate(R.layout.item,parent,false);
        ViewHolder viewHolder= new ViewHolder(listitem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Datamodel myListData = ListData[position];
        holder.textView.setText(ListData[position].getTitle());
        holder.imageView.setImageResource(ListData[position].getImage());

    }

    @Override
    public int getItemCount() {
        return ListData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageViewRecycle);
            this.textView = itemView.findViewById(R.id.textview);
        }

    }
}
