package com.xhsemoticonskeyboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/** An array adapter that knows how to render views when given CustomData classes */
public class CustomArrayAdapter extends ArrayAdapter<String> {
    private LayoutInflater mInflater;
    private List<String> mData;
    private Context mContext;

    public CustomArrayAdapter(Context context, List<String> values) {
        super(context, R.layout.custom_data_view, values);
        mData = values;
        mInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContext=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return convertView;
    }


}
