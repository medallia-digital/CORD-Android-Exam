package com.example.android_cord_app.model;

import com.google.gson.annotations.SerializedName;

public class ActionData {


    @SerializedName("type")
    private String type;
    @SerializedName("enabled")
    private Boolean enabled;
    @SerializedName("text")
    private String text;
    @SerializedName("body")
    private String body;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}

