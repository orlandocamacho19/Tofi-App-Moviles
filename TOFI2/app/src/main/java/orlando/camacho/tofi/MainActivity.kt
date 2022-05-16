package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.database.FirebaseDatabase
import orlando.camacho.tofi.databinding.ActivityMainBinding
import orlando.camacho.tofi.databinding.ActivityRegistroBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonLogo: ImageView = findViewById(R.id.ivLogo)

        botonLogo.setOnClickListener {
            var intent: Intent = Intent (this, iniciar_sesion::class.java)
            startActivity(intent)
        }
    }
}