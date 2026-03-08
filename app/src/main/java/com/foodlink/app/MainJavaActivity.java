package com.foodlink.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Habilita el diseño de borde a borde (edge-to-edge)
        EdgeToEdge.enable(this);
        
        // Define el diseño de la actividad usando el archivo XML
        setContentView(R.layout.activity_main);

        // Ejemplo de cómo encontrar una vista por su ID y cambiar el texto
        TextView textView = findViewById(R.id.greeting_text);
        textView.setText("¡Hola desde Java!");

        // Ajustar el padding para que el contenido no quede debajo de las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.greeting_text), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
