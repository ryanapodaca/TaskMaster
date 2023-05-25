package com.androidapp.taskmaster.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidapp.taskmaster.R;
import com.androidapp.taskmaster.models.Task;

import java.util.List;

public class TasksRecycleViewAdapter extends RecyclerView.Adapter<TasksRecycleViewAdapter.TasksListViewHolder> {

    List<Task> tasks;

    public TasksRecycleViewAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    @NonNull
    @Override
    public TasksListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View taskFragment = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_task_list, parent, false);
        return new TasksListViewHolder(taskFragment);
    }

    @Override
    public void onBindViewHolder(@NonNull TasksListViewHolder holder, int position) {
        TextView taskFragmentTextView = (TextView) holder.itemView.findViewById(R.id.taskfragmentTextView);
        String taskName = tasks.get(position).getTitle();
        String taskFragmentText = position + "." + taskName;
        taskFragmentTextView.setText(taskFragmentText);

    }


    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class TasksListViewHolder extends RecyclerView.ViewHolder {
        public TasksListViewHolder(View fragmentTaskView) {
            super(fragmentTaskView);
        }
    }
}
