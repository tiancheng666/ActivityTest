package com.example.activitytest

import android.app.ProgressDialog.show
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            val data = "Hello SecondActivity"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("extra_data", data)
            startActivity(intent)
        }

        /*
        button1.setOnClickListener {
            Toast.makeText(this, "you click button1", Toast.LENGTH_SHORT).show()
        }
        */

        /*
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }*/
        /*
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:")
            startActivity(intent)
        }

         */
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(
                this, "you clicked Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(
                this, "you clicked remove", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}