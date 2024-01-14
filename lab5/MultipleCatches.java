class MultipleCatches{

       public static void main(String args[]){
		try{
                    
                      int a = args.length;
                      System.out.println("a+"+a);
                      int b= 10/a;
                      int[] c = {1};
                      c[42]=3;
                    }
          
                     catch(ArithmeticException ae){
                 			System.out.println("division by :"+ae);
                     
                     }
                        
                     catch(ArrayIndexOutOfBoundsException e){
                                        System.out.println("Array index obb"+e);
                     }
                     
                     System.out.println("After try/catch blocks");
         }
    
}