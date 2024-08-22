import java.util.Scanner;
 public class IT24102684Lab4Q1{
  public static void main(String[] args) {
   Scanner Scanner=new Scanner(System.in);
   System.out.println("Enter a Number");
   int number=Scanner.nextInt();
   if(number>0){
     System.out.println("This is a possitive number");
   } else if(number<0){
     System.out.println("This is a negative number");
   }
   else{
      System.out.println("The number you enterd is zero");
   }
   Scanner.close();
  }
} 