package com.example.salah.calendar;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        CalendarView  calendarView =(CalendarView)findViewById( R.id.calendarView);
        calendarView.setFocusedMonthDateColor( Color.YELLOW );
        int focuseMonthDateColor = calendarView.getFocusedMonthDateColor();


        calendarView.setOnDateChangeListener( new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth ) {

                //int year, int month, int dayOfMonth

                Toast.makeText( getApplicationContext(), dayOfMonth + "/ " + month+1 + "/ "+ year + "\n " , Toast.LENGTH_LONG).show();
               // Toast.makeText( getApplicationContext(), date.toString(),  Toast.LENGTH_LONG).show();
            }
        } );
    }
}
