public class AdvRecursion1 {
    public static void permu(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permu(newstr,permutation+curr );

        }
    }
    public static void main(String[] args) {
        String str="abc";
        permu(str, "");
    }
    
}
