package vcmsa.projects.progicetask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister: Button = findViewById(R.id.btnRegister)
        val btnGoToLogin: Button = findViewById(R.id.btnGoToLogin)

        btnRegister.setOnClickListener {

        }

        btnGoToLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
