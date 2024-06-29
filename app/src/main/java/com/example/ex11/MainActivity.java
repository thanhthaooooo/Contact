package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter.DanhBaAdapter;
import com.example.model.DanhBa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhBa;

    DanhBaAdapter danhBaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        makeFakeData();

    }


    private void makeFakeData() {
        ArrayList<DanhBa> danhBaList = new ArrayList<>();

        danhBaList.add(new DanhBa("DanhBa1","2 - MBBank - Pham Thi Xuan Dieu", "0976538161"));
        danhBaList.add(new DanhBa("DanhBa2","4 - Hưng Gia - Nguyen Thi Phuong Oanh", "01638005675"));
        danhBaList.add(new DanhBa("DanhBa3","5- Hưng Gia - Cty TNHH Pham Lam", "0977419359"));
        danhBaList.add(new DanhBa("DanhBa4","7 - TPBank - Thai Anh Thu", "0977419359"));
        danhBaList.add(new DanhBa("DanhBa5","9 - HDBank - Chau Ngoc Diem", "0977419359"));


        danhBaAdapter.addAll(danhBaList);
    }


    private void addView() {
        lvDanhBa = findViewById(R.id.lvDanhBa);
        danhBaAdapter = new DanhBaAdapter(MainActivity.this,R.layout.list_view);
        lvDanhBa.setAdapter(danhBaAdapter);
    }
}