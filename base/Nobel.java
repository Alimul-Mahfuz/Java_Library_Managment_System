package base;

import java.io.IOException;
import java.util.Scanner;

public class Nobel extends Printer implements Helper {
    private String bname;

    public void Showlist() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Chosse Follwoing catagory");
        System.out.println("1. Hamlet");
        System.out.println("2. Meghduttom");
        System.out.println("3. Agnibeena");
        int ch;
        System.out.print("Enter choice: ");
        ch = inp.nextInt();
        inp.close();
        switch (ch) {
            case 1:
                bname = "Hamlet";
                break;
            case 2:
                bname = "Meghduttom";
                break;
            case 3:
                bname = "Agnibeena";
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