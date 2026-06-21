public class Recursion3 {
    static int first=-1;
    static int last=-1;
    public static void findOccurence(int idx,String str,char ch) {
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        
        }
        char currch=str.charAt(idx);
        if(currch==ch){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findOccurence(idx+1, str, ch);
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOccurence(0, str, 'a');
    }
}
