/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.util.Arrays;

public class Perrera {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Perrera.java
    @version: 
        - Creación: 18/08/2021
        - Última modificación: 20/08/2021

    Clase que gestiona el registro de familias, perros y su asignación de perros
    */

    //---------------------------PROPIEDADES-------------------------
    //Arreglos
    private Familia[] familias = new Familia[15];
    private Persona[] miembros;

    //Instancia de objetos familia y persona
    private Familia familia;
    private Persona persona;
    
    private int numero_familias = 2;
    private String familia_asignada;
    

    /*****************************************************************
     * Constructor: instancia 3 familias de ejemplo en el sistema en la posición 0,1 y 2 del arreglo de familia.
    */
    public Perrera(){
        //1era Familia
        miembros = new Persona[2];
        persona = new Persona(19, "Jose"); miembros[0] = persona;
        persona = new Persona(45, "Karla"); miembros[1] = persona;
        Arrays.sort(miembros);
        familia = new Familia("Kiesling", miembros); familias[0] = familia;

        //2da Familia
        miembros = new Persona[2];
        persona = new Persona(16, "Federico"); miembros[0] = persona;
        persona = new Persona(28, "Guillermo"); miembros[1] = persona;
        Arrays.sort(miembros);
        familia = new Familia("Lange", miembros); familias[1] = familia;

        //3ra Familia
        miembros = new Persona[3];
        persona = new Persona(35, "Ervin"); miembros[0] = persona;
        persona = new Persona(15, "Kenneth"); miembros[1] = persona;
        persona = new Persona(9, "Juan"); miembros[2] = persona;
        Arrays.sort(miembros);
        familia = new Familia("Alvarado", miembros); familias[2] = familia;
    }
    //****************************************************************

    /*****************************************************************
     * agregarFamilia: agrega al arreglo de familias una nueva familia con sus datos (apellido y miembros) siempre y cuando no hayan 15 familias
     * @param apellido
     * @param miembros
     * @return boolean
    */
    public boolean agregarFamilia(String apellido, Persona[] miembros){
        if (numero_familias < 14){
            //Instancia la familia y la agrega al arreglo de Familias en la posición que le corresponde 
            familia = new Familia(apellido, miembros);
            numero_familias++;
            familias[numero_familias] = familia;
            return true;
        }
        else return false;
    }
    //****************************************************************

    /*****************************************************************
     * asignarMascota: indica si se pudo asignar la nueva mascota en alguna familia
     * @param perro
     * @return bandera
    */
    public boolean asignarMascota(Perro perro){
        boolean bandera = false;
        Persona[] miembros_familia;
        familia_asignada = "";

        while (!bandera){
            //Recorrer todo el arreglo de Familia
            for (int i = 0; i <= numero_familias; i++){
                //Obtener los miembros de la familia actual 
                miembros_familia = familias[i].getMiembros();

                //Recorrer cada miembro del arreglo de Persona
                for (int j = 0; j < miembros_familia.length; j++){ 
                    //Obtener edad del miembro
                    int edad = miembros_familia[j].getEdad();

                    //Verificar si el miembro al que se analiza puede tener la mascota y si esa familia puede tener perro
                    if(verificarMascota(perro, edad)){
                        if (familias[i].getNumeroMascotas() < 4){
                            bandera = true;
                            familias[i].setNumeroMascotas();
                            familia_asignada = familias[i].getApellido();
                            j = miembros_familia.length;
                            i = familias.length;
                        }
                    }
                    else{
                        j = miembros_familia.length;
                    }
                }
            }
            break;
        }
        return bandera;
    }
    //****************************************************************

    /*****************************************************************
     * verificarMascota: verifica si la mascota es apta para la familia evaluada
     * @param perro
     * @param edad
     * @return bandera
    */
    private boolean verificarMascota(Perro perro, int edad){
        //Propiedades del perro a evaluar
        String raza = perro.getRaza();
        String tamano = perro.getTamano();

        boolean bandera = false;

        //Si hay un niño pequeño, y se le asigna un perro con tamaño pequeño y no es raza peligrosa
        if (edad < 10 && tamano.equals("pequeno") && verificarRaza(raza))
            bandera = true;
        
        //Si hay un niño grande y se le asigna un perro con tamaño pequeño o mediano y no es raza peligrosa
        else if (18 > edad && edad > 10 && (tamano.equals("pequeno") || tamano.equals("mediano")) && verificarRaza(raza))
            bandera = true;

        //Si no hay niños 
        else if (edad > 18)
            bandera = true;

        //Si la familia no es apta
        else
            bandera = false;

        return bandera;
    }
    //****************************************************************

    /*****************************************************************
     * verificarRaza: verifica si la raza del perro no es peligrosa
     * @param raza
     * @return bandera
    */
    private boolean verificarRaza(String raza){
        //Arreglo de Strings con las razas peligrosas
        String[] razas_peligrosas = {
            "Pit bull terrier", 
            "American Staffordshire terrier", 
            "Tosa Inu",
            "Dogo argentino",
            "Dogo Guatemalteco",
            "Fila brasileño",
            "Presa canario",
            "Doberman",
            "Gran perro japones", 
            "Mastin napolitano",
            "Presa Mallorqui",
            "Dogo de burdeos",
            "Bullmastiff",
            "Bull terrier inglés",
            "Bulldog americano",
            "Rhodesiano",
            "Rottweiler"
        };

        boolean bandera = true;

        //Ciclo que recorre todos los elementos del arreglo hasta que encuentra uno y termina el ciclo.
        for (int i = 0; i < razas_peligrosas.length; i++){
            if (raza.equals(razas_peligrosas[i])){
                bandera = false;
                break;
            }
        }

        return bandera;
    }
    //****************************************************************

    /*****************************************************************
     * getterFamiliaAsignada: retorna el valor de la familia a la cual se le asignó el perro.
     * @return familia_asignada
    */
    public String getFamiliaAsignada (){
        return familia_asignada;
    }
    ////***************************************************************
}
