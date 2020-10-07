// Made by Jatan Thanki
import java.util.Scanner;

public class CBSE_Marks_Percentage_Calculator {

        public static void main(String[] args) {
            float physics,chemistry,biology,english,hindi,computer,social_studies,maths;
            float percentage_marks;
            Scanner calculate = new Scanner(System.in);

            System.out.println("Please enter the marks of Maths ");
            maths = calculate.nextFloat();

            System.out.println("Please enter the marks of Chemistry ");
            chemistry = calculate.nextFloat();

            System.out.println("Please enter the marks of Biology ");
            biology = calculate.nextFloat();

            System.out.println("Please enter the marks of Physics ");
            physics = calculate.nextFloat();

            System.out.println("Please enter the marks of English ");
            english = calculate.nextFloat();

            System.out.println("Please enter the marks of Hindi ");
            hindi = calculate.nextFloat();

            System.out.println("Please enter the marks of Computer ");
            computer = calculate.nextFloat();

            System.out.println("Please enter the marks of Social Studies ");
            social_studies = calculate.nextFloat();
            
            calculate.close();
            float total_marks = physics+chemistry+biology+english+hindi+computer+social_studies+maths;
            System.out.println("Total marks of all Subjects is "+ total_marks);

            

            if (total_marks<= 800 && total_marks>0){
                   percentage_marks = total_marks/(800/100);
                   System.out.println("Percentage of all marks is "+ percentage_marks+'%');
            }









        }

}