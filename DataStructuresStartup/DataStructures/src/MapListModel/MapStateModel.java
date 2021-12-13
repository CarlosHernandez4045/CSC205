package DataStructuresStartup.DataStructures.src.MapListModel;

import java.util.*;
import DataStructuresStartup.DataStructures.src.Model.Employee;

public class MapStateModel {

    public Map<Long,Employee> employeeMap = new HashMap<>();

    public Long iterations = 100000L;

    public Employee employee = new Employee(100L, "Harry");

    public Long employeeIndex = -1L;


    public void setUp() {
        for (Long i = 0L; i < iterations; i++) {
            var employee = new Employee(100L, "Harry");
            employeeMap.put(i, employee);
        }
    }
}
