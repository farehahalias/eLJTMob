package com.example.moshin.eljt2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class EftPaymentInquiry extends Fragment {

    private FragmentController fragmentController;
    private Button btnLanguange;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg_eft_payment_inquiry,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button btnSearcheft = (Button) getView().findViewById(R.id.BtnSearchEft);
        final LinearLayout ListeftHide = (LinearLayout) getActivity().findViewById(R.id.listefthide);

        btnSearcheft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListeftHide.setVisibility(View.VISIBLE);
            }
        });

    }

}
