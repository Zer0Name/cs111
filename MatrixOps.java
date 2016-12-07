public class MatrixOps {
 
 public static double[][] multiply(double[][] one, double[][] two){
  if (one[0].length != two.length){
   return null;
  }
  double[][] Arr = new double[one.length][two[0].length];
  for(int i=0; i<one.length; i++){
        for(int k=0; k<two[0].length; k++){
        Arr[i][k] = 0;
            for(int j=0; j<one[0].length; j++){
            Arr[i][k]+= one[i][j]*two[j][k];
        }
    }
    }
  return Arr;
 }
}