package com.example.moshin.eljt2;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Locale;

public class EftPaymentInquiry extends Fragment {

    private FragmentController fragmentController;
    private MyButton btnLanguange;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg_eft_payment_inquiry,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        fragmentController = new FragmentController(getActivity().getSupportFragmentManager());
        MyButton btnSearcheft = (MyButton) getView().findViewById(R.id.BtnSearchEft);

        btnSearcheft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListEftPaymentEnquiry.class);
                startActivity(intent);
            }
        });

        btnLanguange = (MyButton)getView().findViewById(R.id.BtnLanguange);
        btnLanguange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Locale locale = getResources().getConfiguration().locale;
                if (locale.toString().equals("ms")) {
                    locale = new Locale("en");
                } else if(locale.toString().equals("en")) {
                    locale = new Locale("ms");
                } else {
                    locale = new Locale("ms");
                }
                Locale.setDefault(locale);
                Configuration configuration = new Configuration();
                configuration.locale = locale;
                getActivity().getResources().updateConfiguration(configuration, getActivity().getResources().getDisplayMetrics());

                fragmentController.popBackStack("EFT");
                fragmentController.stackFragment(new EftPaymentInquiry(), R.id.eftPEContent, "EFT");
            }
        });
    }




}
