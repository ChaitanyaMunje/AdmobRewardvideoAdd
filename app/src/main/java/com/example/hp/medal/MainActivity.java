package com.example.hp.medal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;

public class MainActivity extends AppCompatActivity {
    private RewardedVideoAd mAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button);
        MobileAds.initialize(getApplicationContext(),"your admob app id");
            mAdd=MobileAds.getRewardedVideoAdInstance(this);


    }

    public void loadadd(View view) {
        if (mAdd.isLoaded()) {
            mAdd.show();

        }
    }
    private  void loadrewardvideoadd()
    {
        if (!mAdd.isLoaded())
        {
            mAdd.loadAd("your admob reward video id",new AdRequest.Builder().build());
        }
    }
}
