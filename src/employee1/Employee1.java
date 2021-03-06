/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Employee1 {
    
    private String[] names;
    private BufferedReader br;
    
    private String name;
    private int age;
    List addressList;
    
    //v1
    public Employee1(){
	name = new String("");
	age = 0;
	addressList = Collections.emptyList();
    }

    // v2
    public Employee1(String nam, int years, List addresses){
	name = new String(nam);
	age = years;
	addressList = setAddresses(addresses);
    }
    
    // v2
    private List setAddresses(List addrs){
	List addresses = Collections.emptyList();
	for(int i = 0; i < addrs.size(); i++){
	    addresses.add(addrs.get(i));
	}
	return addresses;
    }
    
    // v2
    private String init(String[] args){
	br = new BufferedReader(new InputStreamReader(System.in));
	String temp = "";
	if (args.length > 0){
	    names = new String[args.length];
	    for (int k = 0; k < args.length; k++){
		names[k] = args[k];
	    }
	    System.out.println();
	}
	System.out.println("in init()");	
	return temp;
    }
    
    // v1
    private void run(){
	System.out.println(getName());
    }
    
    private void usage(){
	System.out.println("USAGE IS: " + 
		"WSA500; employee1. Any args ignored.");
    }
    
    private int wrap(){
	int retval = 0;
	return retval;
    }
    
    public String getName(){
      return name;
    }
    
    // v1
    public void setName(String n){
	name = new String(n);
    }

    /**
     * @param args the command line arguments
     */
    // v3
    public static void main(String[] args) 
    throws IOException {
	Employee1 theApp = new Employee1();
	
	theApp.init(args);
	theApp.run();
	theApp.usage();
	theApp.wrap();
	
    }
    
}
