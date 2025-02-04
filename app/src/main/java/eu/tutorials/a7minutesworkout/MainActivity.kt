package eu.tutorials.a7minutesworkout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import eu.tutorials.a7minutesworkout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //  The binding is name just like the name of the layout with Binding attached
    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener {
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }

        //TODO(Step 8 : Adding a click event to the BMI calculator button and navigating it to the BMI calculator feature.)
        //START
        binding?.flBMI?.setOnClickListener {
            // Launching the BMI Activity
            val intent = Intent(this, BMIActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}