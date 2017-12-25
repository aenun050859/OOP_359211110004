package ooplap6;

public class myStrBuffer {
    public static void main(String[] args) {
//        StringBuffer

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);
        buffer.replace(0,5,"University of");
        System.out.println(buffer);
        System.out.println(buffer.reverse()); //สลับตำแหน่งข้อความ
        buffer.setCharAt(0,'T'); //วลับข้อความจาก U เป็น T
        System.out.println(buffer);

    }//main
}//class
