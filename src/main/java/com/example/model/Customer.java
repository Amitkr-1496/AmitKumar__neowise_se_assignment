/*
 * package com.example.model;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.JoinColumn;
 * import javax.persistence.OneToMany; import javax.persistence.Table;
 * 
 * import org.springframework.data.annotation.Id;
 * 
 * @Entity
 * 
 * @Table(name="Customer") public class Customer {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private long id;
 * 
 * private String name;
 * 
 * private String email;
 * 
 * private int status;
 * 
 * 
 * @OneToMany
 * 
 * @JoinColumn(name="Cust_Id",referencedColumnName="id") List<Transactions>
 * transaction=new ArrayList<Transactions>();
 * 
 * 
 * 
 * public Customer(){}
 * 
 * 
 * public Customer(long id, String name, String email, int status) { super();
 * this.id = id; this.name = name; this.email = email; this.status = status; }
 * 
 * public long getId() { return id; }
 * 
 * public void setId(long id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * public int getStatus() { return status; }
 * 
 * public void setStatus(int status) { this.status = status; }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */