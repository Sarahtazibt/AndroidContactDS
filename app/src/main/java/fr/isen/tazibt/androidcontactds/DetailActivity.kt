
package fr.isen.tazibt.androiderestaurant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.isen.tazibt.androidcontactds.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //  val items = intent.getSerializableExtra("dishes") as Items
        val objet = intent.extras?.get("extra_object") as Object



    }
}