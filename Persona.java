/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Persona {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Persona.java
    @version: 
        - Creación: 17/08/2021
        - Última modificación: 17/08/2021

    Clase que crea personas con su nombre y edad.
    */

    //---------------------------PROPIEDADES-------------------------
    private String nombre;
    private int edad;

    //---------------------------MÉTODOS-----------------------------

    /****************************************************************
     * Constructor: asigna nombre y edad a la persona instanciada
     * @param nombre
     * @param edad
    */ 
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //****************************************************************

    /*****************************************************************
     * getterEdad: retorna el valor de la edad
     * @return edad
     */
    public int getEdad(){
        return this.edad;
    }
    //****************************************************************
}
