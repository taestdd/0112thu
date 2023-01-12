package com.opensurvey.a0112thu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//   확인버튼이 눌리면? 이벤트 달아주기

        enterBtn.setOnClickListener {
            val inputContent = contentEdt.text.toString()

            resultTxt.text = inputContent



        }

    }
}