package jaime.galiana.ejercicioenviarrecibir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MostrarResultadoActivity extends AppCompatActivity {
    private TextView lbResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_resultado);

        lbResultado = findViewById(R.id.lbResultado);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String mensaje = bundle.getString("MSG");
            lbResultado.setText(mensaje);
        }
    }
}