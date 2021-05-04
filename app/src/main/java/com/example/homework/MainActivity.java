package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable battery;
    ImageView imageView;
    ImageButton batteryIncrease;
    ImageButton batteryDecrease;
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imgBattery);
        batteryDecrease = findViewById(R.id.decreaseBattery);
        batteryIncrease = findViewById(R.id.increaseBattery);

//        battery = (AnimationDrawable) imageView.getBackground();
    }

//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        battery.start();
//    }

    public void decreaseBattery(View view) {
        if(count == 7){
            imageView.setImageResource(R.drawable.ic_batteryfull2);
            count--;
        }else if(count == 6){
            imageView.setImageResource(R.drawable.ic_batteryfull3);
            count--;
        }else if(count == 5){
            imageView.setImageResource(R.drawable.ic_batterymedium);
            count--;
        }else if(count == 4){
            imageView.setImageResource(R.drawable.ic_batterymedium1);
            count--;
        }else if(count == 3){
            imageView.setImageResource(R.drawable.ic_batterylow);
            count--;
        }else if(count == 2){
            imageView.setImageResource(R.drawable.ic_batteryempty);
            count--;
        }

    }

    public void increaseBattery(View view) {
        if(count == 1){
            imageView.setImageResource(R.drawable.ic_batterylow);
            count++;
        }else if(count == 2){
            imageView.setImageResource(R.drawable.ic_batterymedium1);
            count++;
        }else if(count == 3){
            imageView.setImageResource(R.drawable.ic_batterymedium);
            count++;
        }else if(count == 4){
            imageView.setImageResource(R.drawable.ic_batteryfull3);
            count++;
        }else if(count == 5){
            imageView.setImageResource(R.drawable.ic_batteryfull2);
            count++;
        }else if(count == 6){
            imageView.setImageResource(R.drawable.ic_batteryfull);
            count++;
        }
    }

}