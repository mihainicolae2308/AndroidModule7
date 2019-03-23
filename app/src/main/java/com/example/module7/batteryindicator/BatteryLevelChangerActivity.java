package com.example.module7.batteryindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.module7.R;

public class BatteryLevelChangerActivity extends AppCompatActivity {

    private ImageView mImageViewBatteryLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_level_changer);

        initView();
    }

    private void initView() {
        mImageViewBatteryLevel = findViewById(R.id.image_view_battery_level);
        mImageViewBatteryLevel.setImageLevel(3);
    }

    public void decreaseLevelOnClick(View view) {
        int currentLevel = mImageViewBatteryLevel.getDrawable().getCurrent().getLevel();
        if (currentLevel >= 1) {
            mImageViewBatteryLevel.setImageLevel(currentLevel - 1);
        }
    }

    public void increaseLevelOnClick(View view) {
        int currentLevel = mImageViewBatteryLevel.getDrawable().getCurrent().getLevel();
        if (currentLevel <= 5) {
            mImageViewBatteryLevel.setImageLevel(currentLevel + 1);
        }
    }
}
