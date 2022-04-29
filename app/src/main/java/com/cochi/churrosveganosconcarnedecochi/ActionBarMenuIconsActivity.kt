package com.cochi.churrosveganosconcarnedecochi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TableLayout
import android.widget.Toast

class ActionBarMenuIconsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_menu_icons)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.MenuItemMainSaludar -> {
                //TODO: Codigo de saludar
                Toast.makeText(this, "Hola desde el menu", Toast.LENGTH_SHORT).show()
            }
            R.id.MenuItemMainIrA -> {
                //TODO: Codigo de ir a otro activity
                val intent = Intent(this, MainActivity::class.java)
                this.startActivity(intent)
                this.finish()
            }
            R.id.MenuItemMainAcercaDe -> {
                //TODO: Codigo de acerca de
                val intent =  Intent(this, TableLayoutCredentialActivity::class.java)
                this.startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}