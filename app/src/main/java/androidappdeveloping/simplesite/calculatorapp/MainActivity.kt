package androidappdeveloping.simplesite.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun allClearAction(view: android.view.View) {}
    fun backSpaceAction(view: android.view.View) {}
    fun equalsAction(view: android.view.View) {}
}