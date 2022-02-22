package cn.djzhao.teststatusbartransparent

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Activity2
 *
 * @author djzhao
 * @date 22/02/22
 */
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        window.statusBarColor = Color.TRANSPARENT
    }

    fun back(view: View) {
        finish()
    }
}