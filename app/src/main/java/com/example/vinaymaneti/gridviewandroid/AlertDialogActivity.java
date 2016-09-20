package com.example.vinaymaneti.gridviewandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        Intent intent = getIntent();
        if (intent != null) {
            int flagImageAlert = intent.getIntExtra(MainActivity.COUNTRYIMAGE, R.drawable.icon_australia_5);
            String flagCountryNameAlert = intent.getStringExtra(MainActivity.COUNTRYNAME);
            ImageView imageView = (ImageView) findViewById(R.id.alertImageView);
            TextView textView = (TextView) findViewById(R.id.alertDialogTextView);
            imageView.setImageResource(flagImageAlert);
            textView.setText("This Flag belong's to :" + " "+flagCountryNameAlert);
        }
    }

    public void closeAlertDialog(View view) {
        finish();
    }
}
