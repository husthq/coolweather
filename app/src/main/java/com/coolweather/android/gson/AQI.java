package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Private on 2017/7/24.
 */

public class AQI {
    public  AQICity city;
    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
