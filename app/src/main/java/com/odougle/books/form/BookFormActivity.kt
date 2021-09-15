package com.odougle.books.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.books.databinding.ActivityBookFormBinding

class BookFormActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBookFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}