public class EmployeeTest {
    public static void main(String[] args) {
        // Step 2
        System.out.println("=== Step 2: Hanya Employee ===");
        Employee[] onlyEmployee = new Employee[3];
        onlyEmployee[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        onlyEmployee[1] = new Employee("Maria Bianchi",  2500000, 1, 12, 1991);
        onlyEmployee[2] = new Employee("Isabel Vidal",   3000000, 1, 11, 1993);

        for (Employee e : onlyEmployee) {
            e.print();
        }
        System.out.println();

        // Step 4
        System.out.println("=== Step 4: Employee + Manager ===");
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi",  2500000, 1, 12, 1991); // Manager
        staff[2] = new Employee("Isabel Vidal",   3000000, 1, 11, 1993);

        System.out.println("Sebelum raiseSalary:");
        for (Employee e : staff) {
            e.print();
        }

        // Setiap object menjalankan raiseSalary() versinya sendiri
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        System.out.println("Sesudah raiseSalary(5):");
        for (Employee e : staff) {
            e.print();
        }
        System.out.println();
        
        // Step 7
        System.out.println("=== Step 7: Uji compare() ===");
        System.out.println("staff[0] vs staff[1]: " + staff[0].compare(staff[1]));
        System.out.println("staff[1] vs staff[2]: " + staff[1].compare(staff[2]));
        System.out.println("staff[2] vs staff[0]: " + staff[2].compare(staff[0]));
        System.out.println();

        // Step 8B
        System.out.println("=== Step 8B: Inheritance Chain Manager ===");
        Manager  m = new Manager("Maria Bianchi",  2500000, 1, 12, 1991);
        Employee e = new Employee("Isabel Vidal",   3000000, 1, 11, 1993);
        System.out.println("m.compare(e): " + m.compare(e));
    }
}
