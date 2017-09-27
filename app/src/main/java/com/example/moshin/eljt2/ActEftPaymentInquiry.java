package com.example.moshin.eljt2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

public class ActEftPaymentInquiry extends AppCompatActivity {

    private FragmentController fragmentController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eft_payment_inquiry);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fragmentController = new FragmentController(getSupportFragmentManager());
        fragmentController.stackFragment(new EftPaymentInquiry(), R.id.eftPEContent, "EFT");
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
        startActivity(new MenuActivityAct());
        finish();
    }

    private void startActivity(MenuActivityAct menuActivityAct) {

    }
}
