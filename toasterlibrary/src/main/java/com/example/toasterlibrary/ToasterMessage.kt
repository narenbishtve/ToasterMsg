package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    public companion object

    fun printMessage(mContext: Context, message: String) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show()
    }

}