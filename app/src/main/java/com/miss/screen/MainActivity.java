package com.miss.screen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan action barr
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent activity=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(activity);
    }
},2000);


    }
}
