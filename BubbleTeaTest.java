import java.util.ArrayList;

public class BubbleTeaTest {

    /**
     Main:
     •	Milk Tea (3$)
     •	Thai Milk Tea (2.5$)
     •	Fresh Milk (2$)
     The toppings include:
     •	Tapioca Boba Pearls (0.15$)
     •	Jelly Toppings (0.20$)
     •	Popping Boba (0.25$)
     •	Aloe Vera (0.30$)
     •	Red Bean (0.35$)
     •	Coconut Jelly (0.40$)
     •	Grass Jelly (0.45$)
     •	Crystal Boba (0.50$)
     */

    interface BubbleTea
    {
        public abstract String getDescription();
        public abstract double cost();
    }

    class MilkTea implements BubbleTea
    {
        private String name = "Milk Tea";
        private double cost = 3.0;

        @Override
        public String getDescription(){
            return this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return this.cost;
        }
    }

    class ThaiMilkTea implements BubbleTea
    {
        private String name = "Thai Milk Tea";
        private double cost = 2.5;

        @Override
        public String getDescription(){
            return this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return this.cost;
        }
    }

    class FreshMilk implements BubbleTea
    {
        private String name = "Fresh Milk";
        private double cost = 2.0;

        @Override
        public String getDescription(){
            return this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return this.cost;
        }
    }
// ----------------------------------------------

    abstract class BTDecorator implements BubbleTea
    {
    }

    class Tapioca extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Tapioca Boba Pearls";
        private double cost = 0.15;
        public Tapioca(BubbleTea bt)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }

    }

    class JellyToppings extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Jelly Toppings";
        private double cost = 0.20;
        public JellyToppings(BubbleTea bt)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }
    }

    class PoppingBoba extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Popping Boba";
        private double cost = 0.25;
        public PoppingBoba(BubbleTea bt)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }
    }

    class AloeVera extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Aloe Vera";
        private double cost = 0.30;
        public AloeVera(BubbleTea bt)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }
    }


    class RedBean extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Red Bean";
        private double cost = 0.35;
        public RedBean(BubbleTea bt)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }
    }

    class CoconutJelly extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Coconut Jelly";
        private double cost = 0.40;
        public CoconutJelly(BubbleTea c)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }
    }

    class GrassJelly extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Grass Jelly";
        private double cost = 0.45;
        public GrassJelly(BubbleTea bt)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }
    }

    class CrystalBoba extends BTDecorator
    {
        private BubbleTea bt;
        private String name = "Crystal Boba";
        private double cost = 0.50;
        public CrystalBoba(BubbleTea c)
        {
            this.bt=bt;
        }

        @Override
        public String getDescription(){
            return bt.getDescription() + "+" + this.name + "+" + this.cost;
        }

        @Override
        public double cost() {
            return bt.cost() + this.cost;
        }
    }
    //----------------------------------------------
    public void printOrder(BubbleTea c)
    {

        ArrayList<String> order = new ArrayList<String>();
        String[] result = c.getDescription().split("\\+");
        for(String s : result) {
            order.add(s);
        }
        System.out.println("Your order is ");
        int i = 0;
        for (String s : order){
            if(i%2==0)
            {
                System.out.print(s);
                if(i == 0)
                    System.out.print(" with ");
                else if (i != order.size()-2)
                    System.out.print(", ");
            }
            i++;
        }
        System.out.print(".");
        System.out.print("\n----------------------------------------------");

        i=0;
        while(i < order.size())
        {
            System.out.printf("\n%-10s %-25s $%-10s", i==0? "Main":"Topping", order.get(i), order.get(i+1));
            i=i+2;
        }

        System.out.print("\n----------------------------------------------");
        System.out.println("\nTotal: $" + c.cost());

    }

    //----------------------------------------------
    public static void main(String[] args) {
        BubbleTeaTest t = new BubbleTeaTest();
        t.run();
    }

    void run()
    {
        BubbleTea c = new MilkTea();
        c = new Tapioca(c);
        c = new RedBean(c);
        c = new RedBean(c);
        c = new AloeVera(c);
        printOrder(c);
    }

}




