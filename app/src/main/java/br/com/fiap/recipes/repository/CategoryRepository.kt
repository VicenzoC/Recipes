package br.com.fiap.recipes.repository

import androidx.compose.ui.graphics.Color
import br.com.fiap.recipes.R
import br.com.fiap.recipes.model.Category

fun getAllCategories() = listOf<Category>(
    Category(
        id = 1,
        name = "Chicken",
        image = R.drawable.chicken,
        background = Color.Yellow
    ),
    Category(
        id = 2,
        name = "Beef",
        image = R.drawable.beef,
        background = Color.Red
    ),
    Category(
        id = 3,
        name = "Fish",
        image = R.drawable.fish,
        background = Color.Blue
    ),
    Category(
        id = 4,
        name = "Vegetable",
        image = R.drawable.vegetable,
        background = Color.Green
    ),
    Category(
        id = 5,
        name = "Drink",
        image = R.drawable.drink,
        background = Color.Cyan
    ),
    Category(
        id = 6,
        name = "Dessert",
        image = R.drawable.dessert,
        background = Color.Magenta
    ),
    Category(
        id = 7,
        name = "Bakery",
        image = R.drawable.bakery,
        background = Color(0xFFF8D9D9)),
)

fun getCategoryById(id: Int) = getAllCategories()
    .find {
        it.id == id
    }