public class EmployeeRunner {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];

        Employee e1 = new Employee();
        e1.setEmployeeName("Anup");
        e1.setEmployeeId(101);
        e1.setSalary(50000);
        staff[0] = e1;

        Employee e2 = new Employee();
        e2.setEmployeeName("Charan");
        e2.setEmployeeId(102);
        e2.setSalary(52000);
        staff[1] = e2;

        Employee e3 = new Employee();
        e3.setEmployeeName("Kartik");
        e3.setEmployeeId(103);
        e3.setSalary(48000);
        staff[2] = e3;

        Employee e4 = new Employee();
        e4.setEmployeeName("Shreyas");
        e4.setEmployeeId(104);
        e4.setSalary(53000);
        staff[3] = e4;

        Employee e5 = new Employee();
        e5.setEmployeeName("Manthan");
        e5.setEmployeeId(105);
        e5.setSalary(55000);
        staff[4] = e5;

        for (int i = 0; i < staff.length; i++) {
            Employee emp = staff[i];
            System.out.println("Name: " + emp.getEmployeeName());
            System.out.println("ID: " + emp.getEmployeeId());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("----------------------");
        }
    }
}