package com.example.android_cord_app.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.example.android_cord_app.R;


public class BottomSheetDialog extends BottomSheetDialogFragment {

    public final static String SheetTitleKey = "sheetTitleKey";
    public final static String SheetButtonUpKey = "sheetButtonUpKey";

    private TextView bottomSheetDialogText ;
    private Button buttonUp;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet_layout, container, false);
        this.bottomSheetDialogText = v.findViewById(R.id.SheetText);
        this.buttonUp = v.findViewById(R.id.button1);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();

        if (bundle != null){
            if (bundle.containsKey(SheetTitleKey)){
                String sheetTitleText = bundle.getString(SheetTitleKey);
                bottomSheetDialogText.setText(sheetTitleText);

            }
            if(bundle.containsKey(SheetButtonUpKey)){
                String sheetButtonUpText = bundle.getString(SheetButtonUpKey);
                this.buttonUp.setText(sheetButtonUpText);
            }
        }
    }
}
