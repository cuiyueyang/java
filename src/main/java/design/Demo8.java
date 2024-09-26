package design;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/21 16:50 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * 建造者模式：将一个简单的对象一步步构建成一个复杂的对象
 */
public class Demo8 {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNoVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}

interface Item {
    /**名称*/
    public String name();
    /**包装*/
    public Packing packing();
    /**价格*/
    public float price();
}

interface Packing {
    public String pack();
}

/**包装纸*/
class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

/**瓶子*/
class Bottle implements  Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

/**汉堡*/
abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}

/**冷饮*/
abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return  new Bottle();
    }
    @Override
    public abstract float price();
}

/**蔬菜汉堡*/
class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }
    @Override
    public String name() {
        return "Veg Burger";
    }
}

/**鸡肉汉堡*/
class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }
    @Override
    public String name() {
        return "Chicken Burger";
    }
}

/**可乐*/
class Coke extends  ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

/**百事可乐*/
class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }
    @Override
    public String name() {
        return "Pepsi";
    }
}

/**一餐饭*/
class Meal {
    private List<Item> items = Lists.newArrayList();

    public void addItem(Item item) {
        items.add(item);
    }
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println(",Packing: " + item.packing().pack());
            System.out.println(",Price: " + item.price());
        }
    }
}

class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return  meal;
    }

    public Meal prepareNoVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}











