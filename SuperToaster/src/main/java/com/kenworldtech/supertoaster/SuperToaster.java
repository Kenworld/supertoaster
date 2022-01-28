package com.kenworldtech.supertoaster;

import android.content.Context;
import android.widget.Toast;

public class SuperToaster {
    public static void ToastMe(Context context,String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
