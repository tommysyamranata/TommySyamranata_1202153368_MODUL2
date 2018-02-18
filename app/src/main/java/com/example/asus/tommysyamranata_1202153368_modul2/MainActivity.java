package com.example.asus.tommysyamranata_1202153368_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radiogroup;
    private RadioButton radiobutton1, radiobutton2;
    private Button buttonpesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogroup = (RadioGroup)findViewById(R.id.radiogroup);
        radiobutton1 = (RadioButton)findViewById(R.id.dinein);
        radiobutton2 = (RadioButton)findViewById(R.id.takeaway);
        buttonpesan = (Button)findViewById(R.id.pesansekarang);

        buttonpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedItem = radiogroup.getCheckedRadioButtonId();

                if(selectedItem == radiobutton1.getId()){
                    Intent intent = new Intent(MainActivity.this,Dinein.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"You choose Dine in",Toast.LENGTH_LONG).show();
                }else if(selectedItem == radiobutton2.getId()){
                    Intent intent2 = new Intent(MainActivity.this,TakeawayActivity.class);
                    startActivity(intent2);
                    Toast.makeText(MainActivity.this,"You Choose Take Away",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}