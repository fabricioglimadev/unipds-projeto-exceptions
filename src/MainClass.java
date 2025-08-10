import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {

    Produto p = new Produto();
    p.setId(0);
    p.setNome(null);
    p.setPreco(10);
    System.out.println(p);

    /*
    try (Scanner scanner = new Scanner(System.in)) {
      int a, b, r;
      System.out.println("Digite a");
      a = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite b");
      b = scanner.nextInt();
      r = a / b;
      System.out.println("Valor de r = " + r);
    } catch (ArithmeticException e) {
      System.out.println("Erro - Divisao por zero!");
    } catch (InputMismatchException | NumberFormatException e) { //Agrupa Exceptions
      System.out.println("Erro - Voce deveria digitar numeros inteiros!");
    } catch (Exception e) {
      System.out.println(e.getClass().getName());//Nome da classe da Exception
      System.out.println("Erro!");
    }
     */

  }

}

/*
* Como a classe Scanner implementa a interface Closeable não é necessário adicionar finally, try-with-resource
* */