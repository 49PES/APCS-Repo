public class Loops{
    public static double power(double x, int n){
        int i = 0;
        double product = 1.0;
        while (i < n) {
            product = product * x;
            i = i + 1;
        }
        return product;
    }
    public static double factorial(int x){
        int i = 1;
        int product = 1;

        while(i <= x){
            product = product * i;
            i = i + 1;
        }
        return product;
    }
  /*
    public static double myexp(int x, int n) {
        int i = 0;
        double sum = 0;
        while(i < n){
            sum = sum + Math.pow(x, i) / factorial(i);
            i = i + 1;
        }
        return sum;
    }
  */
    public static double myexp(double x, int n){
      int i = 0;
      double incremental_variable = 1.0;
      double sum = 0;
      while (i < n){
        if (i == 0){incremental_variable = 1.0;}
        else {incremental_variable = incremental_variable * x / i;}
        sum = sum + incremental_variable;
        i = i + 1;
      }
      return sum;
    }

    public static void check(double x){
        System.out.println(x + "\t" + myexp(x, 18) + "\t" + Math.exp(x));
    }


     public static void main(String []args){
        // System.out.println(myexp(4, 3));
        for(int i = 1; i <= 4; i = i + 1){
                check(Math.pow(10.0, (i - 2) ));
            }
            System.out.println();
            for(int i = 1; i <= 4; i = i + 1){
                check(-Math.pow(10.0, (i - 2) ));
            }


     }
}
