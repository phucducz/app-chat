package com.example.appchattdacn.utills;

import android.content.Context;
import android.widget.Toast;

public class AndroidUtills {
    public static void showToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
