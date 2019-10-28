package com.anwesh.uiprojects.linkedjumpboxtakerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.jumpboxtakerview.JumpBoxTakerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        JumpBoxTakerView.create(this)
    }
}
