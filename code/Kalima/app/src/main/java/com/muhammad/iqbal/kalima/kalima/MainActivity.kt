package com.muhammad.iqbal.kalima.kalima

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
//import android.support.design.widget.Snackbar

class MainActivity : AppCompatActivity() {

    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCount.setText("0")
        btnCount.setOnClickListener {
            Toast.makeText(this@MainActivity, "I believe.", Toast.LENGTH_SHORT).show()
            tvCount.setText(count.toString())
            /*
            Snackbar.make(
                    root_layout, // Parent view
                    "I believe", // Message to show
                    Snackbar.LENGTH_SHORT // How long to display the message.
            ).show()
            */
            count ++
        }
    }
}
