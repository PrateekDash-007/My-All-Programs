 class That{
    That(This2 td){
        System.out.println("That class constructor");
    }
}
 class This2 {
    void m1(){
        That t=new That(this);
    }
    public static void main(String[] args) {
        This2 t=new This2();
        t.m1();
    }
}
