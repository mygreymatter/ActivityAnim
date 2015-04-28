package com.mayo.animations;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class ActTwo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_two);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
		//overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);
        //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        
        //In the following transition, ActOne(entry view) stays still during the animation.
        //During the animation, ActTwo(exit view) moves into the screen from the right.
        overridePendingTransition(R.anim.standstill, R.anim.slide_out_right);
    }
}
