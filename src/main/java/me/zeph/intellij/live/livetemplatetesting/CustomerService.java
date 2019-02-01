package me.zeph.intellij.live.livetemplatetesting;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

  public List<String> getCustomerNames() {
    List<Customer> customers = getCustomers();
    return customers.stream()
        .map(Customer::getName)
        .collect(Collectors.toList());
  }

  public List<Customer> getCustomerOlderOrEqualsThan18(){
    List<Customer> customers = getCustomers();
    return customers.stream()
        .filter(customer -> customer.getAge() >= 18)
        .collect(Collectors.toList());
  }

  public void initAllCustomerCredit(){
    List<Customer> customers = getCustomers();
    customers.forEach(customer -> {
      customer.setCredit(100d);
    });
  }

  //Ignore the hard code down here
  private List<Customer> getCustomers() {
    List<Customer> customers = new ArrayList<>();
    Customer customer1 = new Customer("Benwei", 17);
    Customer customer2 = new Customer("Benwei Zhu", 18);
    customers.add(customer1);
    customers.add(customer2);
    return customers;
  }
}
