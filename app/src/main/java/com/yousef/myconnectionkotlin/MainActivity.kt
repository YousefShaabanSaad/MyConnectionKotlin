package com.yousef.myconnectionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yousef.internetconnectionkotlin.MyConnectionKt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myConnectionKt = MyConnectionKt(this)
        if(myConnectionKt.isConnect()){
            // internet connection
            Toast.makeText(this, "internet connection", Toast.LENGTH_SHORT).show();
        }

        if(myConnectionKt.isDisconnect()) {
            // internet disconnect
            myConnectionKt.showDisconnectDialog();
        }
    }
}