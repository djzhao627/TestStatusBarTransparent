package cn.djzhao.teststatusbartransparent

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.OnApplyWindowInsetsListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/**
 * Activity3
 *
 * @author djzhao
 * @date 22/02/22
 */
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        window.statusBarColor = Color.TRANSPARENT

        val frameLayout = findViewById<ViewGroup>(android.R.id.content).getChildAt(0)

        // 给根布局(FrameLayout)添加padding
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout
        ) { v, insets ->
            // v代表根布局,内部整体下移
            v.setPadding(
                v.paddingLeft,
                // 通过systemWindowInsetTop来获取状态栏高度
                insets.systemWindowInsetTop,
                v.paddingRight,
                v.paddingBottom)
            // 同时可以在这里对其他元素的边距进行调整
            insets
        }

        // 沉浸式：可以延展到状态栏以下
        frameLayout.systemUiVisibility = SYSTEM_UI_FLAG_LAYOUT_STABLE or SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

    }



    fun back(view: View) {
        finish()
    }
}