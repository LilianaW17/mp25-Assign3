package ajeng.tugasmobile.myschedule

import ajeng.tugasmobile.myschedule.databinding.ActivityMainBinding
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnMasuk.setOnClickListener {
            val namaUser = binding.inputNama.editableText.toString().trim()

            if(namaUser.isNotEmpty()){
                val intent = Intent(this, ActivityPertama::class.java)
                intent.putExtra("nama", namaUser)
                startActivity(intent)
            }
            else{
                binding.inputNama.error = "Nama Jangan Kosong"
            }
        }
    }
}