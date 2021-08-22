/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Persona implements Comparable<Persona>{
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Persona.java
    @version: 
        - Creación: 17/08/2021
        - Última modificación: 20/08/2021

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
    public Persona(int edad, String nombre){
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

    /*****************************************************************
     * getterNombre: retorna el valor del nombre
     * @return edad
    */
    public String getNombre(){
        return this.nombre;
    }
    //****************************************************************

    /*****************************************************************
     * compareTo: Compara la edad de las personas para su uso posterior en el sort del vector de Personas
     * @return entero que indica la posición en el sort
    */
    public int compareTo(Persona p){
        int edad_comparar = p.getEdad();
        String nombre_comparar = p.getNombre();

        //Comparación y retorno de la posición
        if (this.edad != edad_comparar)
            return this.edad - edad_comparar;
        return this.nombre.compareTo(nombre_comparar);
    }
    //****************************************************************
}
