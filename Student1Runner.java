class Student1Runner {
    public static void main(String[] args) {
        Student1[] students = new Student1[5];

        students[0] = new Student1("Anjali", 101, "Computer Science", 89.5f, 'A');
        students[1] = new Student1("Rohit", 102, "Mechanical", 75.2f, 'B');
        students[2] = new Student1("Sneha", 103, "Electronics", 92.1f, 'A');
        students[3] = new Student1("Vikas", 104, "Civil", 67.4f, 'C');
        students[4] = new Student1("Priya", 105, "IT", 88.8f, 'A');

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getStudentName());
            System.out.println("Roll No: " + students[i].getRollNumber());
            System.out.println("Department: " + students[i].getDepartment());
            System.out.println("Percentage: " + students[i].getPercentage());
            System.out.println("Grade: " + students[i].getGrade());
           
        }
    }
}
