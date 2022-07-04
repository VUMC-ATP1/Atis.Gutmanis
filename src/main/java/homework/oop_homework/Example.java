package homework.oop_homework;

public class Example {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Hadermidzhad");
        customer1.setMember(true);
        customer1.setMemberType("Silver");

        Visit customerVisit1 = new Visit(customer1);
        customerVisit1.setProductExpense(10.00);
        customerVisit1.setServiceExpense(11.00);
        System.out.println("Customer " + customer1.getName() + " pays " + customerVisit1.getTotalExpense() + " euros.");

        Customer customer2 = new Customer("Hodornidzhud");
        customer2.setMember(true);
        customer2.setMemberType("Gold");

        Visit customerVisit2 = new Visit(customer2);
        customerVisit2.setProductExpense(20.00);
        customerVisit2.setServiceExpense(12.00);
        System.out.println("Customer " + customer2.getName() + " pays " + customerVisit2.getTotalExpense() + " euros.");

        Customer customer3 = new Customer("Billy");
        customer3.setMember(true);
        customer3.setMemberType("Premium");

        Visit customerVisit3 = new Visit(customer2);
        customerVisit3.setProductExpense(30.00);
        customerVisit3.setServiceExpense(13.00);
        System.out.println("Customer " + customer3.getName() + " pays " + customerVisit3.getTotalExpense() + " euros.");

        Customer customer4 = new Customer("Habarnidzhad");
        customer4.setMember(false);
        customer4.setMemberType("Silver");

        Visit customerVisit4 = new Visit(customer2);
        customerVisit4.setProductExpense(40.00);
        customerVisit4.setServiceExpense(14.00);
        System.out.println("Customer " + customer4.getName() + " pays " + customerVisit4.getTotalExpense() + " euros.");

        Customer customer5 = new Customer("Hadornidzhad");
        customer5.setMember(false);
        customer5.setMemberType("Gold");

        Visit customerVisit5 = new Visit(customer2);
        customerVisit5.setProductExpense(50.00);
        customerVisit5.setServiceExpense(15.00);
        System.out.println("Customer " + customer5.getName() + " pays " + customerVisit5.getTotalExpense() + " euros.");

        Customer customer6 = new Customer("Hwbarnedzhed");
        customer6.setMember(false);
        customer6.setMemberType("Gold");

        Visit customerVisit6 = new Visit(customer2);
        customerVisit6.setProductExpense(60.00);
        customerVisit6.setServiceExpense(16.00);
        System.out.println("Customer " + customer6.getName() + " pays " + customerVisit6.getTotalExpense() + " euros.");
    }
}