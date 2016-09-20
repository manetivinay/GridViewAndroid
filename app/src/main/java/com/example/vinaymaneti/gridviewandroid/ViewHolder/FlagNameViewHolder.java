package com.example.vinaymaneti.gridviewandroid.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinaymaneti.gridviewandroid.R;

/**
 * Created by vinaymaneti on 6/13/16.
 */
public class FlagNameViewHolder {

    public ImageView imageFlagView;
    public TextView countryNameTextView;

    public FlagNameViewHolder(View view) {
        imageFlagView = (ImageView) view.findViewById(R.id.imageViewFlag);
        countryNameTextView = (TextView) view.findViewById(R.id.countryNameTextView);
    }

}
