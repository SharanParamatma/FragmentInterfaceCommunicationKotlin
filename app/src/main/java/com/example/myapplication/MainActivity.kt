package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), DataCenter {
    var a = "Param"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testMain = PhysicsTeacher()
        println(testMain.collegeName)
        println(testMain.designation)
        println(testMain.mainSubject)
        testMain.does()
        println(a.hashCode())
        a = "Param"
        println(a.hashCode())
        supportFragmentManager.beginTransaction().add(R.id.line1, FragmentOne())
                .add(R.id.line2, FragmentTwo()).commit()
    }

    override fun sendData(data: String?) {
        val fragmentTwo = supportFragmentManager.findFragmentById(R.id.line2) as FragmentTwo?
        fragmentTwo!!.getData(data)
    }
}