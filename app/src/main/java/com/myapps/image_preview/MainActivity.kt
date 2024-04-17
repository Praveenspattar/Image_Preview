package com.myapps.image_preview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var miniImage: ImageView
    private lateinit var uploadButton: Button
    private lateinit var viewButton: Button
    private var selectedImageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        miniImage = findViewById(R.id.hintimg)
        uploadButton = findViewById(R.id.uploadButton)
        viewButton = findViewById(R.id.viewButton)

        uploadButton.setOnClickListener {
            openGallery()
        }

        viewButton.setOnClickListener {
            if (selectedImageUri != null) {
                miniImage.visibility = View.INVISIBLE
                imageView.setImageURI(selectedImageUri)
            }
        }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK) {
            data?.let {
                selectedImageUri = it.data
            }
        }
    }

    companion object {
        private const val PICK_IMAGE_REQUEST = 1
    }
}