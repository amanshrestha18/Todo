package com.aman.todoapp.adapter;

import com.aman.todoapp.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
