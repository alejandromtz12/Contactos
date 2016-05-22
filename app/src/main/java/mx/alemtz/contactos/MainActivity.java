package mx.alemtz.contactos;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    TextInputEditText nombre, telefono, email, descripcion;
    DatePicker fecha;
    int dia,mes,anio;
    Button next;

    String c_nombre,c_telefono,c_email,c_descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (TextInputEditText) findViewById(R.id.nombre);
        telefono = (TextInputEditText) findViewById(R.id.telefono);
        fecha = (DatePicker) findViewById(R.id.datePicker);
        email = (TextInputEditText) findViewById(R.id.email);
        descripcion = (TextInputEditText) findViewById(R.id.descripcion);
        next = (Button) findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                c_nombre = nombre.getText().toString();
                c_telefono= telefono.getText().toString();
                dia=fecha.getDayOfMonth();
                mes=fecha.getMonth();
                anio=fecha.getYear();
                c_email= email.getText().toString();
                c_descripcion=descripcion.getText().toString();

                Intent intent = new Intent(MainActivity.this,VistaDatos.class);
                intent.putExtra("nombre",c_nombre);
                intent.putExtra("telefono",c_telefono);
                intent.putExtra("dia",dia);
                intent.putExtra("mes",mes);
                intent.putExtra("anio",anio);
                intent.putExtra("email",c_email);
                intent.putExtra("descripcion",c_descripcion);
                startActivity(intent);
            }
        });



    }




}
