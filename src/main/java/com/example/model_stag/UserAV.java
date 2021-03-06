package com.example.model_stag;

import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.Json;
import com.vimeo.stag.UseStag;

import java.util.List;

@UseStag
public abstract class UserAV {

    @SerializedName("_id") // Annotation needed for GSON
    @Json(name = "_id")
    public abstract String id();

    public abstract int index();

    public abstract String guid();

    @SerializedName("is_active") // Annotation needed for GSON
    @Json(name = "is_active")
    public abstract boolean isActive();

    public abstract String balance();

    @SerializedName("picture") // Annotation needed for GSON
    @Json(name = "picture")
    public abstract String pictureUrl();

    public abstract int age();

    public abstract NameAV name();

    public abstract String company();

    public abstract String email();

    public abstract String address();

    public abstract String about();

    public abstract String registered();

    public abstract double latitude();

    public abstract double longitude();

    public abstract List<String> tags();

    public abstract List<Integer> range();

    public abstract List<FriendAV> friends();

    public abstract List<ImageAV> images();

    public abstract String greeting();

    @SerializedName("favorite_fruit") // Annotation needed for GSON
    @Json(name = "favorite_fruit")
    public abstract String favoriteFruit();

    @SerializedName("eye_color") // Annotation needed for GSON
    @Json(name = "eye_color")
    public abstract String eyeColor();

    public abstract String phone();

}
