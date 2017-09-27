package com.example.moshin.eljt2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

/**
 * Created by Moshin on 27/9/2017.
 */

public class MenuActivityAct extends AppCompatActivity {


    private FragmentController fragmentController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_menu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fragmentController = new FragmentController(getSupportFragmentManager());
        fragmentController.stackFragment(new MenuActivity(), R.id.eftMenuContent, "menu");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //nak functionkn back button
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onBackPressed() {
        startActivity(new MainActivity());
        finish();
    }

    private void startActivity(MainActivity mainActivity) {
    }
}

