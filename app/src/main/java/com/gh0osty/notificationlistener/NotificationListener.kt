package com.gh0osty.notificationlistener

import android.content.Intent
import android.os.IBinder
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class NotificationListener : NotificationListenerService() {

    override fun onBind(intent: Intent?): IBinder? {
        return super.onBind(intent)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        val packageName = ApplicationPackageHelper.getApplication(sbn?.packageName)
        ApplicationPackageHelper.handleNotification(packageName, sbn, onPackageName = {
            if(it.isNullOrEmpty()){
                Log.e("Test123","WHAT?")
            }
        })
        super.onNotificationPosted(sbn)
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {
        super.onNotificationRemoved(sbn)
    }
}