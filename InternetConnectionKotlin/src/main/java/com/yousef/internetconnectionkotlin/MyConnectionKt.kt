package com.yousef.internetconnectionkotlin

import android.net.ConnectivityManager
import android.app.Dialog
import android.content.Context

/**
 * اللَّهُمَّ صَلِّ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما صَلَّيْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ
 * اللَّهُمَّ بَارِكْ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما بَارَكْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ

 *تم برمجتُه بواسطة : يوسف شعبان
 * +201142747343
 * yousefshaabansaad42@gmail.com
 */

 class MyConnectionKt(private val context: Context) {

    private fun networkInfo(): Boolean{
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null
    }

    fun isConnect(): Boolean{
        return networkInfo()
    }

    fun isDisconnect(): Boolean{
        return !networkInfo()
    }


    fun showDisconnectDialog() {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.item_dialog)
        dialog.window!!.setBackgroundDrawableResource(R.drawable.background2)
        dialog.setCancelable(true) //Optional
        dialog.window!!.attributes.windowAnimations =
            R.style.DialogAnimation //Setting the animations to dialog
        dialog.create()
        dialog.show()
    }
}