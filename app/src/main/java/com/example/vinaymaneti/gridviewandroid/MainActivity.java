package com.example.vinaymaneti.gridviewandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.vinaymaneti.gridviewandroid.Adapter.FlagAdapter;
import com.example.vinaymaneti.gridviewandroid.ViewHolder.FlagNameViewHolder;
import com.example.vinaymaneti.gridviewandroid.helper.FlagRow;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static final String COUNTRYIMAGE = "countryImage";
    public static final String COUNTRYNAME = "countryName";

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new FlagAdapter(this));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, AlertDialogActivity.class);
        FlagNameViewHolder flagNameViewHolder = (FlagNameViewHolder) view.getTag();
        FlagRow flagRow = (FlagRow) flagNameViewHolder.imageFlagView.getTag();
        intent.putExtra(COUNTRYIMAGE,flagRow.images);
        intent.putExtra(COUNTRYNAME,flagRow.countryNames);
        startActivity(intent);
    }
}
