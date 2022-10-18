Assignment to understand polymorphism.

STEPS:

/*
 * Task 1:
 * create a class Product inside Main class
 *
 * Task 2:
 * create object of Product in Main function called p
 *
 * Task 3:
 * create a method of following defination
 * public int product(int x, int y) {}
 *
 * call this method from Main using Product class object p
 *
 * Task 4:
 * create a Overloaded method product of following defination
 * public int product(int x, int y, int z) {}
 *
 * call this method also from Main using Product class object p
 *
 * Task 5:
 * create a Overloaded method product of following defination
 * public double product(double x, double y) {}
 *
 * call this method also from Main using Product class object p
 *
 * Observations:
 * This class contains 3 classes with same name, but it complie & run successfully
 *
 */
 class Main{
    
    static class Product{
     public  int product(int x,int y)
     {
         return x*y;

     }
      public  int product(int x,int y,int z)
      {
          return x*y*z;

      }
      
      public  double product(double x, double y)
      {
           return (double)x*y;
      }
    }

    public static void main(String[] args) {
        Product p = new Product();
        
        System.out.println(p.product(2,3));
        System.out.println(p.product(2,3,4));
        System.out.println(p.product(2.5d,3.5d));
    }

}
