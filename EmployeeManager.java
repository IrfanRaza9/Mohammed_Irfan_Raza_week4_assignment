package week4;

import java.util.HashMap;

public class EmployeeManager {
    private HashMap<Integer, String> employeeMap;

    public EmployeeManager() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(int id, String name) {
        employeeMap.put(id, name);
        System.out.println("Employee added: ID=" + id + ", Name=" + name);
    }

    public void getEmployee(int id) {
        String name = employeeMap.get(id);
        if (name != null) {
            System.out.println("Employee found: ID=" + id + ", Name=" + name);
        } else {
            System.out.println("Employee not found with ID=" + id);
        }
    }

    public void displayAllEmployees() {
        System.out.println("Employee List:");
        for (int id : employeeMap.keySet()) {
            System.out.println("ID=" + id + ", Name=" + employeeMap.get(id));
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(1, "Irfan");
        manager.addEmployee(2, "Mustafa");
        manager.getEmployee(1);
        manager.displayAllEmployees();
    }
}

