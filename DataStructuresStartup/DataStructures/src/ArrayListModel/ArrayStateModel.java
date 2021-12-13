package DataStructuresStartup.DataStructures.src.ArrayListModel;
import java.util.*;

import DataStructuresStartup.DataStructures.src.Model.Employee; 
public class ArrayStateModel {

    public List<Employee> employeeList = new ArrayList<>();

    public long iterations = 100000;

    public Employee employee = new Employee(100L, "Harry");

    public int employeeIndex = -1;


    public void setUp() {
        for (long i = 0; i < iterations; i++) {
            employeeList.add(new Employee(i, "John"));
        }

        employeeList.add(employee);
        employeeIndex = employeeList.indexOf(employee);
    }
}
