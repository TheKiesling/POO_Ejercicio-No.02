/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.util.Scanner;

public class Vista {
   /**
     @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 18/08/2021
        - Última modificación: 18/08/2021

    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
     */ 

    //---------------------------PROPIEDADES-------------------------
    private Scanner scan;

    //---------------------------MÉTODOS-----------------------------

    /****************************************************************
     * Constructor: Instancia el scanner
     */
    public Vista(){
        scan = new Scanner(System.in);
    }
    //****************************************************************

    //---------------------------MENÚ--------------------------------
    /*****************************************************************
     * bienvenida: Imprime un mensaje de bienvenida
     */
    public void bienvenida(){
        System.out.println("\n\nBienvenido al sistema Hogares Temporales para Canes (HTC) ¿Que hara?");
    }
    //****************************************************************
    
    /*****************************************************************
     * menuOpciones: Despliega el menú y recibe la opción del usuario
     * @return opcion
     */
    public int menuOpciones(){
        System.out.println("\n\n1. Ingresar familia");
		System.out.println("2. Recibir perro");
		System.out.println("3. Asignar perro a familia");
		System.out.println("4. Salir\n\n");

        int opcion = Integer.parseInt(scan.nextLine());
        System.out.println("\n");
        return opcion;
    }
    //****************************************************************

    /*****************************************************************
     * despedida: Imprime un mensaje de despedida
     */
    public void despedida(){
        System.out.println("\n\nGracias por haber probado el programa, tenga un feliz día");
        scan.close();
    }
    //****************************************************************

    /*****************************************************************
     * pedirApellido: pide el apellido de la familia
     * @return apellido
     */
    public String pedirApellido(){
        System.out.println("Ingrese el apellido de su familia");
        String apellido = scan.nextLine();
        return apellido;
    }
    //****************************************************************

    /*****************************************************************
     * pedirNombre: pide el nombre de un miembro de la familia
     * @return nombre
     */
    public String pedirNombre(){
        System.out.println("Ingrese el nombre de un miembro de su familia");
        String nombre = scan.nextLine();
        return nombre;
    }
    //****************************************************************

    /*****************************************************************
     * pedirEdad: pide la edad del miembro de la familia que acaban de ingresar
     * @return
     */
    public int pedirEdad(){
        System.out.println("Ingrese la edad de ese miembro de la familia");
        int edad = Integer.parseInt(scan.nextLine());
        return edad;
    }
    //****************************************************************

    /*****************************************************************
     * pedirNumeroMiembros: pregunta al usuario el número de miembros en su familia
     * @return
     */
    public int pedirNumeroMiembros(){
        System.out.println("Ingrese el número de miembros que tiene su familia");
        int numero_miembros = Integer.parseInt(scan.nextLine());
        return numero_miembros;
    }
    //****************************************************************

    /*****************************************************************
     * pedirNombrePerro: lee el nombre del perro a registrar
     * @return nombre
     */
    public String pedirNombrePerro(){
        System.out.println("Ingrese el nombre del perro");
        String nombre = scan.nextLine();
        return nombre;

    }
    //****************************************************************

    /*****************************************************************
     * pedirTamano: lee el tamano del perro a registrar 
     * @return tamano
     */
    public String pedirTamano(){
        System.out.println("Ingrese el tamaño del perro (pequeno, mediano o grande)");
        String tamano = scan.nextLine();
        return tamano;
    }
    //****************************************************************

    /*****************************************************************
     * pedirRaza: lee la raza del perro a registrar 
     * @return raza
     */
    public String pedirRaza(){
        System.out.println("Ingrese la raza del perro. Por favor ingrese este dato con inicial mayúscula");
        String raza = scan.nextLine();
        return raza;
    }
    //****************************************************************

    /*****************************************************************
     * pedirEdadPerro: lee la edad del perro a registrar
     * @return edad
     */
    public String pedirEdadPerro(){
        System.out.println("Ingrese la edad del perro");
        String edad = scan.nextLine();
        return edad;
    }
    //****************************************************************

    /*****************************************************************
     * pedirEstadoSalud: lee el estado de salud del perro a registrar
     * @return estado_salud
     */
    public String pedirEstadoSalud(){
        System.out.println("Ingrese el porcentaje de salud del perro (con %)");
        String estado_salud = scan.nextLine();
        return estado_salud;
    }
    //****************************************************************

    /*****************************************************************
     * pedirColor: lee el color del perro a registrar
     * @return color
     */
    public String pedirColor(){
        System.out.println("Ingrese el color del perro");
        String color = scan.nextLine();
        return color;
    }
    //****************************************************************

    /*****************************************************************
     * perroAsignado: salida de un mensaje que indica que al perro se le puso asignar una familia
     */
    public void perroAsignado(){
        System.out.println("El perro tiene una familia. Es feliz guau guau");
    }
    //****************************************************************

    /*****************************************************************
     * perroNoAsignado: salida de un mensaje que indica que al perro no se le pudo asignar una familia
     */
    public void perroNoAsignado(){
        System.out.println("Al perro no se le pudo asignar una familia");
    }
    //****************************************************************

    /*****************************************************************
     * familiaCreada: salida de un mensaje que indica si se pudo crear la familia
     */
    public void familiaCreada(){
        System.out.println("Familia creada con éxito");
    }
    //****************************************************************

    /*****************************************************************
     * limiteFamilias: salida de mensaje que indica que no se pudo crear la familia porque ya no hay cupo
     */
    public void limiteFamilias(){
        System.out.println("La familia no pudo ser registrada porque ya no hay cupo (El límite de familias es 15)");
    }
    //****************************************************************

    /*****************************************************************
     * familiaAsignada: indica a través de un mensaje la familia a la cual fue asignada el perro (de haberlo sido)
     * @param familia
     */
    public void familiaAsignada(String familia){
        System.out.println("El perro ha sido asignado a la familia: " + familia);
    }
    //***************************************************************
}
