package com.androidapp.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.androidapp.taskmaster.activities.AddTaskActivity;
import com.androidapp.taskmaster.activities.AllTasksActivity;
import com.androidapp.taskmaster.activities.SettingsActivity;
import com.androidapp.taskmaster.activities.TaskDetailsActivity;

public class MainActivity extends AppCompatActivity {
    public static final String PRODUCT_NAME_TAG = "productName";
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Steps for functionality
        //1. Get UI by ID
        //2. Add event listener to element
        //3. Attach fallback function to onClick method
        // 4. callback logic

        setUpAddTaskButton();
        setUpAllTasksButton();
        setUpSettingsButton();
        setUpHWButton(preferences);

    }

    public void setUpAddTaskButton () {
        Button goToAddTasksButton = (Button) findViewById(R.id.addTaskButton);
        goToAddTasksButton.setOnClickListener(v -> {
            Intent goToAddTaskIntent = new Intent(MainActivity.this, AddTaskActivity.class);
            startActivity(goToAddTaskIntent);
        });
    }

    public void setUpAllTasksButton () {
        Button goToAllTasksButton = (Button) findViewById(R.id.allTasksButton);
        goToAllTasksButton.setOnClickListener(v -> {
            Intent goToAllTasksIntent = new Intent(MainActivity.this, AllTasksActivity.class);
            startActivity(goToAllTasksIntent);
        });
    }

    public void setUpSettingsButton () {
        ImageButton gotToSettingsButton = (ImageButton) findViewById(R.id.mainActivitySettingsButton);
        gotToSettingsButton.setOnClickListener(v -> {
            Intent goToSettingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(goToSettingsIntent);
        });
    }

    protected void onResume () {
        super.onResume();

        preferences = getSharedPreferences(getPackageName() + "_preferences", Context.MODE_PRIVATE);
        String userName = preferences.getString(SettingsActivity.USER_NAME_TAG, "No user name");
        ((TextView) findViewById(R.id.mainActivityUserNameView)).setText(userName + "'s tasks");
    }

    public void setUpHWButton (SharedPreferences preferences) {
        Button gotToHWButton = (Button) findViewById(R.id.mainActivityHWButton);


        gotToHWButton.setOnClickListener(v -> {

//            String  buttonTaskText = gotToHWButton.getText().toString();
//
//
//            SharedPreferences.Editor preferenceEditor = preferences.edit();
//            preferenceEditor.putString(PRODUCT_NAME_TAG, buttonTaskText);
//            preferenceEditor.apply();

            Intent goToHWIntent = new Intent(MainActivity.this, TaskDetailsActivity.class);
            startActivity(goToHWIntent);
        });

    }

}