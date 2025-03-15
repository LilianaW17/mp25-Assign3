package ajeng.tugasmobile.myschedule

import ajeng.tugasmobile.myschedule.databinding.ActivityPertamaBinding
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityPertama : AppCompatActivity() {
    private lateinit var binding: ActivityPertamaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPertamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val namaUser = intent.getStringExtra("nama")
        binding.textHalo.text = "Halo, $namaUser!"

        binding.enterKabar.setOnClickListener {
            val kabarUser = binding.inputKabar.text.toString()

            if (kabarUser.isNotEmpty()) {
                binding.reaksiKabar.text = "Wah, Baiklah"
            }
        }

        binding.matkulSatu.setOnClickListener {
            binding.infoMKsatu.text = "Mata Kuliah: Pemrograman Mobile \nJadwal: Senin\n08:00 - 10:00"
        }
        binding.matkulDua.setOnClickListener {
            binding.infoMKdua.text = "Mata Kuliah: Logika Fuzzy\nJadwal: Rabu\n13:00 - 14:20"
        }
    }
}