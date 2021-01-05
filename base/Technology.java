package base;

import java.util.Scanner;
import java.io.*;

public class Technology extends Printer implements Helper {
    private String bname;

    public void Showlist() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Chosse Follwoing catagory");
        System.out.println("1. Compelte Reference of Java By Harbert Schildt");
        System.out.println("2. A Berif History of Timen By Steven Hawking");
        System.out.println("3. Numerical Method of Engennering By Dilruba Yasmin");
        int ch;
        System.out.print("Enter choice: ");
        ch = inp.nextInt();
        inp.close();
        switch (ch) {
            case 1:
                bname = "Compelte Reference of Java By Harbert Schildt";
                break;
            case 2:
                bname = "A Berif History of Timen By Steven Hawking";
                break;
            case 3:
                bname = "Numerical Method of Engennering By Dilruba Yasmin";
                break;

            default:
                break;
        }

    }

    public void setinfo(String id, String name,String dept) {
        try {
            filesio(id, name,dept, bname);
            System.out.println("Book borrowing Successful Please Print the statement");

        } catch (IOException e) {
            System.out.println("Sorry Unhandeled Exception");
            e.printStackTrace();
        }
    }

}