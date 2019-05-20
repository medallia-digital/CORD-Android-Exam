package com.example.android_cord_app.network;


import com.example.android_cord_app.model.ActionData;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("medallia-digital/Exams-Data/master/mobileCordData.json")
    Call<List<ActionData>> getActions();
}

