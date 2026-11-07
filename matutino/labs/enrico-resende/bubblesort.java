import java.util.Scanner;
public class sort{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros: ");
    int n = sc.nextInt();
    double[] a = new double[n];
    System.out.printf("Digite os %d numeros da array: ", n);
    for (int i = 0; i < n; i++){
      a[i] = sc.nextDouble();
    }
    double startTime = System.nanoTime();
    sort(a, n);
    double endTime = System.nanoTime();
    printVetor(a, n);
    System.out.printf("\nRuntime: %fms", (endTime - startTime)/1000000);
  }

  public static void sort(double[] a, int n){
    boolean flag = true;
    while(flag){
      flag = false;
      for (int i = 0; i < n-1; i++) {
        double temp = a[i];
        if(a[i] > a[i+1]){
          a[i] = a[i+1];
          a[i+1] = temp;
          flag = true;
        }
      }
    }
  }
  public static void printVetor(double[] a, int n){
    for (int i = 0; i < n; i++) {
      System.out.printf("%.2f ", a[i]);
    }
  }

}
