package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class FragmentOne : Fragment() {

    var dataCenter: DataCenter? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? { // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       val editText = view.findViewById(R.id.editText) as EditText
       val  button = view.findViewById(R.id.button) as Button
        button.setOnClickListener {
            val data = editText.text.toString()
            dataCenter!!.sendData(data)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        dataCenter = context as DataCenter
    }
}