/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Deepika Reddy
 */
public class AccountInfo {
    private String bankname;
    private String routingnumber;
    private String accountnumber;
    private String accountbalance;
    private String accounttype;

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getRoutingnumber() {
        return routingnumber;
    }

    public void setRoutingnumber(String routingnumber) {
        this.routingnumber = routingnumber;
    }

    public String getAccontnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accontnumber) {
        this.accountnumber = accontnumber;
    }

    public String getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(String accountbalance) {
        this.accountbalance = accountbalance;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }
    
}

    
