 class That{
    int i;
    void show(int i){
        this.i=i;
    }
    void setShow(){
        System.out.println(i);
    }
 } 
 class This1 {
    public static void main(String[] args) {
        That t=new That();
        t.show(10);
        t.setShow();
    }
}
