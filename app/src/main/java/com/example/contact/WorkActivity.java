package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> work=new ArrayList<>();
        work.add(new ContactModel("WA","WA@gamil.com", "9000000021"));
        work.add(new ContactModel("WB","WB@gamil.com", "9000000022"));
        work.add(new ContactModel("WC","WC@gamil.com", "9000000023"));
        work.add(new ContactModel("WD","WD@gamil.com", "9000000024"));
        work.add(new ContactModel("WE","WE@gamil.com", "9000000025"));
        work.add(new ContactModel("WF","WF@gamil.com", "9000000026"));
        work.add(new ContactModel("WG","WG@gamil.com", "9000000027"));
        work.add(new ContactModel("WH","WH@gamil.com", "9000000028"));
        work.add(new ContactModel("WI","WI@gamil.com", "9000000029"));
        work.add(new ContactModel("WJ","WJ@gamil.com", "9000000030"));

        RecyclerView work_recyclerView=findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,work,R.color.category_work);
        work_recyclerView.setAdapter(contactAdapter);
    }
}