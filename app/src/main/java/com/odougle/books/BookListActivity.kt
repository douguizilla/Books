package com.odougle.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.books.databinding.ActivityBookListBinding
import com.odougle.books.model.Book
import com.odougle.books.model.MediaType
import com.odougle.books.model.Publisher

class BookListActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBookListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        BookDetailsActivity.start(this,
        Book().apply {
            id = "1"
            title = "Dominando o Android com Kotlin"
            author = "Nelson Glauber"
            coverUrl = "https://s3.novatec.com.br/capas-ampliadas/capa-ampliada-9788575224632.jpg"
            pages = 954
            year = 2018
            publisher = Publisher("1","Novatec")
            available = true
            mediaType = MediaType.EBOOK
            rating = 5.0f
        }
        )
    }


}