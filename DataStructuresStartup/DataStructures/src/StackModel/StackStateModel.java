package DataStructuresStartup.DataStructures.src.StackModel;
import java.util.*;

import DataStructuresStartup.DataStructures.src.Model.Employee;

public class StackStateModel {

    public Stack<Employee> employeeStack = new Stack<Employee>();

    public long iterations = 100000;

    public Employee employee = new Employee(100L, "Harry");

    public Long employeeIndex = -1L;


    public void setUp() {
        for (long i = 0; i < iterations; i++) {
            employeeStack.push(new Employee(i, "John"));
        }
    }
}
