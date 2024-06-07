package application;

public class Timetable {
    String Subject;
    String Classroom;
    String Timeslot;


    public Timetable(String subject, String classroom, String timeslot){
        this.Classroom=Classroom;
        this.Subject=subject;
        this.Timeslot=timeslot;
    }
    public Timetable(){

    }
    public String getClassroom() {
        return Classroom;
    }

    public void setClassroom(String aClass) {
        Classroom = aClass;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getTimeslot() {
        return Timeslot;
    }

    public void setTimeslot(String timeslot) {
        Timeslot = timeslot;
    }


}