package com.basefile

import android.widget.Toast
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.LinearLayout.*
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ボタンを設定
        // ボタンを設定

        val Button1:Button = findViewById<Button>(R.id.button_1)  as Button

        val Button2:Button = findViewById<Button>(R.id.button_2)  as Button

        val Button3:Button = findViewById<Button>(R.id.button_3)  as Button

        val Button4:Button = findViewById<Button>(R.id.button_4)  as Button

        val Button5:Button = findViewById<Button>(R.id.button_5)  as Button

        val Button6:Button = findViewById<Button>(R.id.button_6)  as Button

        val Button7:Button = findViewById<Button>(R.id.button_7)  as Button

        val Button8:Button = findViewById<Button>(R.id.button_8)  as Button

        val Button9:Button = findViewById<Button>(R.id.button_9)  as Button

        val Button_Clear:Button = findViewById<Button>(R.id.button_Clear)  as Button

        val Button0:Button = findViewById<Button>(R.id.button_0)  as Button

        val Button_EXE:Button = findViewById<Button>(R.id.button_EXE)  as Button
        Button1.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button2.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button3.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button4.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button5.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button6.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button7.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button8.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button9.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button_Clear.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button_EXE.setOnClickListener {
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button0.setOnClickListener {
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
    }

}