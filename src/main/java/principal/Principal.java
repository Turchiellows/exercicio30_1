// PACKAGES
package principal;

// IMPORTS
import java.util.Scanner;
import java.util.Random;
import model.Aluno;

public class Principal {

   public static void main(String[] args) {
      // INSTANTIATE ===========================================================
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      Aluno xuxa = new Aluno("Xuxa da globo", "Rio de Janeiro", 171171171, 23514.49); // VIP
      Aluno normal1 = new Aluno(); // Normal

      
      
      // DECLARATE =============================================================
      String nome;
      String endereco;
      Double mensalidade;
      int matricula;
      String[] temp = new String[3];

      
      
      // READ DATA FOR NOEMAL =================================================
      System.out.print("Nome        : ");
      nome = sc.nextLine();
      System.out.print("Endereço    : ");
      endereco = sc.nextLine();
      System.out.print("Mensalidade : ");
      mensalidade = sc.nextDouble();
      matricula = rand.nextInt((99999999 - 11111111) + 1) + 11111111;

      // SET
      normal1.setNome(nome);
      normal1.setEndereco(endereco);
      normal1.setMensalidade(mensalidade);
      normal1.setMatricula(matricula);

      
      
      
      
      
      // SHOW NORMAL ===========================================================
      temp = normal1.lerAluno();
      System.out.println("\n====================================================");
      for (int i = 0; i < 4; i++) {
         System.out.println(temp[i]);
      }
      System.out.println("");

      
      
      
      
      
      // SHOW VIP ==============================================================
      temp = xuxa.lerAluno();
      System.out.println("\n====================================================");
      for (int i = 0; i < 4; i++) {
         System.out.println(temp[i]);
      }
      System.out.println("");
   }
}
