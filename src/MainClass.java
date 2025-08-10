import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {


    try {
      Scanner scanner = new Scanner(System.in);

      int a, b, r;
      System.out.println("Digite a");
      a = scanner.nextInt();
      System.out.println("Digite b");
      b = scanner.nextInt();
      r = a / b;
      System.out.println("Valor de r = " + r);

      scanner.close();
    } catch (ArithmeticException e){
      System.out.println("Erro - Divisao por zero!");
    } catch (Exception e){
      System.out.println("Erro!");
    }

  }

}
