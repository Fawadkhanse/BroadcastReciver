package com.fawadkhanse.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
      // Toast massage
        Toast.makeText(context,"BroadCast Recived",Toast.LENGTH_LONG).show();

//    ///  2nd mathoad for toast massage
//        Toast Mytoast;
//        Mytoast = Toast.makeText(context,"Broadcast Massage",Toast.LENGTH_SHORT);
//        Mytoast.show();

    }
}
