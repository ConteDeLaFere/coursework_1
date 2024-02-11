import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    //Распечатать список сотрудников с их данными
    public void printEmployeesInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    //Сумма затрат на ЗП в месяц
    public int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }

        }
        return sum;
    }

    //Нахождение сотрудника с минимальной ЗП
    public Employee getEmployeeWithMinSalary() {
        int minIndex = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minIndex = i;
                break;
            }
        }

        if (minIndex == -1) {
            return null;
        }

        for (int i = minIndex + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employees[minIndex].getSalary())  {
                minIndex = i;
            }
        }

        return employees[minIndex];
    }


    //Нахождение сотрудника с максимальной ЗП
    public Employee getEmployeeWithMaxSalary() {
        int maxIndex = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxIndex = i;
                break;
            }
        }

        if (maxIndex == -1) {
            return null;
        }

        for (int i = maxIndex + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employees[maxIndex].getSalary())  {
                maxIndex = i;
            }
        }

        return employees[maxIndex];

    }

    //Подсчет средней ЗП сотрудников
    public int calculateAverageSalary() {
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countEmployees++;
            }
        }
        if (countEmployees == 0) {
            return 0;
        } else {
            return calculateTotalSalary() / countEmployees;
        }

    }

    //Печать ФИО сотрудников
    public void printFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }

    //Индексация ЗП всех сотрудников
    public void increaseSalary(int percent) {
        if (percent <= 0) return;

        for (Employee employee : employees) {
            if (employee != null) {
                int temp = employee.getSalary();
                employee.setSalary(temp * (100 + percent) / 100);
            }
        }
    }

    //Нахождение сотрудника в отделе с минимальной ЗП
    public Employee findEmployeeWithMinSalaryInDepartment(int department) {
        int minIndex = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                minIndex = i;
            }
        }

        if (minIndex == -1) {
            return null;
        }

        for (int i = minIndex + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() < employees[minIndex].getSalary()) {
                minIndex = i;
            }
        }
        
        return employees[minIndex];
    }

    //Нахождение сотрудника в отделе с максимальной ЗП
    public Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        int maxIndex = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                maxIndex = i;
            }
        }

        if (maxIndex == -1) {
            return null;
        }

        for (int i = maxIndex + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() > employees[maxIndex].getSalary()) {
                maxIndex = i;
            }
        }

        return employees[maxIndex];
    }

    //Нахождение средней ЗП в отделе
    public int calculateAverageSalaryInDepartment(int department) {
        int sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    //Сумма затрат на ЗП по отделу
    public int calculateTotalSalaryInDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    //Индексация ЗП по отделу
    public void increaseSalaryInDepartment(int percent, int department) {
        if (percent < 0) return;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                int temp = employee.getSalary();
                employee.setSalary(temp * (100 + percent) / 100);
            }
        }
    }

    //Печать данных о сотрудниках в отделе
    public void printEmployeeInfoInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                String s = "ID: " + employee.getId() +
                        "\nФИО: " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() +
                        "\nЗарплата: " + employee.getSalary();
                System.out.println(s);
            }
        }
    }

    //Вывод информации о сотрудниках, у которых ЗП меньше заданного числа
    public void printEmployeesWithSalaryLessThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }

    //Вывод информации о сотрудниках, у которых ЗП больше или равна заданному числу
    public void printEmployeesWithSalaryMoreThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }

    //Добавление сотрудника
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    //Удаление сотрудника по ID
    public boolean removeEmployee(int Id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == Id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }
}
