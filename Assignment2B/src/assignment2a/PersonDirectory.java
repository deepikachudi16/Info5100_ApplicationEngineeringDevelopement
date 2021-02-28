/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2a;

import java.util.ArrayList;

/**
 *
 * @author Deepika Reddy
 */
public class PersonDirectory {
    private ArrayList<Person> PersonDir;

    public PersonDirectory() {
        this.PersonDir = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return PersonDir;
    }

    public void setPerson(ArrayList<Person> Person) {
        this.PersonDir = Person;
    }
    
    public Person getPersonById(int perid){
        Person p= null;
        for(Person per: this.PersonDir){
            if(per.getPersonid()== perid){
                p=per;
            }
           
        }return p;
    }
    
    public void addPerson(Person pichi){
        this.PersonDir.add(pichi);
    }
}

