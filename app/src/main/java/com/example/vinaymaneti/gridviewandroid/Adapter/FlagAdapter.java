package com.example.vinaymaneti.gridviewandroid.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.vinaymaneti.gridviewandroid.R;
import com.example.vinaymaneti.gridviewandroid.ViewHolder.FlagNameViewHolder;
import com.example.vinaymaneti.gridviewandroid.helper.FlagRow;

import java.util.ArrayList;

/**
 * Created by vinaymaneti on 6/13/16.
 */
public class FlagAdapter extends BaseAdapter {

    Context context;

    ArrayList<FlagRow> flagRows;

    public FlagAdapter(Context context) {
        this.context = context;
        flagRows = new ArrayList<>();
        Resources resources = context.getResources();
        String[] countryNamesArray = resources.getStringArray(R.array.country_names);
        int[] countryFlagImages = {
                R.drawable.icon_india_1,
                R.drawable.icon_germany_2,
                R.drawable.icon_vietnam_3,
                R.drawable.icon_china_4,
                R.drawable.icon_australia_5,
                R.drawable.icon_bangladesh_6,
                R.drawable.icon_pakistan_7,
                R.drawable.icon_srilanka_8,
                R.drawable.icon_usa_9,
                R.drawable.icon_south_africa_10,
        };

        for (int i = 0; i < 10; i++) {
            flagRows.add(new FlagRow(countryFlagImages[i], countryNamesArray[i]));
        }

    }

    @Override
    public int getCount() {
        return flagRows.size();
    }

    @Override
    public Object getItem(int position) {
        return flagRows.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        FlagNameViewHolder flagNameViewHolder = null;
        if (row == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.single_row, parent, false);
            flagNameViewHolder = new FlagNameViewHolder(row);
            row.setTag(flagNameViewHolder);
        } else {
            flagNameViewHolder = (FlagNameViewHolder) row.getTag();
        }

        FlagRow flagRowData = flagRows.get(position);
        flagNameViewHolder.imageFlagView.setImageResource(flagRowData.images);
        flagNameViewHolder.countryNameTextView.setText(flagRowData.countryNames);
        flagNameViewHolder.imageFlagView.setTag(flagRowData);
        return row;
    }
}
