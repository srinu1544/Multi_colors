package com.example.colors_library;

import android.content.Context;
import android.widget.Toast;

public class SimpleToast {

    public static void simpleToast(Context context, String Message){

        Toast.makeText(context, ""+Message, Toast.LENGTH_SHORT).show();
    }
}
