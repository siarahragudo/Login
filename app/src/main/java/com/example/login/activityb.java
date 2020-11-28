package com.example.login;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;

public class activityb extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO: Implement this method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvityb);
        TextView textUser=(TextView) findViewById(R.id.textUser);
        SharedPreferences sharedPref=getSharedPreferences("My Data",Context.MODE_PRIVATE);

        String name = sharedPref.getString("name","");
        textUser.setText(name);

    }

}
