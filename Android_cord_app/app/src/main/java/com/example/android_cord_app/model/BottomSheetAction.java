package com.example.android_cord_app.model;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.android_cord_app.activities.BottomSheetDialog;

public class BottomSheetAction extends BaseAction {

    public BottomSheetAction(ActionData action, AppCompatActivity activity) {
        super(action, activity);
    }

    public void performAction() {
        Bundle bundle = new Bundle();
        bundle.putString(BottomSheetDialog.SheetTitleKey, this.action.getText());
        bundle.putString(BottomSheetDialog.SheetButtonUpKey, this.action.getBody());

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog();
        bottomSheetDialog.setArguments(bundle);
        bottomSheetDialog.show(activity.getSupportFragmentManager(), "tag");
    }
}
