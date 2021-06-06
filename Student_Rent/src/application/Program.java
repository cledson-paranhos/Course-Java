package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student[] vect = new Student[9];
        System.out.print("how many rooms do you want to rent? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Rent #"+ (i+1));
            String name = sc.nextLine();
            String email = sc.nextLine();
            int room = sc.nextInt();
            vect[room] = new Student(name, email);
        }

        System.out.println("Busy rooms: ");

        for (int i = 0; i<vect.length; i++){
            if(vect[i] != null){
                System.out.println(i+": " + vect[i]);
            }
        }
    }
}
