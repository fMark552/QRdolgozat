package com.example.qrdolgozat;
import android.app.LauncherActivity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
public class ListaAdatok extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_adatok);
        ListView listView = findViewById(R.id.listView);
        AssetManager assetManager = getAssets();
        try {
            String fileName = "dolgozat.json";
            InputStream inputStream = assetManager.open(fileName);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            String json = new String(buffer, StandardCharsets.UTF_8);
            Type listType = new TypeToken<List<LauncherActivity.ListItem>>() {}.getType();
            List<LauncherActivity.ListItem> itemList = new Gson().fromJson(json, listType);
            PersonListAdapter adapter = new PersonListAdapter(this, R.layout.activity_person_list_adapter, itemList);
            listView.setAdapter(adapter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}