public class Classroom {
    private Student[] students;
    private int studentCount;

    public Classroom(){
        students=new student[10];
        studentCount=0;

    }

    public void addstudent(Student student){
        if (studentCount<students.length){
           students[studentCount++]=student; 
        }
        else
        {
            System.out.println("cannot add more students");
        }

    }

public void updateAttendence(int studentId)













}