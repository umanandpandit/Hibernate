package com.niit.hiberannotations;

import javax.persistence.*;
import javax.persistence.OneToOne;


@Entity
@Table(name = "customer")
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@PrimaryKeyJoinColumn                 //mapping of fk
private int customerId;
private String name, email;

@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
private Address address;


public int getCustomerId() {
return customerId;
}

public void setCustomerId(int customerId) {
this.customerId = customerId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

}