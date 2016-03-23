package ua.junior.remindme.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
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
        return createMockRemind();
    }

    @RequestMapping(value = "/getingredients", method = RequestMethod.GET)
    @ResponseBody
    public List<Ingredient> getIngredients(){
        List<Recipe> list = remindRepository.findAll();
        return createMockIngredients();
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

    private List<Recipe> createMockRemind() {
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
}
