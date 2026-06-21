
public class Recursion6 {
    static boolean b[]=new boolean[26];
    public static void isDuplicate(String str,int idx,String newstr){
        if(idx==str.length()){
           System.out.println(newstr);
           return;
        }
         char currch=str.charAt(idx);
         if(b[currch-'a']=true){
            isDuplicate(str, idx+1, newstr);
         }
         else{
            newstr+=currch;
            b[currch-'a']=true;
            isDuplicate(str, idx+1, newstr);
         }

    }
    public static void main(String[] args) {
        String str="abbcdde";
        isDuplicate(str, 0, "");
    }
    }

