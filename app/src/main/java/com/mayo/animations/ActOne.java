package com.mayo.animations;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class ActOne extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_one);
//        Log.i("Act",Integer.toString(1/0));
        overridePendingTransition(0,R.anim.standstill);

    }

    public void showSecond(View view){
        Intent intent = new Intent(this,ActTwo.class);
        startActivity(intent);
        //push from bottom to top
//        overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
        //slide from right to left
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
