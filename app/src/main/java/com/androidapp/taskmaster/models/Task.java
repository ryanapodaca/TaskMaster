package com.androidapp.taskmaster.models;

public class Task {

    String title;

    String body;

    public enum TaskState {
        NEW("new"),
        ASSIGNED("assigned"),
        INPROGRESS("in progress"),
        COMPLETE("complete");

        public String state;
        TaskState(String state) {
        }
        public String getState() {
            return state;
        }
    }

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}
