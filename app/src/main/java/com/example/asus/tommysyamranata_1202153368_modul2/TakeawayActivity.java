package com.example.asus.tommysyamranata_1202153368_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeawayActivity extends AppCompatActivity {
    private EditText name, phone, alamat, catatan;
    private Button pilihpesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);

        name = (EditText)findViewById(R.id.name);
        phone = (EditText)findViewById(R.id.phone);
        alamat = (EditText)findViewById(R.id.alamat);
        catatan = (EditText)findViewById(R.id.catatan);
        pilihpesanan = (Button)findViewById(R.id.pilihPesanan);

        pilihpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = name.getText().toString();
                String b = phone.getText().toString();
                String c = alamat.getText().toString();
                String d = catatan.getText().toString();

                if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty()){
                    Toast.makeText(TakeawayActivity.this,"Isi Data dengan Lengkap", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(TakeawayActivity.this,TakeawayActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(TakeawayActivity.this,"Silahkan Pilih Menu", Toast.LENGTH_LONG).show();
                    Intent intent2 = new Intent(TakeawayActivity.this,DaftarmenuActivity.class);
                    startActivity(intent2);
                }
            }
        });

    }


}