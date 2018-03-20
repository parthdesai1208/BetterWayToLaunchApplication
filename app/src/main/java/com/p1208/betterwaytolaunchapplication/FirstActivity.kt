package com.p1208.betterwaytolaunchapplication

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by p1208 on 20/3/18.
 */

class FirstActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { goToMediumProfile() }
    }

    fun goToMediumProfile() {
        val currentActivity = this
        MediumProfileActivityArgs(
                "Mark Zuckerberg",
                "Eat. Sleep. Facebook."
        ).launch(currentActivity)


    }
}