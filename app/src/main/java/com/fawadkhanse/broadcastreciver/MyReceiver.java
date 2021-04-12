package com.fawadkhanse.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
      // Toast massage
        Toast.makeText(context,"BroadCast Recived",Toast.LENGTH_LONG).show();
        Log.d ( TAG, "onReceive: log for testing " );

//    ///  2nd mathoad for toast massage
//        Toast Mytoast;
//        Mytoast = Toast.makeText(context,"Broadcast Massage",Toast.LENGTH_SHORT);
//        Mytoast.show();

    }
}
