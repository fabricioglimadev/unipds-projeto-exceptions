import java.util.InputMismatchException;
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
    }
    catch (ArithmeticException e){
      System.out.println("Erro - Divisao por zero!");
    }
    catch (InputMismatchException e){
      System.out.println("Erro - Voce deveria digitar numeros inteiros!");
    }
    catch (Exception e){
      System.out.println("Erro!");
    }

  }

}
