package ajeng.tugasmobile.myschedule

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ajeng.tugasmobile.myschedule.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private var registeredUsername: String? = null
    private var registeredPassword: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registeredUsername = intent.getStringExtra("username")
        registeredPassword = intent.getStringExtra("password")

        binding.btnLogin.setOnClickListener {
            val inputUsername = binding.inputEmail.text.toString().trim()
            val inputPassword = binding.inputPassword.text.toString().trim()

            if (inputUsername == registeredUsername && inputPassword == registeredPassword) {
                val intent = Intent(this, ActivityPertama::class.java)
                intent.putExtra("username", registeredUsername)
                startActivity(intent)
                Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Username atau Password salah!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.createAccount.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.lupaPass.setOnClickListener {
            Toast.makeText(this, "Fitur 'Forgot Password' belum tersedia", Toast.LENGTH_SHORT).show()
        }
    }
}