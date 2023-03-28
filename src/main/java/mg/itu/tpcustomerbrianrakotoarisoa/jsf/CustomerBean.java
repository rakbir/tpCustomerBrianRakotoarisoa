/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpcustomerbrianrakotoarisoa.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.itu.tpcustomerbrianrakotoarisoa.ejb.CustomerManager;
import mg.itu.tpcustomerbrianrakotoarisoa.entities.Customer;

/**
 *
 * @author Brian Rakotoarisoa
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    private List<Customer> customerList;  
    
    @EJB  
    private CustomerManager customerManager;
    
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
   /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
   */  
    public List<Customer> getCustomers() {
      if (customerList == null) {
        customerList = customerManager.getAllCustomers();
      }
      return customerList;
    }  
}
