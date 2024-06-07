package application;

public class Attendance {
   
    Student s=new Student();
    String rollNo=s.getRollNo();
    String Attendance;

    public Attendance(String rollNo, String attendance) {
        rollNo = rollNo;
        Attendance= attendance;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        rollNo = rollNo;
    }

    public String getAttendance() {
        return Attendance;
    }

    public void setAttendance(String attendance) {
        Attendance = attendance;
    }
}