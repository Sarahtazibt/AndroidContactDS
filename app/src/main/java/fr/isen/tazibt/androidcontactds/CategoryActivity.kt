package fr.isen.tazibt.androidcontactds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
//import com.google.gson.Gson
//import fr.isen.tazibt.androidcontactds.databinding.ActivityCategoryBinding
//import fr.isen.tazibt.androidcontactds.model.DataResult
//import fr.isen.tazibt.androidcontactds.model.Items
import org.json.JSONObject



class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
    }
}