import java.util.*;
class Main {
  public static void main(String[] args) {
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age");
    age=sc.nextInt();
    if(age>=18)
    {
      System.out.println("u can vote");
    }
    else
    {
      System.out.println("u cant' vote");
    }
  }
}