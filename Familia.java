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
    private Persona[] miembros;
    private int numero_mascotas;

    //---------------------------MÉTODOS-----------------------------
    public Familia(String apellido, Persona[] miembros, int numero_mascotas, Persona persona){
        this.apellido = apellido;
        this.miembros = miembros;
        this.numero_mascotas = numero_mascotas;
        miembros = new Persona[10];
    }

    public boolean asignarMascota(Perro perro){
        boolean bandera = false;

        for (int i = 0; i < 15; i++){
            if(verificarMascota(perro, miembros[i].getEdad()));{
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    private boolean verificarMascota(Perro perro, int edad){
        String raza = perro.getRaza();
        String tamaño = perro.getTamaño();

        //Si hay un niño pequeño, y se le asigna un perro con tamaño pequeño y no es raza peligrosa
        if (edad < 10 && tamaño == "pequeno" && verificarRaza(raza))
            return true;
        
        //Si hay un niño grande y se le asigna un perro con tamaño pequeño o mediano y no es raza peligrosa
        else if (18 > edad && edad > 10 && (tamaño == "pequeno" || tamaño == "mediano") && verificarRaza(raza))
            return true;

        //Si no hay niños 
        else if (edad > 18)
            return true;

        //Si no cumplen las condiciones no pueden tener al perro
        else
            return false;
    }

    private boolean verificarRaza(String raza){
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

        for (int i = 0; i < razas_peligrosas.length; i++){
            if (raza.equals(razas_peligrosas[i])){
                bandera = false;
                break;
            }
        }

        return bandera;
    }
}
