package prateekproject;

class Geni<T> {
    T data;

    Geni(T data) {
        this.data = data;
    }

    void setData(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }
}

public class Generic {

    public static void main(String[] args) {
        Geni<String> strObj = new Geni<>("Kapa Badmosh");
        System.out.println(strObj.data);
        Geni<Double> numObj = new Geni<>(3545.3972);
        System.out.println(numObj.getData());
    }
}
