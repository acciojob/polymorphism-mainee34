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