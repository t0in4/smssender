package com.example.sms_auth

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.telephony.SmsManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment

class EnterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.fragment_title, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.playButton).setOnClickListener {
            //Toast.makeText(context, "Button", Toast.LENGTH_SHORT).show()

            val smsManager: SmsManager = SmsManager.getDefault()

            smsManager.sendTextMessage("", null, "sms message", null, null)




        }


    }


}