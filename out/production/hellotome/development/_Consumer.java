package development;

import java.util.function.BiConsumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer Sandy = new Customer("Sandy", "9504124589");
//        greetCustomer(Sandy);
//        consumer interface
//        greetCustomerConsumer.accept(Sandy);
        greetCustomerconsumer.accept(Sandy,false);
    }
    static BiConsumer<Customer,Boolean> greetCustomerconsumer = (customer, showPhoneNumber) ->
                System.out.println("Hello "+ customer.customerName + "thanks for registering phone no. "
                        + (showPhoneNumber ? customer.customerPhoneNumber : "*******"));


//    static Consumer<Customer> greetCustomerConsumer =
//            customer -> System.out.println("Hello "+ customer.customerName + "thanks for registering phone no. "+ customer.customerPhoneNumber);
//    static void greetCustomer(Customer customer){
//        System.out.println("Hello "+ customer.customerName + "thanks for registering phone no. "+ customer.customerPhoneNumber);

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName,String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}
