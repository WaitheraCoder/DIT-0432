import java.util.Scanner;

class UserInput { 

   
    public static void main(String[] args) {

        //Create the scanner object to read user information
        Scanner scanner = new Scanner(System.in);
        
        //Print to the user a prompt for their full name
        System.out.println("Please enter your full name.");
        System.out.print("Full name :");
        
        //Read the user full name
        String fullName = scanner.nextLine();


        //Prompt the user for their age
        System.out.println("Please enter your age");
        System.out.print("Age : ");

        //reading the age to my age variable
        int age = scanner.nextInt();

        //Prompt and read user height
        System.out.println("Please enter your height in Meters");
        System.out.print("Height : ");
        Double height = scanner.nextDouble();


        //Diplay the welcome message to the user
        System.out.println("=======+++++      Welcome "+fullName+"       ++++=========");
        System.out.println("Your age is : "+age);
        System.out.println("Your height is "+height+" Meters");

    }
}