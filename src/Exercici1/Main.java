package Exercici1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Pere");
        //Probamos a utilizar un tipo de miembro valido y uno no valido
        //si de
        try {
            /**customer.setMemberType("Premiun")**/
            customer.setMemberType("Paella");
            System.out.println(customer.toString());
        } catch (CustomerError e) {
            System.err.println("No Member Type Coincidences");
        }
        Visit visit = new Visit(customer, new Date());
        //
        try {
            visit.setServiceExpense(25.34);
            visit.setProductExpense(-89);
            System.out.println(visit.toString());
            System.out.println("Descuento Servicio " + DiscountRate.getServiceDiscountRate(customer.getMemberType()));
            System.out.println("Descuento Productos " + DiscountRate.getProductDiscountRate(customer.getMemberType()));
            System.out.println("Total Gastado " + visit.getTotalExpense());
        } catch (VisitError e) {
            System.err.println("Valores Introducidos No Validos");
        }

    }
}