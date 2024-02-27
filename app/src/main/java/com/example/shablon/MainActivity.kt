package com.example.shablon

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.shablon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val imageViewAnimator = ObjectAnimator.ofFloat(binding.imageView, "alpha", 0f, 1f)
        imageViewAnimator.duration = 2000

        val textNameAnimator = ObjectAnimator.ofFloat(binding.textName, "translationX", -200f, 0f)
        textNameAnimator.duration = 1500

        val adTextViewAnimator = ObjectAnimator.ofFloat(binding.adTextView, "translationX", -200f, 0f )
        adTextViewAnimator.duration = 1300

        val greetingTextAnimator = ObjectAnimator.ofFloat(binding.greetingText, "translationY", 200f, 0f)
        greetingTextAnimator.duration = 2500

        val btnPhoneAnimator = ObjectAnimator.ofFloat(binding.btnPhone, "translationX", 200f, 0f)
        btnPhoneAnimator.duration = 1400

        val btnEmailAnimator = ObjectAnimator.ofFloat(binding.btnEmail, "translationX", 200f, 0f)
        btnEmailAnimator.duration = 1000

        imageViewAnimator.start()
        textNameAnimator.start()
        adTextViewAnimator.start()
        greetingTextAnimator.start()
        btnPhoneAnimator.start()
        btnEmailAnimator.start()

        binding.btnEmail.setOnClickListener {
            val emailTextAnimator = ObjectAnimator.ofFloat(binding.emailText, "alpha", 0f, 1f)
            emailTextAnimator.duration = 1000
            emailTextAnimator.start()
        }
        binding.btnPhone.setOnClickListener {
            val phoneTextAnimator = ObjectAnimator.ofFloat(binding.textPhone, "alpha", 0f,1f)
            phoneTextAnimator.duration = 1000
            phoneTextAnimator.start()
        }

    }

}





