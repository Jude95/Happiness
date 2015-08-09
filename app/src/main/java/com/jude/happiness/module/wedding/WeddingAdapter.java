package com.jude.happiness.module.wedding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jude.happiness.R;
import com.jude.happiness.model.bean.WeddingType;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class WeddingAdapter extends ArrayAdapter<WeddingType> {
    private int target = 0;

    public WeddingAdapter(Context context,  WeddingType[] objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.wedding_item_type,parent,false);
        ImageView image = (ImageView) v.findViewById(R.id.image);
        image.setImageURI(getItem(position).getImage());
        TextView name = (TextView) v.findViewById(R.id.name);
        name.setText(getItem(position).getName());
        ImageView select = (ImageView) v.findViewById(R.id.select);
        select.setImageResource(position == target?R.drawable.wed_sty_selected:R.drawable.wed_sty_noselect);
        v.setOnClickListener(v1 -> {
            select(position);
        });
        return v;
    }

    private void select(int position){
        target = position;
        notifyDataSetChanged();
    }
}
