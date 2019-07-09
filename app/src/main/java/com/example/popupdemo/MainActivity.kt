package com.example.popupdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val workingSelectionFragment = WorkingSelectionFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragmentContainer, workingSelectionFragment)?.commit()
        buttonBar.setOnClickListener {
            workingSelectionFragment.isOpen = !workingSelectionFragment.isOpen
        }
    }
}
