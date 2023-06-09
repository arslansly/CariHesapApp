package com.arslan.dnetcarihesapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;




public class satinAlmaclass extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter customAdapter;
    private ArrayList<Invoice> invoiceList;
    private EditText invoiceNumberEditText;
    private EditText invoiceDateEditText;
    private EditText invoiceCustomerEditText;
    private Button addButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satin_almaclass);

        listView = findViewById(R.id.listView);
        invoiceNumberEditText = findViewById(R.id.invoiceNumberEditText);
        invoiceDateEditText = findViewById(R.id.invoiceDateEditText);
        invoiceCustomerEditText = findViewById(R.id.invoiceCustomerEditText);
        addButton = findViewById(R.id.addButton);
        invoiceList = new ArrayList<>();

        // Fatura örnek verilerini oluştur
        Invoice invoice1 = new Invoice("Fatura 1", "01/06/2023", "Müşteri 1");
        Invoice invoice2 = new Invoice("Fatura 2", "02/06/2023", "Müşteri 2");
        Invoice invoice3 = new Invoice("Fatura 3", "03/06/2023", "Müşteri 3");

        // Fatura örnek verilerini listeye ekle
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);
        invoiceList.add(invoice3);

        customAdapter = new CustomAdapter(this, invoiceList);
        listView.setAdapter(customAdapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kullanıcının girdiği bilgileri al
                String invoiceNumber = invoiceNumberEditText.getText().toString();
                String invoiceDate = invoiceDateEditText.getText().toString();
                String invoiceCustomer = invoiceCustomerEditText.getText().toString();

                // Yeni bir fatura oluştur
                Invoice newInvoice = new Invoice(invoiceNumber, invoiceDate, invoiceCustomer);

                // Listeye ekle ve yenile
                invoiceList.add(newInvoice);
                customAdapter.notifyDataSetChanged();

                // Girdi alanlarını temizle
                invoiceNumberEditText.setText("");
                invoiceDateEditText.setText("");
                invoiceCustomerEditText.setText("");
            }
        });
    }

}

