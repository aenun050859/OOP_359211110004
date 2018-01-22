package ooplap7;

public class StudentApp {
    public static void main(String[] args) {
        //create object as Student
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setname("Boy Saiyai");
        s1.setmajor("Information System");
        s1.setgroup("IS221");

        Student s2 = new Student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221");
        showData(s1);
        showData(s2);

    }//main

    private static void showData(Student s) {
        System.out.println("Student info: ");
        System.out.println("ID: "+s.getId());
        System.out.println("Name: "+ s.getname());
        System.out.println("Major: "+ s.getmajor());


    }//showData
}//class
