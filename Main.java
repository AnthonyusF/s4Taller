//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Moto moto1 = new Moto();
        Moto moto2 = new Moto("YZ","Yamaha","rojo",9455.99,350);

        moto1.cilindraje= 300;
        moto1.modelo= "EXC";
        moto1.marca= "KTM";
        moto1.precio= 9999.99;
        moto1.color= "Naranja";


        moto1.imprimir();
        moto2.imprimir();
    }
}