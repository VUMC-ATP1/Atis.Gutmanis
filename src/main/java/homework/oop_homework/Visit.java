package homework.oop_homework;

import java.util.Date;

public class Visit {
    private Customer name;
    private Date date;
    private double serviceExpense;   // pakalpojuma izmaksas
    private double productExpense;   // produkta izmaksas
    public Visit(Customer name) {
        this.name = name;
        this.date = date;
    }
    public String getCustomerName() {
        return name.getName();
    }
    public double getServiceExpense() {
        return serviceExpense;
    }
    public double getProductExpense() {
        return productExpense;
    }
    public double getTotalExpense() {
        return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType()))) + (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));
    }
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }
    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }
}