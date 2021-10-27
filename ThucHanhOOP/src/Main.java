
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nhattpam
 */
public class Main {

    //Hien thi ra list student
    public void f0(ArrayList<Student> list) {
        for (Student o : list) {
            System.out.println(o);
        }
    }

    public int f1(ArrayList<Student> list) {
        int count = 0;
        for (Student o : list) {
            if (o.getMark() >= 5) {
                count++;
            }
        }
        return count;
    }

    public int f2(ArrayList<Student> list) {
        int count = 0;
        for (Student o : list) {
            if (o.getMark() == 10) {
                count++;
            }

        }
        return count;
    }

    public void f3(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student t, Student t1) {
                return t.getAge() - t1.getAge();
            }
            
        });
    }

    public void f4(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student t, Student t1) {
                if(t.getMark() > t1.getMark()){
                    return 1;
                }else if(t.getMark() < t1.getMark()){
                    return -1;
                }else
                    return 0;
            }
            
        });
    }
// tra ve thong tin ban nguyen van b
    public Student f5(List<Student> list) {
        for (Student o : list) {
            if(o.getName().equalsIgnoreCase("nguyen van b"));
            return o;
            
        }
        return null;
    }

    public ArrayList<Student> f6(List<Student> list) {
        ArrayList<Student> list10 = new ArrayList<>();
        for (Student o : list10) {
            if(o.getMark()==10){
                list10.add(o);
            }
        }
        return list10;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Student s0 = new Student("nguyen van g", 20, 10);
        Student s1 = new Student("nguyen van c", 21, 5.5);
        Student s2 = new Student("nguyen van k", 19, 4.5);
        Student s3 = new Student("nguyen van b", 20, 9.5);
        Student s4 = new Student("nguyen van e", 18, 10);
        Student s5 = new Student("nguyen van a", 26, 7.5);
        Student s6 = new Student("nguyen van i", 25, 6.5);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s0);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        System.out.println("============f0===============");
        m.f0(list);

        System.out.println("============f1===============");
        int count1 = m.f1(list);
        System.out.println("so sv co diem >= 5 la: " + count1);

        System.out.println("============f2================");
        int count2 = m.f2(list);
        System.out.println("so sv dat diem 10 la: " + count2);

        System.out.println("============f3=================");
        System.out.println("---danh sach sv tang dan theo tuoi---");

        m.f3(list);
        for (Student o : list) {
            System.out.println(o);
        }
        
        System.out.println("===========f4===================");
        System.out.println("---danh sach sv tang dan theo diem--");
        
        m.f4(list);
        for (Student o : list) {
            System.out.println(o);
        }
        
        
        System.out.println("======================f5=======================");
        Student s = m.f5(list);
        System.out.println("--thong tin la ---");
        System.out.println(s);
        
        
        
        System.out.println("----------------f6-------------------");
        System.out.println("----list sinh vien 10 diem ---");
        List<Student> list1 = m.f6(list);
        for (Student o : list1) {
            System.out.println(o);
        }
    }

}
