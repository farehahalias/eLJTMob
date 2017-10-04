package com.example.moshin.eljt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import lib.kingja.switchbutton.SwitchMultiButton;

public class PrintReceiptLSAct extends AppCompatActivity implements SwitchMultiButton.OnSwitchListener {

        private FragmentController fragmentController;
        private Localization localization;
        private SwitchMultiButton btnLangLS;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_print_receipt_ls_act);

            localization = new Localization(this);
            localization.init();

            //back button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            fragmentController = new FragmentController(getSupportFragmentManager());
            fragmentController.stackFragment(new PrintReceiptLS(), R.id.LSsearch, "LS");

            btnLangLS = (SwitchMultiButton)findViewById(R.id.BtnlangLS);
            btnLangLS.setOnSwitchListener(this);
        }


    @Override
    public void onSwitch(int i, String s) {
        localization.setLocale(s);
        fragmentController.popBackStack("LS");
        fragmentController.stackFragment(new PrintReceiptLS(), R.id.LSsearch, "LS");
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
