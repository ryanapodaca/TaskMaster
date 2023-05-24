package com.androidapp.taskmaster.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androidapp.taskmaster.MainActivity;
import com.androidapp.taskmaster.R;

public class TaskDetailsActivity extends AppCompatActivity {
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);


    }

    protected void onResume () {
        super.onResume();

        preferences = getSharedPreferences(getPackageName() + "_preferences", Context.MODE_PRIVATE);
        String task = preferences.getString(MainActivity.PRODUCT_NAME_TAG, "No task");
        ((TextView) findViewById(R.id.taskDetailsActivityInputName)).setText(task);
    }
}