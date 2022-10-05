package com.angel.practica1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.angel.practica1.databinding.ActivityScrollingBinding
import com.bumptech.glide.load.engine.DiskCacheStrategy


class ScrollingActivity : AppCompatActivity() {

private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage1()
        loadImage2()
        loadImage3()
        loadImage4()


        val link1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Willyrex"))
        val link2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Vegetta777"))
        val link3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Abella_Danger"))
        val link4 = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Lana_Rhoades"))

        binding.content.btnwiki1.setOnClickListener{
            startActivity(link1)
        }
        binding.content.btnwiki2.setOnClickListener{
            startActivity(link2)
        }
        binding.content.btnwiki3.setOnClickListener{
            startActivity(link3)
        }
        binding.content.btnwiki4.setOnClickListener{
            startActivity(link4)
        }
    }

    private fun loadImage1(url: String = "https://www.mejorinfluencer.com/wp-content/uploads/2019/09/Willyrex-Wiki-Youtuber-Espa%C3%B1a.png"){
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard1)
    }
    private fun loadImage2(url: String = "https://static.wikia.nocookie.net/youtubepedia/images/0/00/Vejetasietesietesiete.jpg/revision/latest?cb=20200509232029&path-prefix=es"){
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard2)
    }
    private fun loadImage3(url: String = "https://i1.sndcdn.com/artworks-v96ImZepqSZK1X3q-vvsuOQ-t500x500.jpg"){
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard3)
    }
    private fun loadImage4(url: String = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRU_Pvrcz4mzn6y1H494CB_RrqZkEYrDesglw&usqp=CAU"){
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard4)
    }

override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


}