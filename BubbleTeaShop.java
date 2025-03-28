//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Main class
import java.util.ArrayList;
import java.util.List;

public class BubbleTeaShop {
    public static void main(String[] args) {
        List<BubbleTea> orders = new ArrayList<>();

        // Order 1: Milk Tea with Tapioca Boba and 2x Red Bean
        BubbleTea order1 = new MilkTea();
        order1 = new TapiocaBobaPearls(order1);
        order1 = new RedBean(order1);
        order1 = new RedBean(order1);
        orders.add(order1);

        // Order 2: Thai Milk Tea with Aloe Vera and Popping Boba
        BubbleTea order2 = new ThaiMilkTea();
        order2 = new AloeVera(order2);
        order2 = new PoppingBoba(order2);
        orders.add(order2);

        // Order 3: Fresh Milk with Grass Jelly, Coconut Jelly, and Crystal Boba
        BubbleTea order3 = new FreshMilk();
        order3 = new JellyToppings(order3);
        order3 = new PoppingBoba(order3);
        order3 = new CrystalBoba(order3);
        orders.add(order3);

        // Print orders
        int orderNum = 1;
        for (BubbleTea order : orders) {
            System.out.println("Order " + orderNum + ":");
            System.out.println("Your order is " + order.getDescription());
            System.out.println("Total price: $" + String.format("%.2f", order.cost()));
            System.out.println("---------------------------------------------");
            orderNum++;
        }
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
    public abstract String getDescription();
}

// Concrete decorator: Tapioca Boba Pearls
class TapiocaBobaPearls extends CondimentTea {
    BubbleTea bubbleTea;

    public TapiocaBobaPearls(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", Tapioca Boba Pearls";
    }

    public double cost() {
        return bubbleTea.cost() + 0.15;
    }
}

// Concrete decorator: Jelly Toppings
class JellyToppings extends CondimentTea {
    BubbleTea bubbleTea;

    public JellyToppings(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", Jelly Toppings";
    }

    public double cost() {
        return bubbleTea.cost() + 0.20;
    }
}

// Concrete decorator: Popping Boba
class PoppingBoba extends CondimentTea {
    BubbleTea bubbleTea;

    public PoppingBoba(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", Popping Boba";
    }

    public double cost() {
        return bubbleTea.cost() + 0.25;
    }
}

// Concrete decorator: Aloe Vera
class AloeVera extends CondimentTea {
    BubbleTea bubbleTea;

    public AloeVera(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", Aloe Vera";
    }

    public double cost() {
        return bubbleTea.cost() + 0.30;
    }
}

// Concrete decorator: Red Bean
class RedBean extends CondimentTea {
    BubbleTea bubbleTea;

    public RedBean(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", RedBean";
    }

    public double cost() {
        return bubbleTea.cost() + 0.30;
    }
}

// Concrete decorator: Coconut Jelly
class CoconutJelly extends CondimentTea {
    BubbleTea bubbleTea;

    public CoconutJelly(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", Coconut Jelly";
    }

    public double cost() {
        return bubbleTea.cost() + 0.40;
    }
}

// Concrete decorator: Grass Jelly
class GrassJelly extends CondimentTea {
    BubbleTea bubbleTea;

    public GrassJelly(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", Grass Jelly";
    }

    public double cost() {
        return bubbleTea.cost() + 0.45;
    }
}

// Concrete decorator: Crystal Boba
class CrystalBoba extends CondimentTea {
    BubbleTea bubbleTea;

    public CrystalBoba(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    public String getDescription() {
        return bubbleTea.getDescription() + ", Crystal Boba";
    }

    public double cost() {
        return bubbleTea.cost() + 0.50;
    }
}