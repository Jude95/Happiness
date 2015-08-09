package com.jude.happiness.module.wedding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.beam.nucleus.view.NucleusFragment;
import com.jude.happiness.R;
import com.jude.happiness.model.WeddingModel;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
@RequiresPresenter(WeddingPresenter.class)
public class WeddingFragment extends NucleusFragment<WeddingPresenter> {
    @InjectView(R.id.imageList)
    GridView imageList;
    @InjectView(R.id.send)
    Button send;
    @InjectView(R.id.scaleList)
    GridView scaleList;

    public static final String[] ScanType = new String[]{
            "少于50人", "50-100人", "100-200人", "200-300人", "300-500人", "多于500人"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wedding_fragment, container, false);
        ButterKnife.inject(this, view);
        imageList.setAdapter(new WeddingAdapter(getActivity(), WeddingModel.getInstance().getWeddingType()));
        scaleList.setAdapter(new ScaleAdapter(getActivity(),ScanType));
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
