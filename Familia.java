/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Familia {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Familia.java
    @version: 
        - Creación: 17/08/2021
        - Última modificación: 17/08/2021

    Clase que crea familias que adoptarán perros
    */

    //---------------------------PROPIEDADES-------------------------
    private String apellido;
    public Persona[] miembros;
    private int numero_mascotas;
    //---------------------------MÉTODOS-----------------------------

    /****************************************************************
     * Constructor: asigna los datos a la familia instanciada
     * @param apellido
     * @param miembros
     * @param numero_mascotas
     * @param persona
    */
    public Familia(String apellido, Persona[] miembros){
        this.apellido = apellido;
        this.miembros = miembros;
        //Una familia al ingresar al sistema tiene 0 mascotas.
        numero_mascotas = 0;        
    }
    //***************************************************************

    /****************************************************************
     * getterApellido: retorna el valor del apellido
     * @return apellido
    */
    public String getApellido(){
        return apellido;
    }
    //***************************************************************

    /****************************************************************
     * getterNumeroMascotas: retorna el valor del número de mascotas
     * @return numero_mascotas
    */
    public int getNumeroMascotas(){
        return numero_mascotas;
    }
    //***************************************************************

    /****************************************************************
     * getterMiembros: retorna el arreglo de personas
     * @return
    */
    public Persona[] getMiembros(){
        return miembros;
    }
    //***************************************************************

    /** 
     * setterNumeroMascotas: suma el número de mascotas que tiene la familia
    */
    public void setNumeroMascotas(){
        numero_mascotas++;
    }
    //***************************************************************
}
