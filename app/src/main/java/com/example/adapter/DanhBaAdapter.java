package com.example.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ex11.R;
import com.example.model.DanhBa;

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    Activity context;

    int resource;
    public DanhBaAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view =context.getLayoutInflater().inflate(resource, null);
        TextView txtName=view.findViewById(R.id.txtName);
        TextView txtNumberPhone=view.findViewById(R.id.txtNumberPhone);

        DanhBa danhba=getItem(position);
        txtName.setText(danhba.getName());
        txtNumberPhone.setText(danhba.getNumberPhone());

        return view;
    }
}
