package com.p1208.betterwaytolaunchapplication

import android.content.Context
import android.content.Intent

/**
 * Created by p1208 on 20/3/18.
 */

interface ActivityArgs {
    fun intent(activity: Context): Intent
    fun launch(activity: Context) = activity.startActivity(intent(activity))
}