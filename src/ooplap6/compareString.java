package ooplap6;

public class compareString {
    public static void main(String[] args) {
        //compare String
        String m = "Hello ";
        String n = "Hello";
        //type 1 (==)
        if (m==n)System.out.println("yes.");
        else System.out.println("no.");
        //type 2 (equal())
        if ( (m.equals(n)))System.out.println("yes.");
        else System.out.println("no.");
        //type 3 (compareTo())ผลการเปรียบเทียบจะออกมาทั้งหมด 3 ค่า
        if (m.compareTo(n)==0)System.out.println("yes.");
        else if (m.compareTo(n)>=1) //ถ้าค่าเป็นบวกแสดงว่ามีค่ามากกว่า0 ถ้าเป็นลบมีค่าน้อยกว่า 0
            System.out.println("no. +");
        else System.out.println("no. -");








    }//main
}//class
