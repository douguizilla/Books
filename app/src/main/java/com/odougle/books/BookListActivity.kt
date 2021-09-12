package com.odougle.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.books.databinding.ActivityBookListBinding

class BookListActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBookListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}