package com.example.recyclerview;
// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public ContactAdapter contactAdapter;
    public List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contactList = new ArrayList<>();
        // Agregar datos de ejemplo
        contactList.add(new Contact(R.drawable.telf, "Sofía Martínez López", " sofia.martinez.lopez@.com", "5679836708"));
        contactList.add(new Contact(R.drawable.telf, "Carlos Fernández Ramírez", "carlos.fernandez.ramirez@.com", "346893523"));
        contactList.add(new Contact(R.drawable.telf, "María González Pérez", "maria.gonzalez.perez@.com", "906871281"));
        contactList.add(new Contact(R.drawable.telf, "Luis Hernández Sánchez", "luis.hernandez.sanchez@.com", "346896702"));

        contactAdapter = new ContactAdapter(contactList);
        recyclerView.setAdapter(contactAdapter);
    }
}
