package com.example.pr15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class signin : AppCompatActivity() {
    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var b:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
    }
    fun signin(view: View)
    {
        if(email.text.toString().isNotEmpty()&&password.text.toString().isNotEmpty()&&email.toString()=="ekts"&&password.toString()=="ekts2004")
        {
            val intent= Intent(this,GeoQuiz::class.java)
            startActivity(intent)
        }
        else
        {
            val alert= AlertDialog.Builder(this)
                .setTitle(getString(R.string.mistake))
                .setMessage(getString(R.string.zap))
                .setPositiveButton(getString(R.string.ok), null)
                .create()
                .show()
            b.setOnClickListener{view:View-> Toast.makeText(this,R.string.par,Toast.LENGTH_SHORT).show()}
        }
    }

}