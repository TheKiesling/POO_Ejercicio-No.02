/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Perro {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Perro.java
    @version: 
        - Creación: 17/08/2021
        - Última modificación: 20/08/2021

    Clase que crea perros con todos sus datos
    */

    //---------------------------PROPIEDADES-------------------------
    private String tamano;
    private String raza;
    private String edad;
    private String estado_salud;
    private String color;
    private String nombre;

    //---------------------------MÉTODOS-----------------------------

    /*****************************************************************
     * Constructor: asigna los datos al perro instanciado
     * @param tamaño
     * @param raza
     * @param edad
     * @param estado_salud
     * @param color
     * @param nombre
    */
    public Perro(String tamano, String raza, String edad, String estado_salud, String color, String nombre){
        this.tamano = tamano;
        this.raza = raza;
        this.edad = edad;
        this.estado_salud = estado_salud;
        this.color = color;
        this.nombre = nombre;
    }
    //***************************************************************

    /****************************************************************
     * Constructor (overloading): Instancia un perro con datos vacíos
    */
    public Perro(){
        tamano = "";
        raza = "";
        edad = "";
        estado_salud = "";
        color = "";
        nombre = "";
    }
    //***************************************************************

    /****************************************************************
     * getterTamaño: retorna el valor del tamaño
     * @return tamaño
    */
    public String getTamano(){
        return tamano;
    }
    //***************************************************************

    /****************************************************************
     * getterRaza: retorna el valor de la raza
     * @return raza
    */
    public String getRaza(){
        return raza;
    }
    //***************************************************************
}
