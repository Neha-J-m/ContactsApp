package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> family=new ArrayList<>();
        family.add(new ContactModel("FA", "FA@gmail.com", "9000000001"));
        family.add(new ContactModel("FA", "FB@gmail.com", "9000000002"));
        family.add(new ContactModel("FC", "FC@gmail.com", "9000000003"));
        family.add(new ContactModel("FD", "FD@gmail.com", "9000000004"));
        family.add(new ContactModel("FE", "FE@gmail.com", "9000000005"));
        family.add(new ContactModel("FF", "FF@gmail.com", "9000000006"));
        family.add(new ContactModel("FG", "FG@gmail.com", "9000000007"));
        family.add(new ContactModel("FH", "FH@gmail.com", "9000000008"));
        family.add(new ContactModel("FI", "FI@gmail.com", "9000000009"));
        family.add(new ContactModel("FJ", "FJ@gmail.com", "9000000010"));

        RecyclerView family_recyclerView=findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,family,R.color.category_family);
        family_recyclerView.setAdapter(contactAdapter);
    }
}