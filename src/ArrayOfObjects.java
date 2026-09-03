class Student{

                int rollno;
                String name;
                int marks;

        }



public class ArrayOfObjects {
    static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 21;
        s1.name = "Siddartha";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 21;
        s2.name = "Siddartha";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno = 21;
        s3.name = "Siddartha";
        s3.marks = 88;

        Student s4 = new Student();
        s4.rollno = 21;
        s4.name = "Siddartha";
        s4.marks = 88;

        Student students[] = new Student[4];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollno + " . " + students[i].name + " : " + students[i].marks);
        }

    }
}
