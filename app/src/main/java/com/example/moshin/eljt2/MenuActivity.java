package com.example.moshin.eljt2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MenuActivity extends Fragment {

    private Button buttonEFT;
    private Button buttonLS;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_menu_frg,container,false);

        buttonEFT = (Button) view.findViewById(R.id.buttonEFT);

        buttonEFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActEftPaymentInquiry.class);
                startActivity(intent);
            }
        });

        buttonLS = (Button) view.findViewById(R.id.buttonLS);

        buttonLS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PrintReceiptLSAct.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
