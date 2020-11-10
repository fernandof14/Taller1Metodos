import java.util.Random;

public class Principal {
    public static void main(String[] args){
        int [][]carro=crearCarro();
        llenarCarro(carro);
        mostrarCarro(carro);



    }
    static int[][] crearCarro(){
        int [][] carro=new int [(int) Math.floor(Math.random()*20+1)][2];
        return carro;
    }
    static void llenarCarro(int [] []carro){
        Random aleatorio = new Random();
        int precioIni=500;
        for (int i=0;i<carro.length;i++){
            carro[i][0]=precioIni;
            carro[i][1]=aleatorio.nextInt(15)+1;;
            precioIni+=150;
        }
    }
    static void mostrarCarro(int [] []carro){
        int subtotal=0;
        for (int i=0;i<carro.length;i++){
            subtotal+=(carro[i][0]*carro[i][1]);
            System.out.println("Cantidad Producto n°"+i+": ["+carro[i][1]+"]"+", Subtotal: $"+subtotal);
        }
        System.out.println(cantidadProductos(carro));
        System.out.println("El total de la compra es: $"+totalCompra(carro));
    }
    static String cantidadProductos(int [][]carro){
        int cantidad=0;
        for (int i=0;i<carro.length;i++){
            cantidad+=carro[i][1];
        }
        return "La cantidad de productos es: "+cantidad;
    }
    static int totalCompra(int [] []carro){
        int total=0;
        for (int i=0;i<carro.length;i++){
            total+=(carro[i][0]*carro[i][1]);
        }
        return total;
    }
}
