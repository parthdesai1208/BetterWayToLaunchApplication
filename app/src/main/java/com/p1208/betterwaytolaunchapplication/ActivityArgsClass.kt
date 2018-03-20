package com.p1208.betterwaytolaunchapplication

import android.content.Context
import android.content.Intent

/**
 * Created by p1208 on 20/3/18.
 */
private const val NAME_KEY = "name_key"
private const val SHORT_BIO_KEY = "short_bio_key"

data class MediumProfileActivityArgs(val name: String,
                                     val shortBio: String) : ActivityArgs {


   override fun intent(activity: Context): Intent = Intent(
            activity, SecondActivity::class.java
    ).apply {
        putExtra(NAME_KEY, name)
        putExtra(SHORT_BIO_KEY, shortBio)
    }

    companion object {
        fun deserializeFrom(intent: Intent): MediumProfileActivityArgs {
            return MediumProfileActivityArgs(
                    name = intent.getStringExtra(NAME_KEY),
                    shortBio = intent.getStringExtra(SHORT_BIO_KEY)
            )
        }
    }

}