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

        final Switch lSwitchWork = findViewById(R.id.switch_work);
        final Switch lSwitchSocialWork = findViewById(R.id.switch_social);
        final Switch lSwitchSleep = findViewById(R.id.switch_sleep);
        lSwitchWork.setTextColor(getResources().getColor(R.color.grayfifty));
        lSwitchSocialWork.setTextColor(getResources().getColor(R.color.grayfifty));
        lSwitchSleep.setTextColor(getResources().getColor(R.color.grayfifty));


        lSwitchWork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Log.w(Tag,"if switch work is on");
                    lSwitchWork.setTextColor(getResources().getColor(R.color.primaryBlack));
                }else{
                    Log.w(Tag, "else switch work is off");
                    lSwitchWork.setTextColor(getResources().getColor(R.color.grayfifty));
                }
            }
        });

        lSwitchSocialWork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    lSwitchSocialWork.setTextColor(getResources().getColor(R.color.primaryBlack));
                }else {
                    lSwitchSocialWork.setTextColor(getResources().getColor(R.color.grayfifty));
                }
            }
        });

        lSwitchSleep.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    lSwitchSleep.setTextColor(getResources().getColor(R.color.primaryBlack));
                }else{
                    lSwitchSleep.setTextColor(getResources().getColor(R.color.grayfifty));
                }
            }
        });
    }
}
