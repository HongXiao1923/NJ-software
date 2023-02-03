package headFirst.designPattern.dFactory.iiiAbstractFactory;

import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.cheese.Cheese;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.clam.Clams;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.dough.Dough;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.pepperoni.Pepperoni;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.sauce.Sauce;
import headFirst.designPattern.dFactory.iiiAbstractFactory.ingredient.veggies.Veggies;

import java.util.Arrays;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/16 22:44
 * @see
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /**
     * 声明为抽象方法，用于收集Pizza所需的原料（来自原料工厂）
     */
    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 mins at 350.");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    void box(){
        System.out.println("Place the pizza in an official box.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 打印披萨相关内容
     * @return
     */
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
