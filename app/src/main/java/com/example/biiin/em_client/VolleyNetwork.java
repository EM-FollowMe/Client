package com.example.biiin.em_client;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by ppang on 16. 5. 15..
 */
public class VolleyNetwork {
    private static VolleyNetwork one;
    private RequestQueue requestQueue;

    private VolleyNetwork(Context context){
        requestQueue = Volley.newRequestQueue(context);
    }

    public static VolleyNetwork getInstance(Context context){
        if(one == null){
            one = new VolleyNetwork(context);
        }
        return one;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
