public class Recursion7 {
    public static String []keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String combition){
        if(idx==str.length()){
            System.out.println(combition);
            return;
        }
    
        char curr=str.charAt(idx);
        String mapping=keypad[curr-'0'] ;

        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combition+mapping.charAt(i));

        }
    }



    public static void main(String[] args) {
         String str="23";
         printComb(str, 0, "");
    }
}
