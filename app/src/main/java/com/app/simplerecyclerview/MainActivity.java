package com.app.simplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    String countryList[]={"Bangladesh","India","China","Australia","America","New Zealand","Portugal"};
    int imgList[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.australia,R.drawable.america,R.drawable.new_zealand,R.drawable.portugle};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of RecyclerView
        recyclerView = findViewById(R.id.recycler_view);

        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());


        // set a LinearLayoutManager with default Horizontal orientation
       // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);


        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,countryList, imgList);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView


    }
}
