package com.p1208.betterwaytolaunchapplication

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.second_screen.*

/**
 * Created by p1208 on 20/3/18.
 */

class SecondActivity : Activity() {
    private val args by lazy {
        MediumProfileActivityArgs.deserializeFrom(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_screen)

        textView1.setText(args.name)
        textView2.setText(args.shortBio)

    }
}
