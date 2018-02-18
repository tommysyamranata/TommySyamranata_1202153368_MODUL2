package com.example.asus.tommysyamranata_1202153368_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarmenuActivity extends AppCompatActivity {
    public static ArrayList<Menu> menuList = new ArrayList<>();

    private RecyclerView recyclerView;
    private MenusAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MenusAdapter(menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }



    public ArrayList<Menu> isiMenu(){
        ArrayList<Menu> data = new ArrayList<>();

        data.add(new Menu(R.drawable.sotopadang,"soto padang", "Harga : Rp 95.000", "mix wagyu grade quality with coconut souce"));

        data.add(new Menu(R.drawable.nasipadangkomplit,"Nasi padang", "Harga : Rp 85.000","mix vegetable with beef rendang and chili sambal crecker"));



        return data;

    }
}
