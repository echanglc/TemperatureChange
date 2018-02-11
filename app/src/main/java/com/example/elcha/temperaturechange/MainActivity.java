package com.example.elcha.temperaturechange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private SeekBar sbCelsius;
    private SeekBar sbF;
    private TextView tvCdegree;
    private TextView tvFdegree;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sbCelsius = (SeekBar)findViewById(R.id.sbCelsius);
        sbF = (SeekBar)findViewById(R.id.sbF);
        tvCdegree = (TextView)findViewById(R.id.tvCdegree);
        tvFdegree = (TextView)findViewById(R.id.tvFdegree);
        sbCelsius.setMax(214);
        sbF.setMax(83);
        sbCelsius.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (i < 32)
                    tvCdegree.setText(String.valueOf(i));
                else
                    tvCdegree.setText(String.valueOf((i - 32)*5/9));



                sbF.setProgress(Integer.valueOf(tvCdegree.getText().toString()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sbF.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                tvFdegree.setText(String.valueOf((i *9/5) + 32));
                sbCelsius.setProgress(Integer.valueOf(tvFdegree.getText().toString()));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });






    }


}




