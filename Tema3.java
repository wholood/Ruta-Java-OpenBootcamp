/*Primera parte:
    Crear una función con tres parámetros que sean números que se suman entre sí.
    Llamar a la función en el main y darle valores.

Segunda parte:
    Crear una clase coche.
    Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    Una función que incremente el número de puertas que tiene el coche.
    Crear un objeto miCoche en el main y añadirle una puerta.
    Mostrar el número de puertas que tiene el objeto.*/
    
public class Main {
    public static void main(String args[]) {
      int x=1, y=2, z=3;
      
      var suma = adicion(x,y,z);
      
      coche miauto = new coche();
      miauto.setpuerta();
      
      System.out.println(miauto.puertas);
    }
    
    public static int adicion (int a, int b, int c){
        return a + b + c;
    }
}

class coche{
    public int puertas = 2;
    
    public void setpuerta (){
        this.puertas ++;
    }
}