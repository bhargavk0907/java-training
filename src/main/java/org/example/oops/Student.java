package org.example.oops;

public class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, String address, String studentId, String major) {
        super(name, address);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

}
