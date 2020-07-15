package com.example.descuentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PrincipalActivity extends AppCompatActivity {

    ListView lvPromotion;
    ArrayList<Promotion> promos = new ArrayList<Promotion>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lvPromotion = (ListView) findViewById(R.id.lvPromotions_list);



        Local local1 = new Local("BarXXX","Iztacalco, agricola oriental","wwww.algo.com");

        Local local2 = new Local("Restaurante","Iztacalco, agricola oriental","wwww.algo.com");
        Local local3 = new Local("Teibol","Iztacalco, agricola oriental","wwww.algo.com");
        Local local4 = new Local("Billar","Iztacalco, agricola oriental","wwww.algo.com");

        Promotion prom1 = new Promotion("Cubeta","Cubeta 2x1",local1);
        Promotion prom2 = new Promotion("carne","2x1",local2);
        Promotion prom3 = new Promotion("una ruca","gratis",local3);
        Promotion prom4 = new Promotion("una mesa","hora 2x1",local4);

        promos.add(prom1);
        promos.add(prom2);
        promos.add(prom3);
        promos.add(prom4);

        PromotionAdapter adapter = new PromotionAdapter(getApplicationContext(),promos);

        lvPromotion.setAdapter(adapter);

        lvPromotion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(PrincipalActivity.this,ItemActivity.class);
                //Toast.makeText(PrincipalActivity.this,"id : "+promos.get(position).getPromotion(),Toast.LENGTH_SHORT).show();
                Log.d(getResources().getString(R.string.logPrincipal),getResources().getString(R.string.logPrincipal_item)+promos.get(position).getPromotion());
                Bundle bundle = new Bundle();
                bundle.putSerializable(getResources().getString(R.string.key_item),promos.get(position));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
