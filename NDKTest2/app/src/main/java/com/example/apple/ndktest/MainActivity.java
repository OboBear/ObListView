package com.example.apple.ndktest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    public static String TAG = MainActivity.class.getCanonicalName();

    ListView list_view;

    static {
        System.loadLibrary("jniTest");
    }

    public native String  getJniString();

    public native int getJniInt();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewById = (TextView) findViewById(R.id.hellow);
        viewById.setText(getJniString()+getJniInt());

        initListView();
    }



    private void initListView()
    {
        list_view = (ListView) findViewById(R.id.list_view);



        ArrayList dataSource = new ArrayList();
        for (int i=0;i<50;i++) {
            dataSource.add(new String());
        }
        list_view.setAdapter(new ObAdapter(this,dataSource));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
