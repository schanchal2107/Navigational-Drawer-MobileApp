package com.example.mymobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class about extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_type);

        drawerLayout = findViewById(R.id.drawer_layout);
        imgButton = (ImageButton) findViewById(R.id.imageButton);
    }


    public void ClickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickPhoneType(View view) {
        recreate();
    }


    public void ClickLogo(View view) {
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view) {
        MainActivity.redirectActvity(this, MainActivity.class);
    }

    public void ClickCalculator(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(about.this, "There is no package available in android", Toast.LENGTH_LONG).show();
        }

    }

    public void ClickChanMenu(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.myapp");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(about.this, "There is no package available in android", Toast.LENGTH_LONG).show();
        }
    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);
    }



    public void clickme(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Payment Successful", Toast.LENGTH_SHORT);
        toast.show();
    }
}