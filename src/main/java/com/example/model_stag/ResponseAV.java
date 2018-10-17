package com.example.model_stag;

import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.Json;
import com.vimeo.stag.UseStag;

import java.util.List;

@UseStag
public abstract class ResponseAV {

    public abstract List<UserAV> users();

    public abstract String status();

    @SerializedName("is_real_json")
    @Json(name = "is_real_json")
    public abstract boolean isRealJson();

}
