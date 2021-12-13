package DataStructuresStartup.DataStructures.src;

import DataStructuresStartup.DataStructures.src.ArrayListModel.ArrayStateModel;
import DataStructuresStartup.DataStructures.src.Model.Employee;



public class TestArraysApp {
    static ArrayStateModel state = new ArrayStateModel();
    public static void main(String[] args) throws Exception {
        System.out.println("*******************************************");
        System.out.println("[Array list Data Structure Performance Test]");
        testAdd() ;
        testAddAt();
        testContains();
        testIndexOf();
        testRemove();
    }

    public static void testAdd() {
        long startTime = System.currentTimeMillis();
      
        state.setUp();
        state.employeeList.add(new Employee(state.iterations + 1, "John"));
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Adding: "+ elapsedTime + " Milli Seconds");
    }
   
    public static void testAddAt() {

        long startTime = System.currentTimeMillis();
      
        state.employeeList.add((int) (state.iterations), new Employee(state.iterations, "John"));
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time fro Adding At: "+ elapsedTime+ " Milli Seconds");
  
    }


    public static boolean testContains() {
        long startTime = System.currentTimeMillis();
      
        boolean result = state.employeeList.contains(state.employee);
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Searching by name: "+ elapsedTime+ " Milli Seconds");
        return result;
       
    }


    public static int testIndexOf() {
        long startTime = System.currentTimeMillis();
      
        int result = state.employeeList.indexOf(state.employee);
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Searching by Index: "+ elapsedTime+ " Milli Seconds");
        return result;
       
    }


    public Employee testGet() {

        long startTime = System.currentTimeMillis();
      
        Employee result = state.employeeList.get(state.employeeIndex);
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time gor Accessing: "+ elapsedTime+ " Milli Seconds");
        return result;

    }


    public static boolean testRemove() {
       
        long startTime = System.currentTimeMillis();
      
        boolean result =  state.employeeList.remove(state.employee);
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time fro Removing: "+ elapsedTime+ " Milli Seconds");
        return result;
    }
    
}
