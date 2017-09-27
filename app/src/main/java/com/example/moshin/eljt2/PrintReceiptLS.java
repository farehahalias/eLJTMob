package com.example.moshin.eljt2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class PrintReceiptLS extends AppCompatActivity implements
        View.OnClickListener{
    EditText edittext;
    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_receipt_ls);

        //logout button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button buttonsearchLS = (Button) findViewById(R.id.BtnSearchLS);

        //edit text date
        edittext = (EditText) findViewById(R.id.editTextReceiptDate);

        buttonsearchLS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrintReceiptLS.this, ListJobReceiptLS.class);
                startActivity(intent);
            }
        });


        edittext.setOnClickListener(this);

    }

  //edittext untuk date
    @Override
    public void onClick(View v) {

        if (v == edittext) {

            // Get Current Date
            final java.util.Calendar c = java.util.Calendar.getInstance();
            mYear = c.get(java.util.Calendar.YEAR);
            mMonth = c.get(java.util.Calendar.MONTH);
            mDay = c.get(java.util.Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            edittext.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
    }


//logout button
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
}
