package ooplab7;

import ooplap7.SuperCar;

import java.util.Scanner;

class mysupercar {

    public static void  main (String[] args) {

        SuperCar s = new SuperCar();
        s = inputData(s);
        s.getSupercarInfo();

    }

    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Supercar info : ");
        System.out.print("Enter CarBrand : ");
        s.setcarbrand(scanner.nextLine());
        System.out.print("Enter CarColor : ");
        s.setcarcolor(scanner.nextLine());
        System.out.print("Enter CarEnginesize : ");
        s.setcarenginesize(scanner.nextLine());
        System.out.print("Enter CarMaxspeed : ");
        s.setmaxspeed(scanner.nextLine());
        System.out.print("Enter CountryofOrigin : ");
        s.setcountryoforigin(scanner.nextLine());
        return s;
    }//main

}//class

