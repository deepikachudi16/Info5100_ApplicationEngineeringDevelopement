/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Address;
import model.Driver;
import model.Medical;
import model.Product;

public class Fullreport {
    private Product product;
    private Address address;
    private AccountInfo savings;
    private AccountInfo checkin;
    private Driver driver;
    private Medical medical;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccountInfo getSavings() {
        return savings;
    }

    public void setSavings(AccountInfo savings) {
        this.savings = savings;
    }

    public AccountInfo getCheckin() {
        return checkin;
    }

    public void setCheckin(AccountInfo checkin) {
        this.checkin = checkin;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }

    

    
    
    
}

