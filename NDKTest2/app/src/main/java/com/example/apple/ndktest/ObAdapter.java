package com.example.apple.ndktest;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by apple on 15/8/11.
 */
public class ObAdapter extends BaseAdapter {

    public  static String TAG = ObAdapter.class.getCanonicalName();

    Activity activity;
    ArrayList dataSource;
    LayoutInflater layoutInflater;

    public ObAdapter(Activity activity,ArrayList dataSource)
    {
        this.activity   = activity;
        this.dataSource = dataSource;

        layoutInflater = LayoutInflater.from(activity);
    }




    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListItemHolder listItemHolder = null;

        if(convertView==null)
        {
            convertView = layoutInflater.inflate(R.layout.listitem_layout,null);

            listItemHolder = new ListItemHolder();

            listItemHolder.button = (Button) convertView.findViewById(R.id.button);

            convertView.setTag(listItemHolder);

            Log.i(TAG,"adapter create");
        }
        else
        {
            listItemHolder = (ListItemHolder) convertView.getTag();

            Log.i(TAG,"adapter reuse");
        }

        listItemHolder.button.setText("你好");

        return convertView;
    }


}



class ListItemHolder
{
    Button button;
}