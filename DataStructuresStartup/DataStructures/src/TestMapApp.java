package DataStructuresStartup.DataStructures.src;


import DataStructuresStartup.DataStructures.src.MapListModel.MapStateModel;
import DataStructuresStartup.DataStructures.src.Model.Employee;

public class TestMapApp {
    static MapStateModel state = new MapStateModel();
    public static void main(String[] args) throws Exception {
        System.out.println("*******************************************");
        System.out.println("[Map Data Structure Performance Test]");
        testAdd() ;
        testAddAt();
        testContains();
        testIndexOf();
        testRemove();
    }

    public static void testAdd() {
        long startTime = System.currentTimeMillis();
      
        state.setUp();
        state.employeeMap.put(state.iterations+1 ,new Employee(state.iterations + 1, "John"));
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Adding: "+ elapsedTime + " Milli Seconds");
    }
   
    public static void testAddAt() {

        long startTime = System.currentTimeMillis();
      
        state.employeeMap.put((long) (state.iterations), new Employee(state.iterations, "John"));
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time fro Adding At: "+ elapsedTime+ " Milli Seconds");
  
    }


    public static boolean testContains() {
        long startTime = System.currentTimeMillis();
      
        boolean result = state.employeeMap.containsValue(state.employee);
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Searching by name: "+ elapsedTime+ " Milli Seconds");
        return result;
       
    }


    public static int testIndexOf() {
        long startTime = System.currentTimeMillis();
      
        boolean result = state.employeeMap.containsKey(state.employee.getId());
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time for Searching by Index: "+ elapsedTime+ " Milli Seconds");
        return result ? 1: 0;
       
    }


    public Employee testGet() {

        long startTime = System.currentTimeMillis();
      
        Employee result = state.employeeMap.get(state.employeeIndex);
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time gor Accessing: "+ elapsedTime+ " Milli Seconds");
        return result;

    }


    public static boolean testRemove() {
       
        long startTime = System.currentTimeMillis();
      
        var result =  state.employeeMap.remove(state.employee.getId());
        long endTime  = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time fro Removing: "+ elapsedTime+ " Milli Seconds");
        return result!=null? true: false;
    }
    
}
