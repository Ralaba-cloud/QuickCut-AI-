package com.quickcut.ai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quickcut.ai.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    binding.title.text = "QuickCut AI – Test"
    binding.subtitle.text = "Ready to build"
    binding.button.setOnClickListener { binding.subtitle.text = "Export MP4 OK ✔" }
  }
}
