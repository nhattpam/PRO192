
/**
 *
 * @author nhattpam
 */
public class StudentManager {

    Student[] studentList = new Student[50];

    int numOfStudent = 0;

    public Student getStudentByIndex(int index) {
        return studentList[index];
    }

    //them sinh vien moi
    public int addStudent(Student newStudent) {
        if (numOfStudent < studentList.length) {
            studentList[numOfStudent++] = newStudent;
            return 1;
        } else {
            return 0;
        }
    }

    //in danh sach sinh vien
    public void printStudentList() {
        System.out.println("Student list: ");
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println(studentList[i].toString());

        }
    }

    public int findStudent(String ID) {
        int result = 0;
        for (Student o : studentList) {
            if (o.getmID() == ID){
                
            }   
        }
        return result;

    

    }
}
