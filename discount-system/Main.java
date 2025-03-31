import java.util.Date;

public class Main {

    public static void println(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // create a new customer
        Visit visit1 = new Visit("John Doe", new Date());
        println("New customer created: " + visit1.getName());
        
        // set expenses
        visit1.setServiceExpense(100.0);
        visit1.setProductExpense(50.0);
        
        // calculate total expense before membership
        println("\nBefore membership:");
        println("Service expense: $" + visit1.getServiceExpense());
        println("Product expense: $" + visit1.getProductExpense());
        println("Total expense: $" + visit1.getTotalExpense());
        
        // make the customer premium member
        visit1.customer.setMember(true);
        visit1.customer.setMemberType("Premium");
        println("\nAfter Premium membership:");
        println("Total expense: $" + visit1.getTotalExpense());
        
        // gold membership
        Visit visit2 = new Visit("Jane Smith", new Date());
        visit2.setServiceExpense(100.0);
        visit2.setProductExpense(50.0);
        visit2.customer.setMember(true);
        visit2.customer.setMemberType("Gold");
        println("\nGold member expenses:");
        println(visit2.toString());
        println("Total expense: $" + visit2.getTotalExpense());
        
        // silver membership
        Visit visit3 = new Visit("Bob Wilson", new Date());
        visit3.setServiceExpense(100.0);
        visit3.setProductExpense(50.0);
        visit3.customer.setMember(true);
        visit3.customer.setMemberType("Silver");
        println("\nSilver member expenses:");
        println(visit3.toString());
        println("Total expense: $" + visit3.getTotalExpense());
    }
}
