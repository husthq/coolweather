package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by Private on 2017/7/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
