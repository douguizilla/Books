package com.odougle.books.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object ImageBinding {
    @JvmStatic
    @BindingAdapter("app:imageUrl")
    fun setImageUrl(imageView: ImageView, url: String){
        if(url.isNotEmpty()){
            Glide.with(imageView.context)
                .load(url)
                .into(imageView)
        }
    }
}