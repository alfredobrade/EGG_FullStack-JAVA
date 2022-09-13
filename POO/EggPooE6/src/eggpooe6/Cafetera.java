
package eggpooe6;


public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Cafetera llena");
    }
    public int servirTaza(int tamañoTaza){
        int cantidadTaza;
        if (this.cantidadActual < tamañoTaza){
            cantidadTaza = this.cantidadActual;
            this.cantidadActual = 0;
            System.out.println("La taza no pudo llenarse");
            System.out.println("en la taza hay"+cantidadTaza);
        }else {
            cantidadTaza = tamañoTaza;
            this.cantidadActual -= tamañoTaza;
            System.out.println("la taza se lleno completamente");
        }
        return cantidadTaza;
    }
    public void vaciarCafetera(){
        this.cantidadActual = 0;
        System.out.println("cafetera vacia");
    }
    public void agregarCafe(int cafeAgregado){
        this.cantidadActual += cafeAgregado;
        System.out.println("se agrego "+cafeAgregado+"\nahora hay "
                +cantidadActual+" en la cafetera");
    }
    
}
