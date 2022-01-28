package com.kenworldtech.supertoaster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SuperToaster {
    public static void ToastMe(Context context,String title,String message,String positiveButtonMessage
            ,String negativeButtonMessage)
    {
        View view  = LayoutInflater.from(context)
                .inflate(R.layout.toast_layout,null);
        Toast toast = new Toast(context);
        TextView titleTv = view.findViewById(R.id.header_title);
        TextView messageTv = view.findViewById(R.id.header_title);
        Button okBtn = view.findViewById(R.id.okBtn);
        Button cancelBtn = view.findViewById(R.id.cancelBtn);
        titleTv.setText(title);
        messageTv.setText(message);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, positiveButtonMessage, Toast.LENGTH_SHORT).show();
            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, negativeButtonMessage, Toast.LENGTH_SHORT).show();
            }
        });

        toast.setView(view);
        toast.show();
    }
}
