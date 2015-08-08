package com.jude.happiness.module.wedding;

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
@RequiresPresenter(WeddingPresenter.class)
public class WeddingFragment extends NucleusFragment<WeddingPresenter> {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wedding_fragment,container,false);

        return view;
    }

}
