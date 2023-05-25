package com.androidapp.taskmaster.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidapp.taskmaster.R;

public class TasksRecycleViewAdapter extends RecyclerView.Adapter<TasksRecycleViewAdapter.TasksListViewHolder> {

    @NonNull
    @Override
    public TasksListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View taskFragment = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_task_list, parent, false);
        return new TasksListViewHolder(taskFragment);
    }

    @Override
    public void onBindViewHolder(@NonNull TasksListViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 100;
    }

    public static class TasksListViewHolder extends RecyclerView.ViewHolder {
        public TasksListViewHolder(View fragmentTaskView) {
            super(fragmentTaskView);
        }
    }
}
