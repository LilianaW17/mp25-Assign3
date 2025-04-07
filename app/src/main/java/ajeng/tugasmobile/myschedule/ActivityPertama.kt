package ajeng.tugasmobile.myschedule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ajeng.tugasmobile.myschedule.databinding.ActivityPertamaBinding

class ActivityPertama : AppCompatActivity() {
    private lateinit var binding: ActivityPertamaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPertamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username") ?: "User"
        binding.txtHello.text = "Hello, $username"
    }
}