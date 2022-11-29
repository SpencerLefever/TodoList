package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExpandedTaskActivity extends AppCompatActivity {

    Button backButton;
    TextView taskName;
    TextView taskDescription;

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_expanded_task);

        //Find components by id
        backButton = findViewById(R.id.BackButton);
        taskName = findViewById(R.id.TaskName);
        taskDescription = findViewById(R.id.TaskDescription);

        //Set the TextViews based on what activity was clicked

        //Add onClickListener to back button
        backButton.setOnClickListener(backButtonOnClickListener);
    }

    //Go back to main page when back button is clicked
    private final View.OnClickListener backButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            ExpandedTaskActivity.this.startActivity(i);
        }
    };
}