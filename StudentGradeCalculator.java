import java.util.Scanner;                                                                  // imported Scanner class

public class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);                                         // Scanner Class

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();                                             // created user defined obejct named numsubjects
        
        
        System.out.println("Enter marks obtained in each subject (out of 100):");                          

        int[] marks = new int[numSubjects];                                             // Created an int array to collect marks for number of each subject given by user 


        for (int i = 0; i < numSubjects; i++)               // for loop used for incrementing the number of subjects so the number of marks = numsubject respectively
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();                 
        }

        int totalMarks = calculateTotalMarks(marks);        
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);     
        char grade = calculateGrade(averagePercentage);     

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();        
    }



    public static int calculateTotalMarks(int[] marks)          //Seperate Method to calculate Total Marks of all the number of subjects 
    {
        int total = 0;
        for (int cal : marks) 
        {
            total += cal;
        }
        return total;
    }

    public static double calculateAveragePercentage(int totalMarks, int numSubjects)      // Method for calculating average Percentage of all the subjects 
    {
        return (double) totalMarks / numSubjects;
    }

    public static char calculateGrade(double averagePercentage)         // Method to create Grade of the average percentage obtained
    {
        if (averagePercentage >= 90)
        {
            return 'A';
        } else if (averagePercentage >= 80)
        {
            return 'B';
        } else if (averagePercentage >= 70) 
        {
            return 'C';
        } else if (averagePercentage >= 60) 
        {
            return 'D';
        } else 
        {
            return 'F';
        }
    }
}

