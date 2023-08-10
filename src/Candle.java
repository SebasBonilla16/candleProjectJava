public class Candle {
    private String name;
    private int quantity;
    private int burnTime;
    private double price;

    public Candle(String name, int quantity, int burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
    }

    public double calculateDollarPerBurnTime() {
        return price / burnTime;
    }

    public double calculateSubtotal() {
        return quantity * price;
    }
    // how receipt will be shown printed
    public void displayDetails() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name);
        System.out.println("Amount: " + quantity);
        System.out.println("Burn Time: " + burnTime + " hours");
        System.out.println("Dollar per Burn Time: " + calculateDollarPerBurnTime());
        System.out.println("Price: $" + price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
