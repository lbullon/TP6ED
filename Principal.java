import java.util.Scanner;

public class Principal {
  public static void main (String[] args) {
   Person p = new Person();
   Scanner sc = new Scanner(System.in);

   System.out.println("Introduzca su nombre:");
   p.setName(sc.nextLine()  );
   System.out.println("Introduzca su edad:");
   p.setAge(sc.nextInt());


   System.out.println(p);
  }
}
 