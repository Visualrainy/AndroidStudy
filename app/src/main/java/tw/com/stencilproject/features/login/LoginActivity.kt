package tw.com.stencilproject.features.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import tw.com.stencilproject.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val base = application.baseContext
        test.text = "123"
        val declaredField = base.javaClass.getDeclaredField("mPackageInfo")
        declaredField.isAccessible = true
        val packageInfo = declaredField.get(base)

//        Thread.sleep(20000)

        Log.d("Testing: ", packageInfo.toString())
    }
}
