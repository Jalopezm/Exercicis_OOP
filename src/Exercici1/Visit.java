package Exercici1;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public void setServiceExpense(double serviceExpense) throws VisitError{
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) throws VisitError {
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()))
                + productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }

    @Override
    public String toString() {
        return "Visit {" +
                customer +
                ", date= " + date +
                ", serviceExpense= " + serviceExpense +
                ", productExpense= " + productExpense +
                '}';
    }
}
