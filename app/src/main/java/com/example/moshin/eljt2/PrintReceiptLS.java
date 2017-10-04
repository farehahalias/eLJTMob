package com.example.moshin.eljt2;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;

public class PrintReceiptLS extends Fragment {
    EditText edittext;
    private int mYear, mMonth, mDay;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_print_receipt_ls, container, false);

        Button buttonsearchLS = (Button) view.findViewById(R.id.BtnSearchLS);
        //edit text date
        edittext = (EditText) view.findViewById(R.id.editTextReceiptDate);
        final LinearLayout listLS = (LinearLayout) view.findViewById(R.id.listLS);

        buttonsearchLS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listLS.setVisibility(View.VISIBLE);
            }
        });


        edittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get Current Date
                final java.util.Calendar c = java.util.Calendar.getInstance();
                mYear = c.get(java.util.Calendar.YEAR);
                mMonth = c.get(java.util.Calendar.MONTH);
                mDay = c.get(java.util.Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                edittext.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        return view;


    }


}