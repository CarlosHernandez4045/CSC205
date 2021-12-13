package DataStructuresStartup.DataStructures.src;

import DataStructuresStartup.DataStructures.src.Model.Employee;
import DataStructuresStartup.DataStructures.src.StackModel.StackStateModel;
import java.util.*;

public class TestStackApp {
    static StackStateModel state = new StackStateModel();
    public static void main(String[] args) throws Exception {
        System.out.println("*******************************************");
        System.out.println("[Stack Data Structure Performance Test]");
        testAdd() ;
        testAddAt();
        testContains();
        testIndexOf();
        testRemove();
    }

    public static void testAdd() {
        long startTime = System.currentTimeMillis();
      
        state.setUp();
        state.employeeStack.push(new Employee(state.iterations + 1, "John"));
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Adding: "+ elapsedTime + " Milli Seconds");
    }
   
    public static void testAddAt() {

        long startTime = System.currentTimeMillis();
        // you need to pop the stack till you find the itm with the index
        var itemsPopped = new ArrayList<Employee>();
        var pushAtIndex = 100L;
        var newEmployee = new Employee(state.iterations, "John");
        var found= false;
        while(!found){
            if(state.employeeStack.empty()){
                break;
            }
            var poppedItem = state.employeeStack.pop();
            if(pushAtIndex == poppedItem.getId()){
                found = true;
                state.employeeStack.push(newEmployee);
            }
            else{
                itemsPopped.add(poppedItem);
            }
        }

        // add the itemsBack
        for (Employee item : itemsPopped) {
            state.employeeStack.push(item);
        }

        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time fro Adding At: "+ elapsedTime+ " Milli Seconds");
  
    }


    public static boolean testContains() {
        long startTime = System.currentTimeMillis();
        var itemsPopped = new ArrayList<Employee>();
        var searchEmployee = new Employee(state.iterations, "John");
 
        var result= false;
        while(!result){
            if(state.employeeStack.empty()){
                break;
            }
            var poppedItem = state.employeeStack.pop();
            

            if(poppedItem.getId()== searchEmployee.getId()){
                result = true;
            }
            else{
                itemsPopped.add(poppedItem);
            }
        }

         // add the itemsBack
         for (Employee item : itemsPopped) {
            state.employeeStack.push(item);
        }
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Searching by name: "+ elapsedTime+ " Milli Seconds");
        return result;
       
    }


    public static int testIndexOf() {
        long startTime = System.currentTimeMillis();
        var itemsPopped = new ArrayList<Employee>();
        var result= false;
        while(!result){
            if(state.employeeStack.empty()){
                break;
            }
            var poppedItem = state.employeeStack.pop();

            if(poppedItem.getId()== 100L){
                result = true;
            }
            else{
                    itemsPopped.add(poppedItem);
            }
        }
    
             // add the itemsBack
        for (Employee item : itemsPopped) {
            state.employeeStack.push(item);
        }
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Searching by Index: "+ elapsedTime+ " Milli Seconds");
        return result ? 1: 0;
       
    }


    public Employee testGet() {

        long startTime = System.currentTimeMillis();
        // you need to pop the stack till you find the itm with the index
    
        var pushAtIndex = 100L;
        var searchEmp = new Employee(state.iterations, "John");
        var itemsPopped = new ArrayList<Employee>();
        var found= false;
        Employee result =null ;
        while(!found){
            if(state.employeeStack.empty()){
                break;
            }
            var poppedItem = state.employeeStack.pop();
            if(pushAtIndex == poppedItem.getId()){
                found = true;
                result = searchEmp;
            } else{
                itemsPopped.add(poppedItem);
            }
        }

         // add the itemsBack
         for (Employee item : itemsPopped) {
            state.employeeStack.push(item);
        }
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time gor Accessing: "+ elapsedTime+ " Milli Seconds");
        return result;

    }


    public static boolean testRemove() {
       
        long startTime = System.currentTimeMillis();
        var searchEmp = new Employee(state.iterations, "John");
        var result =  state.employeeStack.remove(searchEmp);
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time fro Removing: "+ elapsedTime+ " Milli Seconds");
        return result;
    }
    
}
