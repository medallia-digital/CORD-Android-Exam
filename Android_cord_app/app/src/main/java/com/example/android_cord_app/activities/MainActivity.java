package com.example.android_cord_app.activities;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.android_cord_app.network.JsonPlaceHolderApi;
import com.example.android_cord_app.R;
import com.example.android_cord_app.model.ActionData;
import com.example.android_cord_app.model.AlertAction;
import com.example.android_cord_app.model.BottomSheetAction;
import com.example.android_cord_app.model.ScreenAction;
import com.example.android_cord_app.network.RetrofitClient;
import java.util.List;
import java.util.Random;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private Button actionButton;
    private JsonPlaceHolderApi jsonPlaceHolderApi;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionButton = findViewById(R.id.actionButton);

        Retrofit retrofit = RetrofitClient.getClient("https://raw.githubusercontent.com/");
        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        getActions();
    }



    public void getActions() {

            Call<List<ActionData>> call = jsonPlaceHolderApi.getActions();

        call.enqueue(new Callback<List<ActionData>>() {
            @Override
            public void onResponse(Call<List<ActionData>> call, Response<List<ActionData>> response) {
                if (!response.isSuccessful()) {
                    Log.e(TAG, "onResponse: api call failed, error code --> " + response.code());
                    return;
                }

                final List<ActionData> actions = response.body();
                final Random rand = new Random();
                actionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ActionData randomActionData = actions.get(rand.nextInt(actions.size()));
                        if (randomActionData.getEnabled() == true) {

                            switch (randomActionData.getType()) {
                                case "alertSheet": {

                                    BottomSheetAction bottomSheetAction = new BottomSheetAction(randomActionData, MainActivity.this);
                                    bottomSheetAction.performAction();
                                    break;

                                }
                                case "screen": {

                                    ScreenAction screenAction = new ScreenAction(randomActionData, MainActivity.this);
                                    screenAction.performAction();
                                    break;

                                }
                                case "alert": {

                                    AlertAction alertAction = new AlertAction(randomActionData, MainActivity.this);
                                    alertAction.performAction();
                                    break;

                                }


                            }
                        }
                    }
                });
            }

            @Override
            public void onFailure(Call<List<ActionData>> call, Throwable t) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setMessage("An Error occurred during the api call")
                        .setTitle("Api error")
                        .create();
                dialog.show();
            }
        });


        }


}
