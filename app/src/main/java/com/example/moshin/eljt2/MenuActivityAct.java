package com.example.moshin.eljt2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import lib.kingja.switchbutton.SwitchMultiButton;

/**
 * Created by Moshin on 27/9/2017.
 */

public class MenuActivityAct extends AppCompatActivity implements SwitchMultiButton.OnSwitchListener{



    private FragmentController fragmentController;
    private Localization localization;
    private SwitchMultiButton BtnLangMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_menu);

        localization = new Localization(this);
        localization.init();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fragmentController = new FragmentController(getSupportFragmentManager());
        fragmentController.stackFragment(new MenuActivity(), R.id.MenuMain, "Menu");

        BtnLangMenu = (SwitchMultiButton)findViewById(R.id.BtnlangMenu);
        BtnLangMenu.setOnSwitchListener(this);
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

    private void startActivity(MainActivity mainActivity) {}

    @Override
    public void onSwitch(int i, String s) {
        localization.setLocale(s);
        fragmentController.popBackStack("Menu");
        fragmentController.stackFragment(new MenuActivity(), R.id.MenuMain, "Menu");
    }
}