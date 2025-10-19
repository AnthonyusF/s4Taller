public class Moto {

    String modelo;
    String marca;
    String color;
    double precio;
    int cilindraje;

    public Moto() {

    }
    public Moto(String modelo, String marca, String color, double precio, int cilindraje) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.cilindraje = cilindraje;
    }

    public void imprimir(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio);
        System.out.println("Cilindraje: "+cilindraje+"\n");
    }




}
