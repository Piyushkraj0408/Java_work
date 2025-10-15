package lab7;
class Order extends Thread {
    private String customerName;
    private String foodItem;
    Order(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }
    public void run() {
        System.out.println("Processing order for " + customerName + " - " + foodItem);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order ready for " + customerName + " (" + foodItem + ")");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        System.out.println("Food Delivery System Started!");
        Order o1 = new Order("Piyush", "Burger");
        Order o2 = new Order("Rahul", "Pizza");
        Order o3 = new Order("Aman", "Pasta");
        o1.start();
        o2.start();
        o3.start();

        System.out.println("system is free to take new orders...");
    }
}

