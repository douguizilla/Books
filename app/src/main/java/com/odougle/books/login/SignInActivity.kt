package com.odougle.books.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.odougle.books.R
import com.odougle.books.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private val binding : ActivitySignInBinding by lazy<ActivitySignInBinding> {
        DataBindingUtil.setContentView(this, R.layout.activity_sign_in)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}