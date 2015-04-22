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
//        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
