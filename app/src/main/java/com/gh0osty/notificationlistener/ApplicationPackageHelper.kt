package com.gh0osty.notificationlistener

import android.content.Context
import android.service.notification.StatusBarNotification
import android.util.Log


class ApplicationPackageHelper {
    companion object {
//        private val packagePairs = listOf(
//            Pair("com.facebook.orca", 1),
//            Pair("com.twitter.android", 2),
//        )

        var packagePairs: List<Pair<String, Int>>? = null


        fun getAllPackagePairs(context: Context): List<Pair<String, Int>> {
            val packages = context.packageManager.getInstalledPackages(0)
            val packagePairs = mutableListOf<Pair<String, Int>>()
            packages.mapIndexed { i, v ->
                packagePairs.add(Pair(v.packageName, i + 1))
            }
            return packagePairs
        }

        fun getApplication(packageName: String?): String? {
            return packagePairs?.find { it.first == packageName }?.first
        }

        fun handleNotification(
            packageName: String?,
            sbn: StatusBarNotification?,
            onPackageName: (String?) -> Unit = {}
        ) {
            when (packageName) {
                "1" -> {
                    // Messenger
                }
                "com.twitter.android" -> {
                    onPackageName.invoke(packageName)
                    // Twitter

                    Log.d(
                        "Test123 - Twitter Notification",
                        sbn?.notification?.tickerText.toString()
                    )
//                    Log.d(
//                        "Test123 - Twitter Notification Extras",
//                        sbn?.notification?.extras.toString()
//                    )
                }
                else -> onPackageName.invoke(null)
            }
        }
    }
}