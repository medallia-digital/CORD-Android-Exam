package com.example.android_cord_app.model;

import android.support.v7.app.AppCompatActivity;

public class BaseAction {

    protected ActionData action;
    protected AppCompatActivity activity;

    public BaseAction(ActionData action, AppCompatActivity activity) {
        this.action = action;
        this.activity = activity;
    }

    public void performAction(){

    }
}
