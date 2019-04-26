package univo.prograiv.tresfragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnFragmento: Button

    private lateinit var fragment1: BlankFragment1
    private lateinit var fragment2: BlankFragment2
    private lateinit var fragment3: BlankFragment3

    private var decicion = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragmento = findViewById(R.id.btnFragmento)
        btnFragmento.setOnClickListener{
            insertFragment(it)
        }

    }

    private fun insertFragment(view: View){
        //Toast.makeText(this, "Changing Fragments", Toast.LENGTH_LONG).show()
        fragment1 = BlankFragment1()
        fragment2 = BlankFragment2()
        fragment3 = BlankFragment3()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        if (decicion == 0){
            transaction.replace(R.id.container, fragment1)
            transaction.addToBackStack(null)
            transaction.commit()
            decicion++
        }

        else if (decicion == 1){
            transaction.replace(R.id.container, fragment2)
            transaction.addToBackStack(null)
            transaction.commit()
            decicion++
        }

        else if (decicion == 2){
            transaction.replace(R.id.container, fragment3)
            transaction.addToBackStack(null)
            transaction.commit()
            decicion = 0
        }

    }
}