package com.jude.happiness.module.wedding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.jude.happiness.R;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class ScaleAdapter extends ArrayAdapter<String> {
    private int target;

    public ScaleAdapter(Context context, String[] objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         View rootView = LayoutInflater.from(getContext()).inflate(
                 target == position ? R.layout.wedding_scan_force : R.layout.wedding_scan_unforce, parent, false);

        Button textView = (Button)rootView.findViewById(R.id.text);

//        TextView textView = new TextView(getContext());
//        textView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, JUtils.dip2px(48)));
        textView.setText(getItem(position));
//        textView.setBackgroundResource(target == position ? R.drawable.button_force:R.drawable.button_unforce);
        textView.setOnClickListener(v -> select(position));
        return textView;
    }

    private void select(int position){
        target = position;
        notifyDataSetChanged();
    }
}
