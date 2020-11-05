package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> friends=new ArrayList<>();
        friends.add(new ContactModel("FRA", "FRA@gamil.com", "9000000011"));
        friends.add(new ContactModel("FRB", "FRB@gamil.com", "9000000012"));
        friends.add(new ContactModel("FRC", "FRC@gamil.com", "9000000013"));
        friends.add(new ContactModel("FRD", "FRD@gamil.com", "9000000014"));
        friends.add(new ContactModel("FRE", "FRE@gamil.com", "9000000015"));
        friends.add(new ContactModel("FRF", "FRF@gamil.com", "9000000016"));
        friends.add(new ContactModel("FRG", "FRG@gamil.com", "9000000017"));
        friends.add(new ContactModel("FRH", "FRH@gamil.com", "9000000018"));
        friends.add(new ContactModel("FRI", "FRI@gamil.com", "9000000019"));
        friends.add(new ContactModel("FRJ", "FRJ@gamil.com", "9000000020"));

        RecyclerView friends_recyclerView=findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,friends,R.color.category_friends);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}