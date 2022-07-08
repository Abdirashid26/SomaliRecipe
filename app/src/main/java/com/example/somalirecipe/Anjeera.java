package com.example.somalirecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Anjeera extends AppCompatActivity {

    Recipe recipe;
    TextView name,steps,ingredients;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anjeera);

        name = findViewById(R.id.name);
        ingredients = findViewById(R.id.Ingredients);
//        ingredients.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_view_list_24, 0, 0, 0);
        steps = findViewById(R.id.steps);
        listView = findViewById(R.id.list);

        recipe = (Recipe) getIntent().getSerializableExtra("Recipe");

        name.setText(recipe.getName());
        steps.setText(recipe.getSteps());

        ArrayAdapter<String> myAdapter = new ArrayAdapter(this, R.layout.custometext,recipe.getIngredients());

        listView.setAdapter(myAdapter);

    }
}