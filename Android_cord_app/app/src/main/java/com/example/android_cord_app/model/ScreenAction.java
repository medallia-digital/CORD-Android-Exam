package com.example.android_cord_app.model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.example.android_cord_app.activities.DisplayMessageActivity;

public class ScreenAction extends BaseAction {


    public ScreenAction(ActionData action, AppCompatActivity activity) {
        super(action, activity);

    }

    public void performAction(){
        Intent displaySecondScreen = new Intent(this.activity, DisplayMessageActivity.class);
        displaySecondScreen.putExtra("text",this.action.getBody());
        this.activity.startActivity(displaySecondScreen);

    }

}
