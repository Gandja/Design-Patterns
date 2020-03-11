package structural.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(new Printer("Привет"));
        printer.print();
    }
}
