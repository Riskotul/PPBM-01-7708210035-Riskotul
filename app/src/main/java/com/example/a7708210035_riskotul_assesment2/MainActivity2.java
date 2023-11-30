package com.example.a7708210035_riskotul_assesment2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView list = (ListView) findViewById(R.id.ListView);

        String[] namaMakanan = {"pizza","pop mie","burger","kue","kentang","pancake","pasta","mie ayam","bakso","cilok","tahu gejrot","es kelapa","lumpia basah","martabak","ketorpak","es teh 3000","cilor","batagor","siomay"};

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namaMakanan);

        list.setAdapter(myAdapter);
    }
}