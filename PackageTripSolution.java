//
// CEN2010: Software Engineering 1
// Lab 2

class Lab2Test{
    public abstract class Trip
    {
        // Notice: Final
        public final void performTrip()
        {
            doComingTransport();
            doDayA();
            doDayB();
            doDayC();
            doReturingTransport();
        }
        // Notice: Final
        public final void doComingTransport() {
            System.out.println("Parent: doComingTransport");
        }
        public abstract void doDayA(); // Must be implemented in a child class
        public abstract void doDayB(); // Must be implemented in a child class
        public void doDayC() {}        //optional

        // Notice: Final
        public final void doReturingTransport() {
            System.out.println("Parent: doReturingTransport");
        }
    }
    public class PackageA extends Trip
    {
        public void doDayA()
        {
            System.out.println("PackageA: doDayA");
        }
        public void doDayB()
        {
            System.out.println("PackageA: doDayB");
        }

    }

    public class PackageB extends Trip
    {

        public void doDayA()
        {
            System.out.println("PackageB: doDayA");
        }
        public void doDayB()
        {
            System.out.println("PackageB: doDayB");
        }
        public void doDayC(){
            System.out.println("PackageB: doDayC (optional)");
        }
    }

    public static void main(String[] args) {
        Lab2Test tmp = new Lab2Test();
        tmp.run();
    }

    void run()
    {

        System.out.println("\n-- PackageA --");
        Trip trip1 = new PackageA();
        trip1.performTrip();

        System.out.println("\n\n-- PackageB --");
        Trip trip2 = new PackageB();
        trip2.performTrip();
    }

}