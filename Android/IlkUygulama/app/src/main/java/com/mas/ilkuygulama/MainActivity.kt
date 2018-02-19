package com.mas.ilkuygulama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var number1: EditText? = null
    private var number2: EditText? = null
    private var btn: Button? = null
    private var result: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getControlView()
        setClickForButton()
    }

    private fun getControlView() {
        number1 = findViewById(R.id.editTextNumber1) as EditText
        number2 = findViewById(R.id.editTextNumber2) as EditText
        btn = findViewById(R.id.button) as Button
        result = findViewById(R.id.textView) as TextView
    }

    private fun setClickForButton() {
        btn!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var n1 = Integer.parseInt(number1!!.text.toString())
        var n2 = Integer.parseInt(number2!!.text.toString())

        var sum = n1 + n2
        var sub = n1 - n2
        var im = n1 * n2
        var div = n1 / n2

        result!!.text = "Toplama=" + sum +"\nÇıkarma="+sub+"\nÇarpma="+im+"\nBölme="+div

    }
}
