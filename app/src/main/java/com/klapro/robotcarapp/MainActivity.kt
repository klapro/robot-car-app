package com.klapro.robotcarapp

import android.content.pm.ActivityInfo
import android.content.pm.ActivityInfo.*
import android.net.Uri
import android.opengl.Visibility
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.alexvas.rtsp.widget.RtspSurfaceView
import com.klapro.robotcarapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var hasScreen: Boolean = false
    private lateinit var svVideo: RtspSurfaceView
    private lateinit var tryConnectVideoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setRequestedOrientation(SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(binding.root)

        svVideo = findViewById(R.id.svVideo);
        tryConnectVideoButton = findViewById(R.id.tryCameraBtn)

        tryConnectVideoButton.setOnClickListener {
            tryConnectingToTheCamera()
        }
//        svVideo.start(requestVideo = true, requestAudio = false)
    }

    fun tryConnectingToTheCamera() {
        // TODO
        tryConnectVideoButton.visibility = View.GONE
    }



}