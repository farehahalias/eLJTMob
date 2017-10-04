package com.example.moshin.eljt2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import lib.kingja.switchbutton.SwitchMultiButton;

public class ActEftPaymentInquiry extends AppCompatActivity implements SwitchMultiButton.OnSwitchListener{

    private FragmentController fragmentController;
    private Localization localization;
    private SwitchMultiButton btnLangEFT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eft_payment_inquiry);

        localization = new Localization(this);
        localization.init();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fragmentController = new FragmentController(getSupportFragmentManager());
        fragmentController.stackFragment(new EftPaymentInquiry(), R.id.EFTMain, "EFT");

        btnLangEFT = (SwitchMultiButton)findViewById(R.id.BtnlangEft);
        btnLangEFT.setOnSwitchListener(this);
    }



    @Override
    public void onSwitch(int i, String s) {
        localization.setLocale(s);
        fragmentController.popBackStack("Main");
        fragmentController.stackFragment(new EftPaymentInquiry(), R.id.EFTMain, "Main");
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
