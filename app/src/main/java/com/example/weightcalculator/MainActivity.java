package com.example.weightcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etTall;
    private RadioButton rbMan;
    private RadioButton rbWoman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbMan = (RadioButton) findViewById(R.id.rbMan);
        rbWoman = (RadioButton) findViewById(R.id.rbWoman);
        etTall = (EditText) findViewById(R.id.etTall);
    }

    public void calculate(View view) {
        String sex;
        if (rbMan.isChecked())
            sex = rbMan.getText().toString();
        else
            sex = rbWoman.getText().toString();
        double tall = Double.parseDouble(etTall.getText().toString());
        Intent intent = new Intent();
        intent.setClass(this, ShowActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("sex", sex);
        bundle.putDouble("tall", tall);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
