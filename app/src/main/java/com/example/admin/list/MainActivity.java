package com.example.admin.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //data source
        final String name[] = {"Ingrid", "Gracia","Devloper Android","Haitian","Thomondoise","Adress","Tamarin city","#1"};


        //Adapter
        ArrayAdapter<String> nameAdapter = new ArrayAdapter<>(  this, android.R.layout.simple_list_item_1, name);

       final ListView lvName = findViewById(R.id.lvName);
        lvName.setAdapter(nameAdapter);

        //click listener
      lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(MainActivity.this, name[position], Toast.LENGTH_SHORT).show();
          }
      });
            }
        }





