//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PackageTrip {
    public static void main(String[] args) {
        System.out.println("Package A: ");
        PackageA packageA = new PackageA();
        packageA.performTrip();

        System.out.println("\nPackage B: ");
        PackageB packageB = new PackageB();
        packageB.performTrip();
    }
}

abstract class Trip {
    public final void performTrip() {
        doComingTransport();
        doDayA();
        doDayB();
        doDayC();
        doReturningTransport();
    }

    abstract void doDayA();
    abstract void doDayB();
    void doDayC(){}

    void doComingTransport() {
        System.out.println("Arriving at destination.");
    }

    void doReturningTransport() {
        System.out.println("Returning home.");
    }
}

class PackageA extends Trip {
    public void doDayA() {
        System.out.println("Day A: Sightseeing in the city.");
    }

    public void doDayB() {
        System.out.println("Day B: Visiting the museum.");
    }

    public void doDayC() {
        System.out.println("Day C: Shopping and free time.");
    }
}

class PackageB extends Trip {
    public void doDayA() {
        System.out.println("Day A: Beach day and relaxation.");
    }

    public void doDayB() {
        System.out.println("Day B: Water sport activities.");
    }
}