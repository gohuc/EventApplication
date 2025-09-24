package com.example.eventapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.eventapplication.ui.theme.EventApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var imgRobot: ImageView
    private lateinit var txtComment: TextView
    private lateinit var editTextName: EditText
    private lateinit var butn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgRobot = findViewById(R.id.imageView)
        txtComment = findViewById(R.id.textView)
        editTextName = findViewById(R.id.editText)
        butn = findViewById(R.id.btn)

        butn.setOnClickListener {
            onOkButtonClicked()
        }
    }

    private fun onOkButtonClicked() {
        val name = editTextName.text.toString().trim()

        if (name.isNotEmpty()) {

            butn.visibility = View.GONE
            txtComment.visibility = View.GONE

            txtComment.text = "Поздравляю, $name, Вы сели"
        } else {
            Toast.makeText(this, "Пожалуйста, введите ваше имя", Toast.LENGTH_SHORT).show()
        }


    }
}
