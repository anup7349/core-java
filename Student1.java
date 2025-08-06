class Student1 {
    private String studentName;
    private int rollNumber;
    private String department;
    private float percentage;
    private char grade;

    public Student1() {
    }

    public Student1(String studentName) {
        this.studentName = studentName;
    }

    public Student1(String studentName, int rollNumber) {
        this(studentName);
        this.rollNumber = rollNumber;
    }

    public Student1(String studentName, int rollNumber, String department) {
        this(studentName, rollNumber);
        this.department = department;
    }

    public Student1(String studentName, int rollNumber, String department, float percentage) {
        this(studentName, rollNumber, department);
        this.percentage = percentage;
    }

    public Student1(String studentName, int rollNumber, String department, float percentage, char grade) {
        this(studentName, rollNumber, department, percentage);
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public float getPercentage() {
        return percentage;
    }

    public char getGrade() {
        return grade;
    }
}
