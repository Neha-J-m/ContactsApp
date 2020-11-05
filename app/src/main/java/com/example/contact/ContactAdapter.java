package com.example.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>{

    private Context context;
    private List<ContactModel> contactModelList;
    private int colorResId;

    public ContactAdapter(Context context, List<ContactModel> list, int colorResId){

        this.context=context;
        this.contactModelList=list;
        this.colorResId=colorResId;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list_items, parent, false);
        ContactViewHolder contactViewHolder=new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.name.setText(contactModelList.get(position).getName());
        holder.gmail.setText(contactModelList.get(position).getGmail());
        holder.phno.setText(contactModelList.get(position).getPhno());
        int color= ContextCompat.getColor(context, colorResId);
        holder.textContainer.setBackgroundColor(color);
    }

    @Override
    public int getItemCount() {
        return contactModelList.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{

        TextView name, gmail, phno;
        ImageView image;
        View textContainer;

        public ContactViewHolder(View itemview) {
            super(itemview);
            name= itemview.findViewById(R.id.tv1);
            gmail=itemview.findViewById(R.id.tv2);
            phno=itemview.findViewById(R.id.tv3);
            image=itemview.findViewById(R.id.image);
            textContainer=itemView.findViewById(R.id.text_container);
        }
    }
}

