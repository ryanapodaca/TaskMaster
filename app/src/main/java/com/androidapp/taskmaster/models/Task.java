package com.androidapp.taskmaster.models;

public class Task {

    String title;

    String body;

//    public enum TaskState {
//        NEW("new"),
//        ASSIGNED("assigned"),
//        INPROGRESS("in progress"),
//        COMPLETE("complete");
//
//        private final String taskState;
//        TaskState(String state) {
//        }
//        public String getState() {
//            return taskState;
//        }
//
//        public static TaskState fromString (String possibleTaskState) {
//            for (TaskState type : possibleTaskState.values())
//                if
//
//            return type;
//        }
//    }

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}
