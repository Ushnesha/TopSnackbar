package com.example.topsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.androidadvance.topsnackbar.TSnackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isShownSnackbar:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        screen.setOnClickListener(object : View.OnClickListener {
            var tsnack = TSnackbar.make(findViewById(android.R.id.content), "Hello from TSnackBar.", TSnackbar.LENGTH_SHORT)
            override fun onClick(v: View?) {

                if (!isShownSnackbar) {
                    tsnack = TSnackbar.make(findViewById(android.R.id.content), "Hello from TSnackBar.", TSnackbar.LENGTH_SHORT)
                    isShownSnackbar = true
                    tsnack.show()
                } else {
                    isShownSnackbar = false
                    tsnack.dismiss()

                }
            }

        })
    }
}
