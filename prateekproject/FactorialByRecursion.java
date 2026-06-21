public class FactorialByRecursion {
    int calcFact(int no){
        if(no<0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers: "+no);
        }
        if(no==0||no==1){
        return 1;//base case 
        }
        else
        {
            return no * calcFact(no-1);
        }
   }
   public static void main(String[] args) {
    int no=5;
    FactorialByRecursion ob=new FactorialByRecursion();
    try {
        int fact=ob.calcFact(no);
        System.out.println("factor of "+no+" is "+fact);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: "+e.getMessage());
    }

   }
}
