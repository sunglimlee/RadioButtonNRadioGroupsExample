package com.example.radiobuttonnradiogroupsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton: RadioButton
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup = findViewById(R.id.radiogroup)
        radioButton = findViewById(R.id.radio_one)
        textView = findViewById(R.id.text_view_selected)
        val button: Button = findViewById(R.id.button)
        textView = findViewById(R.id.text_view_selected)

        button.setOnClickListener {
            textView.text = radioButton.text.toString()
        }
    }

    fun checkButton(v: View) {
        var radioId: Int = radioGroup.checkedRadioButtonId
        radioButton = findViewById(radioId)
        Toast.makeText(this, "${radioButton.text} 라디오버턴이 눌러졌습니다.", Toast.LENGTH_SHORT).show()
        textView.text = radioButton.text.toString()
    }
}