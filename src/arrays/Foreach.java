


public class Foreach {
  public static void main(String[] args) {
      
      double[] notas = { 7.0, 8.5, 9.3, 5.0 }; 

      for (int i = 0; i < notas.length; i++) {
          System.out.print(notas[i] +" ");
      }
      
        System.out.println();

      for (double nota : notas) {
          System.out.print(nota +" ");
      }
  }

}
