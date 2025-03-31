//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Grocery {
    public static void main(String[] args) {
        GroceryItem groceryItem = new GroceryItem("Apple", 10);

        Product groceryItemAdapter = new GroceryItemAdapter(groceryItem);

        System.out.println(groceryItemAdapter.getName());
        System.out.println(groceryItemAdapter.getPrice());
        }
    }

class GroceryItem {
    String itemName;
    int costPerUnit;

    public GroceryItem(String itemName, int costPerUnit) {
        this.itemName = itemName;
        this.costPerUnit = costPerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public int getCostPerUnit() {
        return costPerUnit;
    }
}

interface Product {
    String getName();
    double getPrice();
}

class GroceryItemAdapter implements Product {
    private final GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    public String getName() {
        return groceryItem.getItemName();
    }

    public double getPrice() {
        return groceryItem.getCostPerUnit();
    }
}

