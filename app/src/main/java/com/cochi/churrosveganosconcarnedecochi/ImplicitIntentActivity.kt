package com.cochi.churrosveganosconcarnedecochi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        agregarAccionAlBotonWeb()
        agregarAccionAlBotonEmail()
    }

    private fun agregarAccionAlBotonEmail() {
        // obtener el enlace al botonEmail
        val botonCorreo = findViewById<Button>(R.id.buttonEmailMe)
        //asignar la acción al botonCorreo para que envíe un mensaje por correo
        botonCorreo.setOnClickListener {
            // definir al remitente
            val email = "maria@lopez.com"
            // inicializar el intent con el remitente
            val intentEmail = Intent(Intent.ACTION_SEND, Uri.parse(email))
            // agrega el asunto al correo
            intentEmail.putExtra(Intent.EXTRA_SUBJECT, "Hola desde android")
            // Agregar el mensaje al correo
            intentEmail.putExtra(Intent.EXTRA_TEXT, "Responde por favor no te hagas cochi")
            // agregar el destinatario
            intentEmail.putExtra(Intent.EXTRA_EMAIL, "convenencieros@del.sexto.a.matutino")
            // definir el tipo de contenido
            intentEmail.type = "text/plain"
            // ejecutar el intent
            startActivity(Intent.createChooser(intentEmail, "Enviar con..."))

        }
    }



    private fun agregarAccionAlBotonWeb() {
            // obtener el enlace al boton para enviar uri a web
            val botonWeb = findViewById<ImageButton>(R.id.imageButtonWeb)
            // asignar la acción al botonWeb para que llame al navegador
            botonWeb.setOnClickListener {
                // obtener el valor de la caja de texto de Web
                val textoWeb = findViewById<EditText>(R.id.editTextWeb).text
                // validar que no esté vacía la caja de texto
                if (textoWeb.isEmpty())
                // enviar mensaje de error, para que ingrese algo
                    Toast.makeText(this,"No te hagas cochi, escribe algo",Toast.LENGTH_SHORT).show()
                else {
                    // definir el intent implicito
                    val intentWeb = Intent()
                    // definir la acción para el intent
                    intentWeb.action = Intent.ACTION_VIEW
                    // convertir texto web a uri y pasarlo al data del intent
                    intentWeb.data = Uri.parse("https://$textoWeb")
                    // iniciar el intent - llamar al intent
                    startActivity(intentWeb)
                }
        }
    }
}