public class Recursion5 {
    public static void isRemove(String str,int i,String newstr,int count){
       if(i==str.length()){
        for(int j=0;j<count;j++){
            newstr+='x';
        }
        System.out.println(newstr);
        return;
       }
        
        char currch=str.charAt(i);
        if(currch=='x'){
            count++;
            isRemove(str, i+1, newstr, count);
        }else{
            newstr+=currch;
            isRemove(str, i+1, newstr, count);
        }
        
        }

    
    public static void main(String[] args) {
        String str="axxbxcd";
        isRemove(str, 0, "", 0);
        
    }
    
}
