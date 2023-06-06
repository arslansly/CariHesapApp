package com.arslan.dnetcarihesapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class satinAlmaclass extends AppCompatActivity {
    public EditText editText;
    public EditText editText1;
    public Button button;
    public ListView listView;
    public List<String> itemList;
    public ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satin_almaclass);

        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        button = findViewById(R.id.button);
        listView = findViewById(R.id.listView);
        itemList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = editText1.getText().toString();
                String text = editText.getText().toString();
                String toplamText = text + " - " + text1;
                itemList.add(toplamText);
                adapter.notifyDataSetChanged();
                editText.setText("");
                editText1.setText("");
            }
        });
    }


}