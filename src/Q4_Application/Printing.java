package Q4_Application;

public class Printing{
    double tax;
    double commission;
    double discount;
    double total;

    public void Purchase_Report(double p,int q) {
        double price = p*q;
        this.tax = price*0.15;
        this.commission = price*0.085;
        this.discount = price*0.1;
        double total_price = price+tax;
        double total_less = discount+commission;
        this.total = total_price-total_less;
    }

    void Print_Details(String f_name,String s_name,int c_nun,String prd,double price,int q){
        System.out.println("Name: "+f_name+" "+s_name);
        System.out.println("Customer Number: "+c_nun);
        System.out.println("Product: "+prd);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+q);
    }
    void Customer_Purchase_Report(){
        System.out.println("REPORT OPTION PERCENTAGE");
        System.out.println("TAX: "+tax);
        System.out.println("COMMISSION: "+commission);
        System.out.println("DISCOUNT: "+discount);
        System.out.println("TOTAL: "+total);
    }
}
