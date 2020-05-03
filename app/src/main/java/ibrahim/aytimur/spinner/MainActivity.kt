package ibrahim.aytimur.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var yazilimDilleri = resources.getStringArray(R.array.YazilimDilleri)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,yazilimDilleri)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?, view: View?,
                                            position: Int, id: Long) {
                    Toast.makeText(applicationContext,"Seçilen dil:" + yazilimDilleri[position],
                    Toast.LENGTH_SHORT).show()
                    textView.text = yazilimDilleri[position]

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }
    }
}
