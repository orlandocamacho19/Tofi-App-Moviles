package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import orlando.camacho.tofi.databinding.ActivityRegistroBinding
import java.util.regex.Pattern

class registro : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.btnRegistrarseRegistro.setOnClickListener {
            val mName = binding.etUsuarioRegistro.text.toString()
            val mEmail = binding.etCorreoRegistro.text.toString()
            val mPassword = binding.etContraseniaRegistro.text.toString()
            val mRepeatPassword = binding.etContraseniaRepRegistro.text.toString()

            val passwordRegex = Pattern.compile("^" + "(?=.*[-@#$%^&+=])" + ".{6,}" + "$")

            if (mName.isEmpty()){
                Toast.makeText(this, "Ingrese un nombre.", Toast.LENGTH_SHORT).show()
            }else if (mEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()) {
                Toast.makeText(this, "Ingrese un email valido.", Toast.LENGTH_SHORT).show()
            } else if (mPassword.isEmpty() || !passwordRegex.matcher(mPassword).matches()){
                Toast.makeText(this, "La contraseña es debil.",Toast.LENGTH_SHORT).show()
            } else if (mPassword != mRepeatPassword){
                Toast.makeText(this, "Confirma la contraseña.",Toast.LENGTH_SHORT).show()
            } else {
                createAccount(mEmail, mPassword)
                // Meter en la realtimedb el correo
            }
        }

        binding.btnArasRegistro.setOnClickListener {
            val intent = Intent(this, iniciar_sesion::class.java)
            startActivity(intent)
        }
    }

    private fun createAccount(email:String, password:String){
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                Log.w("TAG", "createUserWithEmail:success", task.exception)
                reload()
            } else {
                Log.w("TAG", "createUserWithEmail:failure", task.exception)
                Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun reload(){
        val intent = Intent(this, configurar_perfil::class.java)
        this.startActivity(intent)
    }

}