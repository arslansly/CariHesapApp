package com.arslan.dnetcarihesapapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Invoice> invoiceList;

    public CustomAdapter(Context context, ArrayList<Invoice> invoiceList) {
        this.context = context;
        this.invoiceList = invoiceList;
    }

    @Override
    public int getCount() {
        return invoiceList.size();
    }

    @Override
    public Object getItem(int position) {
        return invoiceList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null);
        }

        TextView invoiceNumberTextView = convertView.findViewById(R.id.invoiceNumberTextView);
        TextView invoiceDateTextView = convertView.findViewById(R.id.invoiceDateTextView);
        TextView invoiceCustomerTextView = convertView.findViewById(R.id.invoiceCustomerTextView);

        Invoice invoice = invoiceList.get(position);

        invoiceNumberTextView.setText(invoice.getInvoiceNumber());
        invoiceDateTextView.setText(invoice.getInvoiceDate());
        invoiceCustomerTextView.setText(invoice.getInvoiceCustomer());

        return convertView;
    }
}
