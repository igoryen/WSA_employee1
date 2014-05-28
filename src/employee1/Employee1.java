/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    
    private void run(){
	
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
    //..............
    //..............
    //..............

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
