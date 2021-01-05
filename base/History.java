package base;

import java.io.*;

import java.util.Scanner;

class History extends Printer implements Helper {
    public String bname;

    public void Showlist() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Chosse Follwoing catagory");
        System.out.println("1. History of Roman Empire");
        System.out.println("2. Bangladesh Studies");
        System.out.println("3. Untold Story of Bangabondhu Sheikh Mujibor Rahman");
        int ch;
        System.out.print("Enter choice: ");
        ch = inp.nextInt();
        switch (ch) {
            case 1:
                bname = "History of Roman Empire";
                break;
            case 2:
                bname = "Bangladesh Studies";
                break;
            case 3:
                bname = "Untold Story of Bangabondhu Sheikh Mujibor Rahman";
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