package com.example.demo.common.utils;

import com.alibaba.fastjson.JSONObject;

public class UtilSystem {

    public static JSONObject getResult(Object data, Boolean status, String info, Integer errorCode) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", data);
        jsonObject.put("status", status);
        jsonObject.put("errorInfo", info);
        jsonObject.put("errorCode", errorCode);

        return jsonObject;
    }
}
