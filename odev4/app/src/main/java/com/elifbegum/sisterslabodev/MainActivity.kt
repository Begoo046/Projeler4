import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elifbegum.sisterslabodev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val name = binding.edtText.text.toString()
            val phoneNumber = binding.editTextPhone.text.toString()

            if (name.isEmpty() || phoneNumber.isEmpty()) {
                // Gerekli alanları doldurun uyarısı
                return@setOnClickListener
            }

            // Numarayı kaydetme işlemi burada yapılabilir
            // Örneğin: Bir veritabanına veya başka bir kaynakta saklama işlemi

            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
        }
    }
}