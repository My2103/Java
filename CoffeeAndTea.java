//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CoffeeAndTea {
    public static void main(String[] args) {
        System.out.println("Coffee recipe:");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\nTea recipe:");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
abstract class CaffeinBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    abstract void addCondiment();
    abstract void brew();

    void pourInCup() {
        System.out.println("Pour in cup");
    }

    void boilWater() {
        System.out.println("Boil water");
    }
}

class Coffee extends CaffeinBeverage {
    public void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    public void addCondiment() {
        System.out.println("Adding sugar and milk");
    }
}

class Tea extends CaffeinBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiment() {
        System.out.println("Adding lemon");
    }
}