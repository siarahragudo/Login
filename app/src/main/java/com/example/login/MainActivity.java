package com.example.login;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.*;

public class MainActivity extends Activity
{
    EditText editUsername;
    EditText editPassword;
    Button btnlogin;
    Button btnSave;
    SharedPreferences sharedpref;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUsername=(EditText) findViewById(R.id.username);
        editPassword=(EditText) findViewById(R.id.password);
        btnlogin=(Button) findViewById(R.id.btnlogIn);
        btnSave=(Button)findViewById(R.id.btnsave);
        sharedpref=getSharedPreferences("My Data",Context.MODE_PRIVATE);

        btnlogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View p1)
            {
                if (editUsername.getText().toString().isEmpty()&& editPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Welcome you are now Log in!", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity.this,activityb.class);
                    startActivity(intent);
                }
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(MainActivity.this, register2.class);
                startActivity(registerScreen);

            }
        });


        }

    }
