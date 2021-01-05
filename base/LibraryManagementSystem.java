package base;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("********Welcome AIUB Library************");
        System.out.print("Enter Your Student ID: ");
        Scanner inp = new Scanner(System.in);
        String id, name,dept;
        id = inp.nextLine();
        System.out.println();
        System.out.print("Enter Your Name: ");
        name = inp.nextLine();
		System.out.println();
		System.out.print("Enter Your Department Name: ");
        dept = inp.nextLine();
		System.out.println();
        System.out.println("Select From following catagory");
        System.out.println("1. History");
        System.out.println("2. Nobel");
        System.out.println("3. Techonology");
		System.out.println();
        System.out.print("Enter choice:");
        int ch;
        ch = inp.nextInt();
        switch (ch) {
            case 1: {

                History obj = new History();
                obj.Showlist();
                obj.setinfo(id, name, dept);

            }
                break;
            case 2: {
                Nobel obj = new Nobel();
                obj.Showlist();
                obj.setinfo(id, name, dept);

            }
                break;
            case 3: {
                Technology obj = new Technology();
                obj.Showlist();
                obj.setinfo(id, name, dept);

            }

                break;

            default:
                break;
        }

    }

}
