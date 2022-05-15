package com.aman.todoapp.Utils;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.aman.todoapp.model.Priority;
import com.aman.todoapp.model.Task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
        simpleDateFormat.applyPattern("EEE,MM d");

        return simpleDateFormat.format(date);
                //Jan,30 2025

    }

    public static void hideSoftKeyboard(View view){
        InputMethodManager im = (InputMethodManager) view.getContext().getSystemService(
                Context.INPUT_METHOD_SERVICE);

        im.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static int priorityColor(Task task){
        int color;
        if (task.getPriority() == Priority.HIGH){
            color = Color.rgb(252, 0, 25);
        }else if (task.getPriority() == Priority.MEDIUM){
            color = Color.rgb(255, 235, 0);
        }else {
            color = Color.rgb(1, 255, 79);
        }
        return color;
    }
}
