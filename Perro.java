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
        - Última modificación: 17/08/2021

    Clase que crea perros con todos sus datos
    */

    //---------------------------PROPIEDADES-------------------------
    private String tamaño;
    private String raza;
    private int edad;
    private int estado_salud;
    private String color;
    private String nombre;

    //---------------------------MÉTODOS-----------------------------

    /****************************************************************
     * Constructor: asigna los datos al perro instanciado
     * @param tamaño
     * @param raza
     * @param edad
     * @param estado_salud
     * @param color
     * @param nombre
     */
    public Perro(String tamaño, String raza, int edad, int estado_salud, String color, String nombre){
        this.tamaño = tamaño;
        this.raza = raza;
        this.edad = edad;
        this.estado_salud = estado_salud;
        this.color = color;
        this.nombre = nombre;
    }
    //***************************************************************

    /****************************************************************
     * getterTamaño: retorna el valor del tamaño
     * @return
     */
    public String getTamaño(){
        return tamaño;
    }
    //***************************************************************

    /****************************************************************
     * getterRaza: retorna el valor de la raza
     * @return
     */
    public String getRaza(){
        return raza;
    }
    //***************************************************************
}
