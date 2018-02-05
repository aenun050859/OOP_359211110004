package ooplab9;
public class PersonApp {
    public static void main(String[] args) {
        person person = new person("Kanyarat SongSri","1111111111111",
                new Address("26 M.3","Trang","92110"),
                new Job("Student","7000"));

        System.out.println(person.toString());
        person.getJob().setSalary("30000");
        System.out.println(person.getJob());


    }//main
}//class