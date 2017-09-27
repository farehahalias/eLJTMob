package com.example.moshin.eljt2;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Locale;

public class MenuActivity extends Fragment {

    private Button buttonEFT;
    private Button buttonLS;
    private MyButton ButtonChangeLang;
    private FragmentController fragmentController;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_menu_frg,container,false);

        buttonEFT = (Button) view.findViewById(R.id.buttonEFT);
        fragmentController = new FragmentController(getActivity().getSupportFragmentManager());

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
                Intent intent = new Intent(getActivity(), PrintReceiptLS.class);
                startActivity(intent);
            }
        });

        ButtonChangeLang = (MyButton) view.findViewById(R.id.changeMenu);
        ButtonChangeLang.setOnClickListener(new View.OnClickListener() {
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
                fragmentController.stackFragment(new MenuActivity(), R.id.eftMenuContent, "menu");
            }
        });

        return view;
    }

}
