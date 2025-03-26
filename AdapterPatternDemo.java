//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Client: Sử dụng giao diện Printer
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Tạo một LegacyPrinter
        LegacyPrinter legacyPrinter = new LegacyPrinter();

        // Dùng Adapter để biến LegacyPrinter thành một Printer
        Printer adapter = new PrinterAdapter(legacyPrinter);

        System.out.println("Client call method print():");
        adapter.print(); // Kết quả: LegacyPrinter: In tài liệu theo cách cũ.
    }
}

// Target: Lớp mà Client mong đợi
interface Printer {
    void print();
}

// Adaptee: Lớp cũ có phương thức không tương thích
class LegacyPrinter {
    void printDocument() {
        System.out.println("LegacyPrinter: Print document in the old way.");
    }
}

// Adapter: Chuyển đổi LegacyPrinter thành Printer
class PrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    // Constructor nhận vào một LegacyPrinter
    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        // Adapter chuyển lời gọi print() thành printDocument()
        legacyPrinter.printDocument();
    }
}