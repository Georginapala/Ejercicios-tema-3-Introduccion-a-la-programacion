public class Main{
  
  public static void main(String args[]){
    
    
    int resultado;
    resultado = suma(43,35,78);
    System.out.println("El resultado de la funcion suma es: " + resultado);

    Coche miCoche = new Coche();
    miCoche.agregarPuertas();
    System.out.println(" La cantidad de puertas que tiene el coche es: " + miCoche.puertas);
  }
   public static int suma(int a, int b, int c){
    return a + b + c;
 }
}
   class Coche{
   public int puertas = 4;


   public void agregarPuertas(){
     this.puertas ++; 
  }
 }
