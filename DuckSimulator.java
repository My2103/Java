//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
import java.util.List;

public class DuckSimulator {
    public static void main (String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        List<Duck> ducks = new LinkedList<Duck>();

        ducks.add(duck);
        ducks.add(turkeyAdapter);

        for(Duck d : ducks) {
            d.quack();
            d.fly();
        }
    }
}

interface Duck {
    public void fly();
    public void quack();
}

class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}

interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

// Turkey adapter
class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter (Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}