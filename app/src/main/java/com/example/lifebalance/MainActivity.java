package com.example.lifebalance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    private static String Tag = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Switch lSwitchJob = findViewById(R.id.switch_work);
        final Switch lSwitchSocialWork = findViewById(R.id.switch_social);
        final Switch lSwitchSleep = findViewById(R.id.switch_sleep);
        lSwitchJob.setTextColor(getResources().getColor(R.color.grayfifty));
        lSwitchSocialWork.setTextColor(getResources().getColor(R.color.grayfifty));
        lSwitchSleep.setTextColor(getResources().getColor(R.color.grayfifty));


        lSwitchJob.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    if(lSwitchSocialWork.isChecked())
                    {
                        lSwitchSocialWork.setChecked(true);
                        lSwitchSleep.setChecked(false);
                    }
                    else if(lSwitchSleep.isChecked())
                    {
                        lSwitchSocialWork.setChecked(false);
                        lSwitchSleep.setChecked(true);
                    }
                }
                else
                {
                    lSwitchSocialWork.setChecked(true);
                    lSwitchSleep.setChecked(true);
                }
            }
        });

        lSwitchSocialWork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(lSwitchSleep.isChecked())
                    {
                        lSwitchJob.setChecked(false);
                        lSwitchSleep.setChecked(true);
                    }
                    else if(lSwitchJob.isChecked())
                    {
                        lSwitchSleep.setChecked(false);
                        lSwitchJob.setChecked(true);
                    }
                }
                else
                {
                    lSwitchSleep.setChecked(true);
                    lSwitchJob.setChecked(true);
                }
            }
        });

        lSwitchSleep.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    if(lSwitchJob.isChecked())
                    {
                        lSwitchSocialWork.setChecked(false);
                        lSwitchJob.setChecked(true);
                    }
                    else if(lSwitchSocialWork.isChecked())
                    {
                        lSwitchJob.setChecked(false);
                        lSwitchSocialWork.setChecked(true);
                    }
                }
                else
                {
                    lSwitchJob.setChecked(true);
                    lSwitchSocialWork.setChecked(true);
                }

            }
        });


    }
}
