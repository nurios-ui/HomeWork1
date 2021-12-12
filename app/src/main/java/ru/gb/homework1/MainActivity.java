package ru.gb.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nameTV;
    private Button changeNameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
  /*      setContentView(R.layout.activity_main);

        nameTV = findViewById(R.id.name_text_view);
        changeNameButton = findViewById(R.id.change_name_button);

        changeNameButton.setOnClickListener(view -> nameTV.setText("Chupakabra"));

        Toast.makeText(MainActivity.this, "Kavabanga", Toast.LENGTH_SHORT).show();
  */
    }
}