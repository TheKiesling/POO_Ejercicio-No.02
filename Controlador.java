/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Controlador {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Controlador.java
    @version: 
        - Creación: 18/08/2021
        - Última modificación: 18/08/2021

    Clase que comunica el modelo con la vista y controla sus acciones
    */

    //---------------------------MÉTODOS-----------------------------

    public static void main(String[] args) {
        //Instancia de objetos
        Perro perro = new Perro();
        Perrera perrera = new Perrera();
        Vista vista = new Vista();
        Persona persona;
        Persona[] miembros;

        //Saludar al usuario
        vista.bienvenida();

        int opcion = -1;
        while (opcion != 4){
            //Despliegue de las opciones del menú y su previa lectura de dicha opción
            opcion = vista.menuOpciones();

            //Registrar Familia
            if (opcion == 1){
                //Solicitar datos generales de la familia
                String apellido = vista.pedirApellido();
                int numero_miembros = vista.pedirNumeroMiembros();
                miembros = new Persona[numero_miembros];

                //Solicitar datos específicos de cada miembro de la familia
                for (int i = 0; i < numero_miembros; i++){
                    String nombre = vista.pedirNombre();
                    int edad = vista.pedirEdad();
    
                    persona = new Persona(edad, nombre);
                    miembros[i] = persona;
                }

                //Despliegue de mensaje indicando si se pudo registrar o no
                if(perrera.agregarFamilia(apellido, miembros))
                    vista.familiaCreada();
                else
                    vista.limiteFamilias();
            }

            //Recibir perro
            if (opcion == 2){
                //Solicitar los datos del perro ingresado 
                String nombre_perro = vista.pedirNombrePerro();
                String tamano = vista.pedirTamano();
                String raza = vista.pedirRaza();
                String edad = vista.pedirEdadPerro();
                String estado_salud = vista.pedirEstadoSalud();
                String color = vista.pedirColor();

                //Instanciar el perro
                perro = new Perro(tamano, raza, edad, estado_salud, color, nombre_perro);
            }

            //Asignar el perro a una familia
            if (opcion == 3){
                //Verificar si se puede asignar el perro
                boolean asignacion = perrera.asignarMascota(perro);

                //Despliegue de mensaje producto de la anterior verificación (en caso de que sí, se indica la familia a la cual se dirigue el perro)
                if(asignacion){
                    vista.perroAsignado();
                    String familia_asignada = perrera.getFamiliaAsignada();
                    vista.familiaAsignada(familia_asignada);
                }
                else
                    vista.perroNoAsignado();
            }

            //Salir
            if (opcion == 4)
                vista.despedida();
        }    
    }
}
