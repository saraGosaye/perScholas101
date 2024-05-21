class student{
    //Name od student
    public void name_of_student(String name){
        System.out.println(String.format("student name is: %s", name));
    }
    public void grade(double grade){
        System.out.println(String.format("student grade is: %.2f", grade));
    }
}
public class InstanceMethod {
    public static void main(String[] args){
        //Create student1 object
        student student1 = new student();
        student1.name_of_student("Stacy");
        student1.grade(3.25);

        //Create student2 object
        student student2 = new student();
        student2.name_of_student("Kevin");
        student2.grade(3.75);

        //Create student3 object
        student student3 = new student();
        student3.name_of_student("Raj");
        student3.grade(3.10);
    }
}
