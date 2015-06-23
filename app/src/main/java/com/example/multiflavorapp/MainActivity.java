package com.example.multiflavorapp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.squareup.leakcanary.LeakCanary;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LeakCanary.install(new Application());

        //If this is a special edition, show a toast.
        //This field is populated from the gradle build script by the buildConfigField property.
        if(BuildConfig.IS_SPECIAL) {
            Toast.makeText(this, "This is a special edition!", Toast.LENGTH_SHORT).show();
        }
    }
}
