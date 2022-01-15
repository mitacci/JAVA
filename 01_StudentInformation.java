import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float grade = sc.nextFloat();
        System.out.printf("Name: %s, Age: %d, Grade %.2f", name, age, grade);
    }
}
