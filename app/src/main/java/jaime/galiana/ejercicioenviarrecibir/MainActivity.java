package jaime.galiana.ejercicioenviarrecibir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtFrase;
    private Button btnPalabras;
    private Button btnCaracteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();

                if (frase.length()>0){
                    int contarPalabras = frase.split(" ").length;
                    String mensaje = "El numero de palabras es "+contarPalabras;
                    crearNuevaActividad(mensaje);

                }else {
                    Toast.makeText(MainActivity.this, "ESCRIBE ALGO!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();

                if (frase.length()>0){
                    int contarPalabras = frase.trim().length();
                    String mensaje = "El numero de palabras es "+contarPalabras;
                    crearNuevaActividad(mensaje);

                }else {
                    Toast.makeText(MainActivity.this, "ESCRIBE ALGO!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void crearNuevaActividad(String mensaje) {
        Intent intent = new Intent(MainActivity.this, MostrarResultadoActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("MSG", mensaje);

        intent.putExtras(bundle);
        startActivity(intent);

    }

    private void inicializarVista() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
    }
}