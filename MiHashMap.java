import java.util.Arrays;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    private int[] valores;
    private String[] claves;
    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        valores = new int [0];
        claves = new String[0];
    }

    /**
     * Método que asocia el valor especificado con la clave especificada. Si la clave existía, 
     * entonces sobreescribe su valor y devuelve el valor antiguo. Si no existía devuelve -1.
     */
    public int put(String clave, int valor)
    {
        int devolver = -1;
        for(int cont = 0;cont < claves.length && devolver == -1; cont++){
            if(claves[cont].equals(clave)){
                devolver = valores[cont];
                claves[cont] = clave;
                valores[cont] = valor;
            }
        }
        if(devolver == -1){
            int[]valores1 = new int[(valores.length + 1)];
            for(int cont1 = 0; valores.length > cont1; cont1++){
                valores1[cont1] = valores[cont1];
            }
            valores1[valores.length]=valor;
            valores = valores1;
            String[]claves1 = new String[(claves.length+1)];
            for(int cont2 = 0; claves.length > cont2; cont2++){
                claves1[cont2] = claves[cont2];
            }
            claves1[claves.length]=clave;
            claves = claves1;
        }
        return devolver;
    }

    /**
     * Metodo que devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave)
    {
        int valor = -1;
        for(int cont = 0;cont < claves.length && valor == -1;cont++){
            if(claves[cont].equals(clave)){
                valor = valores[cont];
            }
        }
        return valor;
    }

    /**
     * Metodo que devuelve true si el mapa no contiene elementos
     */
    public boolean isEmpty()
    {
        return claves.length==0;
    }

    /**
     *  Metodo que devuelve el número de elementos del mapa.
     */
    public int size()
    {
        return claves.length;
    }

    /**
     * Metodo que vacía el mapa.
     */
    public void clear()
    {
        valores = new int [0];
        claves = new String[0];
    }

    /**
     * Metodo que devuelve true si el mapa contiene la clave dada.
     */
    public boolean containsKey(String clave)
    {
        boolean encontrado = false;
        for(int cont = 0;cont < claves.length || encontrado == false;cont++){
            if (claves[cont].equals(clave)){
                encontrado = true;
            }
        }
        return encontrado;
    }
}