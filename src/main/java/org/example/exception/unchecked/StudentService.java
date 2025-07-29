package org.example.exception.unchecked;

import java.sql.SQLOutput;

public class StudentService {

  public void processStudent(Student    student) throws Exception {

      if (student != null && student.getAddress() != null) {

          System.out.println("Processing student: " + student.getName());
          System.out.println("Address Details:" +
                  "\nStreet: " + student.getAddress().getStreet() +
                  "\nCity: " + student.getAddress().getCity() +
                  "\nState: " + student.getAddress().getState() +
                  "\nZip Code: " + student.getAddress().getZipCode());
      }else{
          throw new Exception("Student or Address cannot be null");
      }
  }
}
