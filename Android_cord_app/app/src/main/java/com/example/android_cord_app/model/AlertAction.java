package com.example.android_cord_app.model;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;

public class AlertAction extends BaseAction {
    public AlertAction(ActionData action, AppCompatActivity activity) {
        super(action, activity);
    }

    public void performAction(){
        AlertDialog dialog = new AlertDialog.Builder(activity)
                .setTitle(this.action.getText())
                .setCancelable(false)
                .setMessage(this.action.getBody())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }

                }).create();

        dialog.show();
    }

}
