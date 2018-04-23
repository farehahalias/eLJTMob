package com.example.moshin.eljt2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class EftPaymentInquiry extends Fragment {

    private FragmentController fragmentController;
    private Button btnLanguange;
    private TableLayout tv;

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

        tv= (TableLayout) getView().findViewById(R.id.tableEftPayment);
        tv.removeAllViewsInLayout();

        btnSearcheft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListeftHide.setVisibility(View.VISIBLE);
                FetchDataHome process = new FetchDataHome("eftPayment");
                process.execute();
            }
        });

    }

    public void searchEftPayment(String arrayData[][],int arrayLength){

        int flag=1;
        for(int i = 0; i< arrayLength; i++){
            TableRow tr=new TableRow(this.getActivity());

            if(flag==1) {
                TextView b6 = new TextView(this.getActivity());
                b6.setText("REF NO");
                b6.setTextColor(Color.BLUE);
                b6.setTextSize(15);
                tr.addView(b6);


                TextView b19 = new TextView(this.getActivity());
                b19.setPadding(10, 0, 0, 0);
                b19.setTextSize(15);
                b19.setText("Issue Date");
                b19.setTextColor(Color.BLUE);
                tr.addView(b19);

                TextView b29 = new TextView(this.getActivity());
                b29.setPadding(10, 0, 0, 0);
                b29.setText("Amount");
                b29.setTextColor(Color.BLUE);
                b29.setTextSize(15);
                tr.addView(b29);

                tv.addView(tr);
                flag=0;
            }


            TextView b=new TextView(this.getActivity());
            String stime=String.valueOf(arrayData[i][0]);
            b.setText(stime);
            b.setTextColor(Color.RED);
            b.setTextSize(15);
            tr.addView(b);


            TextView b1=new TextView(this.getActivity());
            b1.setPadding(10, 0, 0, 0);
            b1.setTextSize(15);
            String stime1=String.valueOf(arrayData[i][1]);
            b1.setText(stime1);
            b1.setTextColor(Color.WHITE);
            tr.addView(b1);

            TextView b2=new TextView(this.getActivity());
            b2.setPadding(10, 0, 0, 0);
            String stime2=String.valueOf(arrayData[i][2]);
            b2.setText(stime2);
            b2.setTextColor(Color.RED);
            b2.setTextSize(15);
            tr.addView(b2);

            tv.addView(tr);

            final View vline1 = new View(this.getActivity());
            vline1.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, 1));
            vline1.setBackgroundColor(Color.WHITE);
            tv.addView(vline1);

//           refNo = arrayData[i][0]
//           issueDate = arrayData[i][1]
//           amt = arrayData[i][2]
        }
    }

}
