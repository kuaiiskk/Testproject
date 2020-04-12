package com.example.weightcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    private TextView tvShowTall;
    String sex;
    double tall;
    double weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        getDate();
        initViews();
        binData();
    }
    private void getDate(){
        Bundle bundle=getIntent().getExtras();
        sex=bundle.getString("sex");
        tall=bundle.getDouble("tall");
        if(sex.equals("男"))
            weight=(tall-80)*0.7;
        else
            weight=(tall-70)*0.6;
    }
    private void initViews(){
        tvShowTall=(TextView)findViewById(R.id.tvShowTall);
    }
    private void binData(){
        tvShowTall.setText("一位身高为"+tall+"cm的"+sex+"性的标准体重是"+weight+"kg。");
    }
}
