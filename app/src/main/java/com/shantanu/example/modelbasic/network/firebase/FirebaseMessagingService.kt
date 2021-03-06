package com.shantanu.example.modelbasic.network.firebase

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.shantanu.example.modelbasic.R

class CustomFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        Log.d("msg", "From: ${remoteMessage?.from}")
        // Check if message contains a notification payload.
        remoteMessage?.notification?.let {
            Log.d("msg", "Message Notification Body: ${it.body}")
            //Message Services handle notification

            //Log.d("msg", "From: ${remoteMessage?.from}")
            // Check if message contains a notification payload.
           // remoteMessage?.notification?.let {
                Log.d("msg", "Message Notification Body: ${it.body}")
                //Message Services handle notification
              /* val notification = NotificationCompat.Builder(context)
                    .setContentTitle(remoteMessage.from)
                    .setContentText(it.body)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .build()
                val manager = NotificationManagerCompat.from(context)
                manager.notify(0, notification)*/


          //  }
    }}


    override fun onNewToken(token: String) {
       /* FirebaseInstanceId.getInstance().instanceId
            .addOnCompleteListener(OnCompleteListener { task ->
                if (!task.isSuccessful) {
                    //Log.w(TAG, "getInstanceId failed", task.exception)
                    return@OnCompleteListener
                }

                // Get new Instance ID token
                val token = task.result?.token
                Log.v("token",token)

            })*/
    }

}

