//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaculationStrategy {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first value: ");
        float value1 = Float.parseFloat(br.readLine());

        System.out.print("Enter the second value: ");
        float value2 = Float.parseFloat(br.readLine());

        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(value1, value2));

        context.setStrategy(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));

        context.setStrategy(new Multiplication());
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float num1, float num2) {
        return strategy.calculation(num1, num2);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

interface Strategy {
    public float calculation(float a, float b);
}

class Addition implements Strategy {
    @Override
    public float calculation(float a, float b) {
        return a + b;
    }
}

class Subtraction implements Strategy {
    @Override
    public float calculation(float a, float b) {
        return a - b;
    }
}

class Multiplication implements Strategy {
    @Override
    public float calculation(float a, float b) {
        return a * b;
    }
}
