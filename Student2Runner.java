public class Student2Runner {
    public static void main(String[] args) {
        Student[] classRoom = new Student[5];

        Student s1 = new Student();
        s1.setStudentName("Anup");
        s1.setRollNumber(1);
        s1.setGrade('A');
        classRoom[0] = s1;

        Student s2 = new Student();
        s2.setStudentName("Charan");
        s2.setRollNumber(2);
        s2.setGrade('B');
        classRoom[1] = s2;

        Student s3 = new Student();
        s3.setStudentName("Kartik");
        s3.setRollNumber(3);
        s3.setGrade('A');
        classRoom[2] = s3;

        Student s4 = new Student();
        s4.setStudentName("Shreyas");
        s4.setRollNumber(4);
        s4.setGrade('C');
        classRoom[3] = s4;

        Student s5 = new Student();
        s5.setStudentName("Manthan");
        s5.setRollNumber(5);
        s5.setGrade('B');
        classRoom[4] = s5;

        for (int i = 0; i < classRoom.length; i++) {
            Student stu = classRoom[i];
            System.out.println("Name: " + stu.getStudentName());
            System.out.println("Roll No: " + stu.getRollNumber());
            System.out.println("Grade: " + stu.getGrade());
            System.out.println("------------------------");
        }
    }
}
