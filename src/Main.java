public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addEmployee(new Employee("Иванов", "Иван", "Иванович", 80000, 4));
        book.addEmployee(new Employee("Петров", "Петр", "Петрович", 70000, 3));
        book.addEmployee(new Employee("Сидоров", "Кирилл", "Сергеевич", 90000, 1));
        book.addEmployee(new Employee("Попова", "Екатерина", "Андреевна", 100000, 2));
        book.addEmployee(new Employee("Любимова", "Инна", "Валерьевна", 80000, 5));
        book.addEmployee(new Employee("Чернов", "Дмитрий", "Владимирович", 90000, 5));
        book.addEmployee(new Employee("Николава", "Татьяна", "Анатольевна", 60000, 2));
        book.addEmployee(new Employee("Малинин", "Сергей", "Алексеевич", 110000, 3));
        book.addEmployee(new Employee("Ершов", "Григорий", "Олегович", 70000, 1));
        book.addEmployee(new Employee("Овечкина", "Елизавета", "Леонидовна", 70000, 5));
        //book.printEmployeesInfo();
        //System.out.println(book.getEmployeeWithMinSalary());
        //book.removeEmployee(5);
        //book.printEmployeesInfo();
        //book.addEmployee(new Employee("Любимова", "Инна", "Валерьевна", 80000, 5));
        //book.printEmployeesInfo();
        book.increaseSalaryInDepartment(10, 5);
        book.printEmployeesInfo();
    }
}