import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your exam score in number: ");

        int grade= input.nextInt();

       if (grade >=  97 && grade <= 100){
           System.out.println("Good Job. Your grade is A+.");
       }else if(grade >= 94 && grade <= 96){
           System.out.println("Good Job. Your grade is A.");
       }else if (grade >= 90 && grade <=93){
           System.out.println("Good Job. Your grade is A-.");
       }else if (grade >= 87 && grade <=89){
           System.out.println("Good Job. Your grade is B+.");
       }else if (grade >= 84 && grade <=86){
           System.out.println("Good Job. Your grade is B.");
       }else if (grade >= 80 && grade <= 83){
           System.out.println("Good Job. Your grade is B-.");
       }else if (grade >= 77 && grade <=79){
           System.out.println("Good Job. Your grade is C+.");
       }else if (grade >=74 && grade <= 74){
           System.out.println("Good Job. Your grade is C.");
       }else if(grade >= 70 && grade <= 73 ){
           System.out.println("Good Job. Your grade is C-.");
       }else if (grade >= 60 && grade <= 69){
           System.out.println("Your grade is D.");
       }else {
           System.out.println("Go back to School.");
       }

    }
}
