package Q4_Application;

public class Q4_Test {
    public static void main(String[] args) {
        Customer_Purchases obj1 = new Customer_Purchases();
        obj1.setCustomer_number(1111111111);
        obj1.setFirst_name("Himanshu");
        obj1.setSurname("Sharma");
        obj1.setProduct("Product1");
        obj1.setPrice(8500);
        obj1.setQuantity(2);
        Printing obj2 = new Printing();
        obj2.Print_Details(obj1.getFirst_name(), obj1.getSurname(), obj1.getCustomer_number(), obj1.getProduct(), obj1.getPrice(), obj1.getQuantity());
        System.out.println("");
        obj2.Purchase_Report(obj1.getPrice(), obj1.getQuantity());
        obj2.Customer_Purchase_Report();
    }
}
