package com.example.a11optionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = null
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    fun OnOptionsItemSelected(item: MenuItem):Boolean{
        return when(item.itemId){
            R.id.action_setting->{
                Toast.makeText(applicationContext,"Clicked on setting",Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_share->{
                Toast.makeText(applicationContext,"Clicked on share",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_exit->{
                Toast.makeText(applicationContext,"Clicked on exit",Toast.LENGTH_LONG).show()
                return true
            }
            else ->super.onOptionsItemSelected(item)

        }
    }
}