package com.example.somalirecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<MaterialCardView> recipes  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recipes = new ArrayList<>();

//        add the items to the recipe list
        recipes.add(findViewById(R.id.food1));
        recipes.add(findViewById(R.id.food2));
        recipes.add(findViewById(R.id.food3));
        recipes.add(findViewById(R.id.food4));
        recipes.add(findViewById(R.id.food5));
        recipes.add(findViewById(R.id.food6));
        recipes.add(findViewById(R.id.food7));
        recipes.add(findViewById(R.id.food8));
        recipes.add(findViewById(R.id.food9));
        recipes.add(findViewById(R.id.food10));
        recipes.add(findViewById(R.id.food11));
        recipes.add(findViewById(R.id.food12));
        recipes.add(findViewById(R.id.food13));
        recipes.add(findViewById(R.id.food14));
        recipes.add(findViewById(R.id.food15));
        recipes.add(findViewById(R.id.food16));

//        create the Items



        recipes.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Anjeera",20, Arrays.asList(new String[]{"1 1/2 cups all-purpose flour","1/2 cup rye flour","2 teaspoons baking powder","1/2 teaspoon fine salt","2 3/4 cups club soda","2 3/4 cups club soda","Nonstick spray, for greasing"}),"" +
                        "1. Put the all-purpose flour, rye flour, baking powder and salt in a food processor and pulse until blended. Pour the club soda into a measuring cup and add the vinegar. Pour the liquid into the processor as it is running and mix until the batter is very smooth. Let sit for 10 minutes.\n" +
                        "2. Heat a 10-inch nonstick skillet over medium heat. Spray the skillet with a thin coating of nonstick spray. Make the injera the way you make a crepe: Remove the skillet from the heat and tilt the edge farther from you down toward the floor. Pour 1/3 cup of the batter in a pool slightly off-center further from you, and then quickly swirl the pan so that the batter covers the entire surface. Place the pan back on the heat, cover with a lid and cook until the edges start pulling from the pan and the top is shiny and slightly dry, 90 seconds to 2 minutes. Peel the injera from the pan and transfer to a plate, top-side up. Serve cool.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });

        recipes.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Malowax",20, Arrays.asList(new String[]{"2 cups all-purpose flour","2 1/2 cups milk","2 large eggs","1 tablespoon granulated sugar","1/2 teaspoon ground cardamom","1/2 teaspoon ground ginger","Pinch kosher salt","2 tablespoons canola oil or butter ,for frying","Honey, butter, or sugar, for garnish"}),"" +
                        "" +
                        "Begin by whisking together the flour, sugar and salt in a bowl. Then add the milk and egg and whisk this together until you have a smooth consistency.\n" +
                        "\n" +
                        "Heat 1 teaspoon of vegetable oil on a griddle or in a non-stick pan. Spoon the pancakes onto the griddle and use the base of the ladle to spread the batter. Cook until the top of the pancake is translucent.\n" +
                        "\n" +
                        "Pour 1/2 tsp of vegetable (or sunflower) oil onto the pancake and flip. Let the base cook until its golden brown and crisp, 1 to 2 minutes. Using a spatula, transfer the pancakes to a serving plate.\n" +
                        "\n" +
                        "Wipe the griddle clean with paper towels, add more oil, and repeat with the remaining batter. Serve the pancakes while still hot with chocolate, or granulated sugar if desired.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });

        recipes.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Sabaayad",20, Arrays.asList(new String[]{"4 cups all-purpose flour","1 teaspoon salt","3 tablespoon","2 tablespoons honey","1 1/2 cups lukewarm water","2 tablespoons canola oil,divide, or more as needed(optional)"}),"Step 1\n" +
                        "Combine flour and salt in a large bowl. Stir in olive oil and honey. Mix in water gradually until dough comes together and is the consistency of pizza dough. Knead by hand until soft and very smooth, about 10 minutes.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Brush top of dough with a little bit of canola oil. Cover with plastic wrap and set aside to rest, at least 30 minutes and up to 2 hours.\n" +
                        "\n" +
                        "Step 3\n" +
                        "Divide dough into 10 equal pieces. Roll out 1 piece into a circle on a lightly floured work surface. Brush the top of the dough evenly with canola oil. Fold sides in to meet in the center. Fold top and bottom edges to meet in the center to make a square shape. Repeat with remaining pieces.\n" +
                        "\n" +
                        "Step 4\n" +
                        "Preheat a large skillet over medium heat.\n" +
                        "\n" +
                        "Step 5\n" +
                        "Roll 1 square of dough into a circle again on a lightly floured work surface. Place in the skillet and cook until slightly puffed, 1 to 2 minutes. Drizzle a little bit of oil on top and flip; continue cooking until golden brown and crispy, 1 to 2 minutes more. Transfer to a plate and cover with a clean kitchen towel to keep sabaayad warm and soft. Repeat with remaining pieces.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });

        recipes.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Mushaari",20, Arrays.asList(new String[]{"1 cup of Milk"," 1 tbsp, butter","1/2 cup of sorghum","2 tbsp, sugar","1 tbsp olive oil","3 glasses of water","Salt","1 tsp black pepper(ground)"}),
                        "Add water and milk in a cooking pot and simmer until the mixture boils.\n" +
                                "Add the sugar and black pepper then stir.\n" +
                                "In a bowl, add the flour and water then stir until the flour fully dissolves in water. Pour it in the cooking pot and stir for three minutes with a cooking stick\n" +
                                "Add the olive oil, butter, and salt as you stir. Leave to cook for about 10 minutes.\n" +
                                "Taste to see how you can adjust the seasoning.\n" +
                                "Serve while hot. Add a drop of olive oil while serving.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);            }
        });
        recipes.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Ful Medames",20, Arrays.asList(new String[]{"2 cans Ful or Mixed Ful and chickpeas","2 tbsp olive oil","1/2 onion","1 tomato large","1 cup parsley chopped","1/2 lemon juice","1/3 cup water or reserved ful luquid","1 tsp onion powder","1.5 tsp cumin","1/4 tsp paprika","1/2 tsp salt","Dash black pepper per refrence","Extra olive oil for granish"}),
                        "Start by finely dicing the onion and cooking in the olive oil on medium heat for 3-4 minutes\n" +
                                "Drain and rinse the ful and chickpeas and place in a large plate. Mash well with a fork\n" +
                                "Add the mashed ful and chickpeas to the pan and continue cooking for 5 minutes. Add all the seasoning and mix well\n" +
                                "Dice the tomato and add to the pan. Mix well and continue to cook for a few minutes. Add the water if the mixture looks dry.\n" +
                                "Taste and adjust for seasoning. Turn off the heat and add the lemon juice and chopped parsley. Mix well\n" +
                                "Serve in a platter and garnish with tomato, parsley, and olive oil. Eat with pita bread and enjoy!");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Oodkac",20, Arrays.asList(new String[]{"1 kg Odka meat Beef steak, cut into oodkac","1 tsp Salt","1 tsp Xawaash (Somali Spice)","1/2 tsp Cardamom Powder","1 medium onion sliced evenly","3 cups Vegetable oil"}),
                        "In a pot, on high heat, add the meat and keep stirring so it does not stick to the bottom. Do not cover the pot.\n" +
                                "\n" +
                                "Once the meat has started to produce its juice add the salt and spice powder. Let the meat cook, on high heat. Do not cover the pot otherwise it will produce a lot more juice.\n" +
                                "\n" +
                                "When the juice is almost gone (like only 1/4 cup left), pour out the meat into a bowl, with the juice.\n" +
                                "\n" +
                                "In the same pot, add the vegetable oil. \n" +
                                "\n" +
                                "When the oil is hot, add the onions and fry until it is brown. This step is mainly to flavour the meat. Keep stirring the onions so it browns evenly. \n" +
                                "\n" +
                                "Once the onion has browned evenly, use a perforated spoon and remove it all from the pot.\n" +
                                "\n" +
                                "Using the perforated spoon, scoop the meat into the hot oil. Do not add the leftover juice at this stage, just the meat.\n" +
                                "\n" +
                                "Keep stirring gently to make sure the meat is cooked evenly, otherwise only one side will be brown and the other won’t. When stirring do it gently.\n" +
                                "\n" +
                                "Just when the meat is brown add the juice (just for flavour). Keep stirring the meat gently.\n" +
                                "\n" +
                                "When the meat is starting to become dark brown add the cardamom powder and stir a few times gently. \n" +
                                "\n" +
                                "Switch the heat off when the meat is very brown. Do not wait for it to be black because the meat will become darker as it cools down in the hot oil. \n" +
                                "\n" +
                                "Once the meat has cooled down completely, use the perforated spoon to scoop out the meat into a storage container with a lid.\n" +
                                "\n" +
                                "Leave the oil in the pot, but put the pot in a slanted position. That will allow the oil to separate from the leftover brown stuff from the meat. \n" +
                                "\n" +
                                "When the oil has separated pour it carefully in the storage container that has the odkac. \n" +
                                "\n" +
                                "Store in a cool dry place. \n" +
                                "\n" +
                                "When scooping out the odkac use a spoon, do not allow your hands to touch the meat. This also means not putting leftover odkac from your plate back into the storage container.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Bariis Iskukaris",20, Arrays.asList(new String[]{"2 teaspoons vegetable oil","150g onion, chopped","4 or 5 cloves of garlic, finely chopped","1 cinnamon stick, or 1 teaspoon ground cinnamon","1 teaspoon cumin seeds","120g fresh tomatoes, chopped","600g skinless chicken thighs with bone, washed ","1 teaspoon ground turmeric","1 teaspoon cumin powder","2 teaspoons ground coriander","1 reduced-salt seasoning cube, crumbled","100g carrots, grated","200g basmati rice, washed and drained","600ml water"}),
                        "Heat the oil in a large saucepan, and gently fry the onions and garlic on medium heat for 2 minutes. Add the cinnamon stick (or ground cinnamon), cumin seeds and chopped tomatoes, and cook for 3 minutes on medium heat, stirring frequently.\n" +
                                "\n" +
                                "Add the chicken, turmeric, cumin powder, coriander, crumbled seasoning cube and grated carrot. Mix well and cook on medium-high heat for about 5 minutes, stirring regularly.\n" +
                                "\n" +
                                "Information:\n" +
                                "You can use other cuts of chicken, like wings or drumstick, if you prefer. Remove the skin to reduce fat content.\n" +
                                "\n" +
                                "Add 400ml water, cover the pot and leave to cook on medium heat for 15 minutes, until the chicken is nearly done.\n" +
                                "\n" +
                                "Add the rice and stir until it's well coated by the mixture. Add in another 200ml of cold water, stir, then cover the pot and cook on medium-high heat until it starts bubbling (about 5 minutes or so). Once it's bubbling, reduce the heat to low and leave to steam until the rice grains are tender and fluffy – around 10 to 15 minutes.\n" +
                                "\n" +
                                "Information:\n" +
                                "If you're batch cooking, this meal freezes brilliantly.\n" +
                                "\n" +
                                "Once ready, serve topped with fresh coriander (if you want) and accompanied by a fresh green salad. Enjoy!");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Baasto",20, Arrays.asList(new String[]{" ½ kg pasta (spaghetti)","½ kg minced meat","1 onion, diced finely","2 cloves garlic, minced","5 ripe tomatoes, diced","3 tablespoons tomato puree","A small bunch of coriander leaves, chopped","Salt to taste","2 tablespoons olive oil"}),
                        "1. Add a big pan of salted water to the boil.\n" +
                                "2. Include the pasta, stir periodically to make sure the pasta does not stick to the pan.\n" +
                                "3. Cook the pasta till it is 'al dente', meanings that the pasta must be cooked, yet firm to the your teeths when you chew it.\n" +
                                "4. Drain the pasta, however do not wash as this will certainly remove the starch which enables absorb the sauce.\n" +
                                "\n Preparing the bolognese sauce\n" +
                                "1. Pan fry the onion till gently browned.\n" +
                                "2. Include the minced meat plus brown the meat.\n" +
                                "3. Include the garlic and cook for roughly a minute.\n" +
                                "4. Include the diced tomatoes and tomato mix and stir constantly till completely absorbed. This must take around 5 mins.\n" +
                                "5. Minimize to low heat and simmer for about 10 mins to let the sauce to thicken.\n");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Cambuulo",20, Arrays.asList(new String[]{"1 1/2 cups Adzuki beans","½ cup (100 g) White corn – Hulled & cracked","6 cups (1.5 litres) Water – For soaking or boiling","2 cups (574 mL) Water – For cooking","½ tsp (2.5 mL) Salt"}),
                        "Wash the beans and corn (or soft wheat).\n" +
                                "Soak overnight with six cups of water.\n" +
                                "Drain and wash with cold water.\n" +
                                "Place the beans in a 4 litre pot, then add 2 cups of water. If you wish to do so, now is the time to add uncooked, washed rice. If adding rice, add ½ cup more water.\n" +
                                "Cover and cook on medium heat for 15 minutes.\n" +
                                "After the 15 minutes, add the salt. Set the heat to low and cook for a further 5 minutes.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Maraq Digaag",20, Arrays.asList(new String[]{"1 – 4.5lb (2 kg) Chicken (skinned & cut into small pieces)","3 Tomatoes","½ Onion","½ Green pepper","1 Jalapeno (seeded)","4 Garlic cloves","1  Potato","1 Carrot","3 Tbsp Vegetable or canola oil","2 tsp  Tomato paste","1 cup  Fresh cilantro","1 Tbsp  Vegetable seasoning","1 cup  Water","2 Tbsp  Ghee (optional)"}),
                        "" +
                                "Roughly chop the tomatoes, cilantro, green pepper, and onion, then blend.\n" +
                                "\n" +
                                "Dice the potato and carrot.\n" +
                                "\n" +
                                "Add the oil to a pot set on medium heat and add the xawaash. Immediately after, add the chicken pieces. You don’t want the spices to burn. Brown the chicken for about 2 minutes then add the vegetable seasoning.\n" +
                                "\n" +
                                "Add the diced potatoes and carrots to the pot, then add the blended veggies. Add the tomatoes and the water, then cover and cook for 30 minutes.\n" +
                                "\n" +
                                "Add 2 tablespoons of ghee or clarified butter (optional).");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Muufo",20, Arrays.asList(new String[]{"1 cup semolina flour fine","2 Tablespoons yogurt plain","1/2 cup water warm","1 packet yeast","1 teaspoon salt","1 teaspoon fenugreek ground","1 cup flour plain","1 cup self rising flour","3 Tablespoons sugar","1 Tablespoon oil for skillets"}),
                        "" +
                                "Mix together the semolina, yogurt, yeast, salt and fenugreek powder.\n" +
                                "Add warm water to make a thin batter. Mix well.\n" +
                                "Cover and put in warm spot overnight to rise\n" +
                                "Add in the plain flour and self-rising flour along with the sugar.\n" +
                                "Mix well and add enough water a cup or more to get a thick batter, add just a little at a time to get the right consistency. Knead for about 5 minutes.\n" +
                                "Cover and set aside another 2 hours.\n" +
                                "Knead again and separate batter into 4 pieces\n" +
                                "Oil the skillets and press the dough into the skillets\n" +
                                "Cook on medium high until golden on the bottom and flip over.\n" +
                                "Cook until golden and enjoy hot.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Sambuso",20, Arrays.asList(new String[]{"1 (14 ounce) package spring roll wrappers","2 tablespoons olive oil","2 pounds ground beef","1 leek, chopped","2 teaspoons ground cumin","2 teaspoons ground cardamom","1 teaspoon salt","1 teaspoon pepper","1 small onion, finely chopped","1 clove garlic, minced","1 tablespoon all-purpose flour","1 tablespoon water, or as needed","1 quart oil for frying"}),
                        "" +
                                "Step 1\n" +
                                "Heat olive oil in a large skillet over medium heat. Add onions, leek and garlic, and cook, stirring until the onions are transparent. Add ground beef, and cook until about halfway done. Season with cumin, cardamom, salt and pepper. Mix well, and continue cooking until beef has browned.\n" +
                                "\n" +
                                "Step 2\n" +
                                "In a small dish or cup, mix together the flour and water to make a thin paste. Using one wrapper at a time, fold into the shape of a cone. Fill the cone with the meat mixture, close the top, and seal with the paste. Repeat until wraps or filling are used up.\n" +
                                "\n" +
                                "Step 3\n" +
                                "Heat the oil to 365 degrees F ( 170 degrees C) in a deep-fryer or deep heavy pot. There should be enough oil to submerge the wraps. Fry the Sambusa a few at a time until golden brown. Remove carefully to drain on paper towels.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Nafaqo",20, Arrays.asList(new String[]{"3 potatoes","1 egg","1 cup chicken stock","1 cup plain flour , dived in half","1/4 tsp turmeric","1/4 tsp salt","oil (for frying )"}),
                        "" +
                                "Boil the potatoes and egg until fully cooked.\n" +
                                "Heat the chicken stock.\n" +
                                "Add the Flour and stir until smooth. Using a whisk will help make it smooth faster.\n" +
                                "Add the turmeric and stir well.\n" +
                                "Once the egg is fully cooked, remove the shell and cut it into 4 pieces.\n" +
                                "Once the potatoes are cooked, remove the skins and mash. Slowly add the rest of the flour. The potatoes should be like a dough. You may not need the full 1/2 cup of flour, it depends on how big the potatoes are.\n" +
                                "Once the potatoes are dough like, pinch some off and flatten.\n" +
                                "Add one piece of egg in the middle and bring the potato around it to fully cover the egg.\n" +
                                "Shape it into a circle or oval.\n" +
                                "Heat a pan of oil on the stove.\n" +
                                "Dip each potato ball into the stock mixture and coat well.\n" +
                                "Drop it into hot oil and fry until crisp, about 1-2 minutes.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Xalwo",20, Arrays.asList(new String[]{"Water: ¾ cup (for diluting corn flour)","Oil: 4 tbsp","Unsalted butter: 4 tbsp","Cardamom: 3","Nutmeg: 3","Yellow and orange food color: a pinch"}),
                        "1. Heat up a pan.\n" +
                                "2. Include white sugar and brown sugar.\n" +
                                "3. Include 3 cupfuls of water and blend the combination nicely.\n" +
                                "4. Let the mix to boil until both the brown and white sugars are totally liquefied.\n" +
                                "5. Include the powder nutmeg and cardamom.\n" +
                                "6. Minimize the fire and include the corn flour mix gradually.\n" +
                                "7. Cook by continually stirring.\n" +
                                "8. Now begin including the butter-oil gradually at consistent periods without stopping the stirring.\n" +
                                "9. The butter-oil will certainly get absorbed in the halwa.\n" +
                                "10. Remain to stir and cook, ensuring that the halwa is cooked uniformly, until the halwa leaves the parts of the pan and comes to be a complete mass.\n" +
                                "11. Take out from heat.\n" +
                                "12. Scrumptious Somali halwa is available.\n" +
                                "13. Await the halwa to cool down a bit and serve warm.\n" +
                                "14. You can additionally put the halwa right into a greased tray and let it to cool down and after that you can chop them right into parts and serve.");
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("Gashato",20, Arrays.asList(new String[]{"200 mL Milk (2% or 3.25%)","2 cups (400 g) Granulated sugar","⅔ cup (60 g) Fine shredded dried coconut","2 Tbsp (30 mL) Sprinkles or shredded coconut for topping"}),
                        "1. In a 3L pot set on medium heat, add the milk\n" +
                                "2. Add the sugar\n" +
                                "3. Stir\n" +
                                "4. After 8 minutes, add the shredder coconut\n" +
                                "5. Stir continuously\n" +
                                "6. Add the mint extract\n" +
                                "7. The total cooking time is 15min. Pour on to an oiled surface\n" +
                                "8. Add the sprinkles immediately\n" +
                                "9. After 2 minutes, cut to the desired shape.\n" );
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });
        recipes.get(15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recipe recipe = new Recipe("KacKac",20, Arrays.asList(new String[]{"2 cups flour all-purpose","1 teaspoons baking powder","1/2 cup sugar","1/2 cup melted ghee or butter","2 tablespoons warm milk","1 teaspoon cardamom powder","2 eggs","Oil for frying","confectioners sugar for dusting"}),
                        "Mix together the semolina, yogurt, yeast, salt and fenugreek powder.\n" +
                                "Add warm water to make a thin batter. Mix well.\n" +
                                "Cover and put in warm spot overnight to rise\n" +
                                "Add in the plain flour and self-rising flour along with the sugar.\n" +
                                "Mix well and add enough water a cup or more to get a thick batter, add just a little at a time to get the right consistency. Knead for about 5 minutes.\n" +
                                "Cover and set aside another 2 hours.\n" +
                                "Knead again and separate batter into 4 pieces\n" +
                                "Oil the skillets and press the dough into the skillets\n" +
                                "Cook on medium high until golden on the bottom and flip over.\n" +
                                "Cook until golden and enjoy hot." );
                Intent intent = new Intent(HomeActivity.this, Anjeera.class);
                intent.putExtra("Recipe",  recipe);
                startActivity(intent);
            }
        });


    }
}