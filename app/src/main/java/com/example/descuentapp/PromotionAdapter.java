package com.example.descuentapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PromotionAdapter  extends BaseAdapter {

    Context context;

    private ArrayList<Promotion> promolist;

    public PromotionAdapter(Context context, ArrayList<Promotion> promolist) {
        this.context = context;
        this.promolist = promolist;
    }


    @Override
    public int getCount() {
        return promolist.size();
    }

    @Override
    public Object getItem(int position) {
        return promolist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context,R.layout.item_promotion,null);

        TextView Prom = (TextView) v.findViewById(R.id.tvPromotion);
        TextView local = (TextView) v.findViewById(R.id.tvLocal);

        Prom.setText(promolist.get(position).getPromotion());
        local.setText(promolist.get(position).getLocal().getLocal_name());

        return v;
    }
}
