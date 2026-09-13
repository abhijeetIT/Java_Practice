package src.main.java.JavaBasic.Array.MultidemantionalArray;

public class SumOfRow {
    public static void main(String[] args) {
          int[][] matrix = {
                  {1,2,3},
                  {4,5,6},
                  {7,7}
          };


          int sum=0;
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                sum += matrix[i][j];
            }
          }
          System.out.println(sum);

    }
}
