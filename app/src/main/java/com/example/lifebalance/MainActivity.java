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
                    lSwitchJob.setTextColor(getResources().getColor(R.color.primaryBlack));
                    if (lSwitchSleep.isChecked()){
                        Log.w(Tag,"WORK");
                        lSwitchSocialWork.setChecked(false);
                    }

                }
                else{
                    Log.w(Tag, "else WORK");
                    lSwitchJob.setTextColor(getResources().getColor(R.color.grayfifty));
                    lSwitchSocialWork.setChecked(true);
//                    lSwitchSleep.setChecked(true);
                }
            }
        });

        lSwitchSocialWork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    lSwitchSocialWork.setTextColor(getResources().getColor(R.color.primaryBlack));
                    if (lSwitchJob.isChecked() && lSwitchSleep.isChecked()){
                        Log.w(Tag,"SOCIAL");
                        lSwitchJob.setChecked(false);
                    }
                }else {
                    lSwitchSocialWork.setTextColor(getResources().getColor(R.color.grayfifty));
                    Log.w(Tag,"ELSE SOCIAL");
                    lSwitchJob.setChecked(true);
                    lSwitchSleep.setChecked(true);
                }
            }
        });

        lSwitchSleep.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    lSwitchSleep.setTextColor(getResources().getColor(R.color.primaryBlack));
                    if (lSwitchSocialWork.isChecked()){
                        Log.w(Tag,"SLEEP");
                        lSwitchSocialWork.setChecked(false);
                    }
                }else{
                    lSwitchSleep.setTextColor(getResources().getColor(R.color.grayfifty));
                    Log.w(Tag,"ELSE SLEEP");
                    lSwitchSocialWork.setChecked(true);
                    lSwitchJob.setChecked(true);
                }
            }
        });
    }
}
