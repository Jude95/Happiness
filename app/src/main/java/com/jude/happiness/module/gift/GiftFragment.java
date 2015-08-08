package com.jude.happiness.module.gift;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.beam.nucleus.view.NucleusFragment;
import com.jude.happiness.R;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
@RequiresPresenter(GiftPresenter.class)
public class GiftFragment extends NucleusFragment<GiftPresenter> {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.trends_fragment,container,false);

        return view;
    }

}
