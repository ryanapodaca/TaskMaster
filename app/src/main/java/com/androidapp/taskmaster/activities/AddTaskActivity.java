package com.androidapp.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.androidapp.taskmaster.R;

public class AddTaskActivity extends AppCompatActivity {
    private final String TAG = "AddTaskActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        //Steps for functionality
        //1. Get UI by ID
        //2. Add event listener to element
        //3. Attach fallback function to onClick method
        // 4. callback logic

        Button submitButton = (Button) findViewById(R.id.TaskActivitySubmitButton);

        submitButton.setOnClickListener(v -> {
            Log.v(TAG, "Submit clicked");

            ((TextView) findViewById(R.id.submitText)).setText(R.string.submitted_confirmation);
        });

    }


}
