package com.example.moshin.eljt2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ListEFT_Adapter extends BaseAdapter {
    public ArrayList<ListNameEFT> eftList;
    Activity activity;

    public ListEFT_Adapter(Activity activity, ArrayList<ListNameEFT> eftList) {
        super();
        this.activity = activity;
        this.eftList = eftList;
    }

    @Override
    public int getCount() {
        return eftList.size();
    }

    @Override
    public Object getItem(int position) {
        return eftList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
    }

}

