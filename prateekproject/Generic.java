class Geni <T> {
    T data;
     Geni (T data){
        this.data=data;
    }
    void setdata(T data){
       this.data=data;
    }
    T getData(){
        return data;
    }
}
public class Generic{
     
    public static void main(String[] args) {
        Geni<String>r=new Geni("Kapa Badmosh");
        System.out.println(r.data);
        Geni<Double>d=new Geni(3545.3972);
        System.out.println(d.getData());
        
    }
}
