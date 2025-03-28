//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;
import java.util.List;

// Main class
public class BubbleTeaShop {
    public static void main(String[] args) {
        List<BubbleTea> bubbleTeaList = new ArrayList<>();

        // Order 1
        BubbleTea order1 = new MilkTea();
        order1 = new TapiocaBobaPearls(order1);
        order1 = new RedBean(order1);
        order1 = new RedBean(order1);
        order1 = new AloeVera(order1);
        bubbleTeaList.add(order1);

        // Order 2
        BubbleTea order2 = new ThaiMilkTea();
        order2 = new AloeVera(order2);
        order2 = new PoppingBoba(order2);
        bubbleTeaList.add(order2);

        // Order 3
        BubbleTea order3 = new FreshMilk();
        order3 = new JellyToppings(order3);
        order3 = new PoppingBoba(order3);
        order3 = new CrystalBoba(order3);
        bubbleTeaList.add(order3);

        // Print orders
        int orderNum = 1;
        for (BubbleTea order : bubbleTeaList) {
            System.out.println("\nYour order is");
            System.out.println(order.getDescription());
            System.out.println("-----------------------------------------------------");
            printOrderDetails(order);
            System.out.println("-----------------------------------------------------");
            System.out.println(getTotalFormula(order));
        }
    }

    private static void printOrderDetails(BubbleTea bubbleTea) {
        if (bubbleTea instanceof CondimentTea) {
            printOrderDetails(((CondimentTea) bubbleTea).bubbleTea);
            System.out.printf("%-13s %-13s $%.2f\n", "Topping", ((CondimentTea) bubbleTea).getToppingName(), ((CondimentTea) bubbleTea).getToppingCost());
        } else {
            System.out.printf("%-13s %-13s $%.2f\n", "Main", bubbleTea.getDescription(), bubbleTea.cost());
        }
    }

    private static String getTotalFormula (BubbleTea bubbleTea) {
        StringBuilder formula = new StringBuilder("Total = ");
        double totalCost = 0;
        List<Double> prices = new ArrayList<>();

        while (bubbleTea instanceof CondimentTea) {
            prices.add(((CondimentTea) bubbleTea).getToppingCost());
            bubbleTea = ((CondimentTea) bubbleTea).bubbleTea;
        }

        prices.add(bubbleTea.cost());
        totalCost = prices.stream().mapToDouble(Double::doubleValue).sum();

        for (int i = prices.size() - 1; i >= 0; i--) {
            formula.append(prices.get(i)).append(" + ");
        }

        return formula.substring(0, formula.length() - 3) + " = $" + String.format("%.2f", totalCost);
    }
}

// Abstract class Bubble Tea
abstract class BubbleTea {
    String description = "Unknown Bubble Tea";

    public String getDescription() {
        return description;
    }

    public abstract  double cost();
}

// Concrete class MilkTea
class MilkTea extends BubbleTea {
    public MilkTea() {
        description = "Milk Tea";
    }

    public double cost() {
        return 3.0;
    }
}

// Concrete class Thai Milk Tea
class ThaiMilkTea extends BubbleTea {
    public ThaiMilkTea() {
        description = "Thai Milk Tea";
    }

    public double cost() {
        return 2.5;
    }
}

// Concrete class Fresh Milk
class FreshMilk extends BubbleTea {
    public FreshMilk() {
        description = "Fresh Milk";
    }

    public double cost() {
        return 2.0;
    }
}

// Abstract decorator class
abstract class CondimentTea extends BubbleTea {
    protected BubbleTea bubbleTea;
    protected String toppingName;
    protected double toppingCost;

    public CondimentTea (BubbleTea bubbleTea, String toppingName, double toppingCost) {
        this.bubbleTea = bubbleTea;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", " + toppingName;
    }

    public double cost() {
        return bubbleTea.cost() + toppingCost;
    }

    public String getToppingName() {
        return toppingName;
    }

    public double getToppingCost() {
        return toppingCost;
    }
}

// Concrete decorator: Tapioca Boba Pearls
class TapiocaBobaPearls extends CondimentTea {
    public TapiocaBobaPearls(BubbleTea bubbleTea) {
        super(bubbleTea, "Tapioca Pearls", 0.15);
    }
}

// Concrete decorator: Jelly Toppings
class JellyToppings extends CondimentTea {
    public JellyToppings(BubbleTea bubbleTea) {
        super(bubbleTea, "Jelly Toppings", 0.20);
    }
}

// Concrete decorator: Popping Boba
class PoppingBoba extends CondimentTea {
    public PoppingBoba(BubbleTea bubbleTea) {
        super(bubbleTea, "Popping Boba", 0.25);
    }
}

// Concrete decorator: Aloe Vera
class AloeVera extends CondimentTea {
    public AloeVera(BubbleTea bubbleTea) {
        super(bubbleTea, "Aloe Vera", 0.30);
    }
}

// Concrete decorator: Red Bean
class RedBean extends CondimentTea {
    public RedBean(BubbleTea bubbleTea) {
        super(bubbleTea, "RedBean", 0.35);
    }
}

// Concrete decorator: Coconut Jelly
class CoconutJelly extends CondimentTea {
    public CoconutJelly(BubbleTea bubbleTea) {
        super(bubbleTea, "Coconut Jelly", 0.40);
    }
}

// Concrete decorator: Grass Jelly
class GrassJelly extends CondimentTea {
    public GrassJelly(BubbleTea bubbleTea) {
        super(bubbleTea, "Grass Jelly", 0.45);
    }
}

// Concrete decorator: Crystal Boba
class CrystalBoba extends CondimentTea {
    public CrystalBoba(BubbleTea bubbleTea) {
        super(bubbleTea, "Crystal Boba", 0.50);
    }
}