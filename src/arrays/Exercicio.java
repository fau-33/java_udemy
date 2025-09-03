
import java.util.Arrays;


public class Exercicio {

  public static void main(String[] args) {
    
    double[] notasAlunoA = new double[4];
    
    notasAlunoA[0] = 7.0;
    notasAlunoA[1] = 8.5;
    notasAlunoA[2] = 9.3;
    notasAlunoA[3] = 5.0;
    
   
    System.out.println(Arrays.toString(notasAlunoA));

    double totalAlunoA = 0;
    for (int i = 0; i < notasAlunoA.length; i++) {
      totalAlunoA += notasAlunoA[i];
    }

    System.out.println(totalAlunoA / notasAlunoA.length);
    double totalAlunoB = 0;
    final double notaArmazenadaB = 5.9;
    double[] notasAlunoB = { 6.0, 5.0, 7.0, 4.0, notaArmazenadaB };

    for (int i = 0; i < notasAlunoB.length; i++) {
      totalAlunoB += notasAlunoB[i];
    }


    System.out.println(totalAlunoB / notasAlunoB.length);

  }

}
