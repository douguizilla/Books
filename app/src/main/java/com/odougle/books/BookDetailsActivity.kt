package com.odougle.books

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.books.databinding.ActivityBookDetailsBinding
import com.odougle.books.model.Book
import org.parceler.Parcels

class BookDetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBookDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailsBinding.inflate(layoutInflater)

        val book = Parcels.unwrap<Book>(intent.getParcelableExtra(EXTRA_BOOK))
        if(book != null){
            binding.book = book
        }

        setContentView(binding.root)
    }

    companion object{
        private const val EXTRA_BOOK = "book"

        fun start(context: Context, book: Book){
            context.startActivity(
                Intent(context, BookDetailsActivity::class.java).apply {
                    putExtra(EXTRA_BOOK, Parcels.wrap(book))
                }
            )
        }
    }
}