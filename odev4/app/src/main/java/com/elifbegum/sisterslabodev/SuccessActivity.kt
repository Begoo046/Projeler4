import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elifbegum.sisterslabodev.databinding.ActivitySuccessBinding

class SuccessActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.successText.text = "Numara başarılı bir şekilde kaydedildi."
    }
}