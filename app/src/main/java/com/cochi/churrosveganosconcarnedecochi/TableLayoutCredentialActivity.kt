package com.cochi.churrosveganosconcarnedecochi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TableLayoutCredentialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout_credential)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}