import java.util.Scanner;

public class Main {
    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Press any character..");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its developer tea time...");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        announceDeveloperTeaTime();
        System.out.println("Write code.");
        System.out.println("Review code.");
        announceDeveloperTeaTime();
        System.out.println("Get promoted.");
    }
}
