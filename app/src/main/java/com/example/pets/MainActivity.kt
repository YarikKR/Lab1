package com.example.pets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat=Animals(getString(R.string.name_cat),getString(R.string.discription_cat),R.drawable.cat)
        val dog=Animals(getString(R.string.name_dog),getString(R.string.discription_dog),R.drawable.dog)
        val donkey=Animals(getString(R.string.name_donkey),getString(R.string.discription_donkey),R.drawable.donkey)

        binding.buttonCat.setOnClickListener{val i= Intent(this,Discription_Activity::class.java)
            i.putExtra(ANIMAL, cat)
            startActivity(i)
        }

        binding.buttonDog.setOnClickListener{val i= Intent(this,Discription_Activity::class.java)
            i.putExtra(ANIMAL, dog)
            startActivity(i)
        }

        binding.buttonDonkey.setOnClickListener{val i= Intent(this,Discription_Activity::class.java)
            i.putExtra(ANIMAL, donkey)
            startActivity(i)
        }

    }

companion object{const val ANIMAL= "key_Animal"}

}