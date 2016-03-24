package ua.junior.remindme.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.junior.remindme.server.entity.Direction;
import ua.junior.remindme.server.entity.Ingredient;
import ua.junior.remindme.server.entity.Recipe;
import ua.junior.remindme.server.repository.RemindRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Вевдюк on 28.01.2016.
 */

@RestController
@RequestMapping("/tastymix")
public class ReminderController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/getrecipes", method = RequestMethod.GET)
    @ResponseBody
    public List<Recipe> getReminder(){
        List<Recipe> list = remindRepository.findAll();
        return createMockRecipe();
    }

    @RequestMapping(value = "/getingredients", method = RequestMethod.GET)
    @ResponseBody
    public List<Ingredient> getIngredients(){
        List<Recipe> list = remindRepository.findAll();
        return createMockIngredients();
    }

    @RequestMapping(value = "/getdirections", method = RequestMethod.GET)
    @ResponseBody
    public List<Direction> getDirections(){
        List<Recipe> list = remindRepository.findAll();
        return createMockDirection();
    }

    private List<Ingredient> createMockIngredients(){
        List<Ingredient> list= new ArrayList<Ingredient>();
        Ingredient ingredient = new Ingredient();
        ingredient.setId(1);
        ingredient.setName("Eggs");
        ingredient.setUnit("shtuku");
        list.add(ingredient);
        Ingredient ingredient4 = new Ingredient();
        ingredient4.setId(5);
        ingredient4.setName("Meat");
        ingredient4.setUnit("gramm");
        list.add(ingredient4);
        Ingredient ingredient3 = new Ingredient();
        ingredient3.setId(4);
        ingredient3.setName("Cheese");
        ingredient3.setUnit("gramm");
        list.add(ingredient3);
        Ingredient ingredient2 = new Ingredient();
        ingredient2.setId(3);
        ingredient2.setName("Salt");
        ingredient2.setUnit("shipotka");
        list.add(ingredient2);
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setId(2);
        ingredient1.setName("Milk");
        ingredient1.setUnit("litr");
        list.add(ingredient1);
        return list;
    }

    private List<Recipe> createMockRecipe() {
        List<Recipe> list = new ArrayList<Recipe>();
        Recipe recipe = new Recipe();
        recipe.setId(1);
        recipe.setCreateDate(new Date());
        recipe.setName("Naches");
        recipe.setLikes(14);
        recipe.setRating(1.3f);
        list.add(recipe);
        Recipe recipe2 = new Recipe();
        recipe2.setId(2);
        recipe2.setCreateDate(new Date());
        recipe2.setName("Salad");
        recipe2.setLikes(33);
        recipe2.setRating(3.7f);
        list.add(recipe2);
        Recipe recipe3 = new Recipe();
        recipe3.setId(3);
        recipe3.setCreateDate(new Date());
        recipe3.setName("Pizza");
        recipe3.setLikes(4);
        recipe3.setRating(4.4f);
        list.add(recipe3);
        return list;
    }

    private List<Direction> createMockDirection() {
        List<Direction> list = new ArrayList<Direction>();
        Direction direction = new Direction();
        direction.setId(1);
        direction.setText("1) Place eggs in a saucepan or pot and cover with cold water.\n" +
                "Eggs first, then water. Why? Because if you put the eggs in second, they might crack as they fall to the bottom of the pan. It’s no fun to learn this the hard way.\n" +
                "\n" +
                "Also, very fresh eggs are delicious fried or scrambled, but older eggs are actually easier to peel. Your best bet for hard-boiled eggs is to choose eggs you’ve had in the refrigerator for a week or two.");
        list.add(direction);
        Direction direction1 = new Direction();
        direction1.setId(2);
        direction1.setText("2) Put pan over high heat and bring water to a rolling boil. Remove pan from heat and cover.\n" +
                "You want the water to come just to a boil, but not stay there. Eggs exposed to high heat for a long time go through a chemical reaction that turns the yolks green! So to answer the question “how long should I boil eggs?” The answer is pretty much not at all. And because the eggs don’t really cook in boiling water, some people prefer the term “hard-cooked eggs” to hard-boiled eggs.\n" +
                "\n" +
                "Compared to a simmer, here’s what a rolling boil looks like.");
        list.add(direction1);
        Direction direction2 = new Direction();
        direction2.setId(3);
        direction2.setText("3) Let the eggs stand in the hot water for 14-17 minutes.\n" +
                "How long you let the eggs stay in the water depends on how big the eggs are and how hard you want them cooked. To cook small eggs to medium, let them stand for 14 minutes. To cook extra-large eggs to medium, let them stand for 17 minutes. (We’re talking about chicken eggs here. You’re on your own with ostrich eggs.)");
        list.add(direction2);
        Direction direction3 = new Direction();
        direction3.setId(4);
        direction3.setText("4) Drain eggs and put in a bowl filled with ice water.\n" +
                "The ice water isn’t just a nice-to-have; it cools the eggs down and prevents the green yolk problem. If you’re planning to peel the eggs, like if you’re chopping them for egg salad, crack them slightly before putting them in the ice water, and let them sit for an hour for maximum ease of peeling.");
        list.add(direction3);
        return list;
    }
}
