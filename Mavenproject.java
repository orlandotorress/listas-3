import java.util.ArrayList;
import java.util.Scanner;

public class Mavenproject {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> personas = new ArrayList<>(); 
        int opcion;

        do {
           
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Listar personas");
            System.out.println("4. Buscar persona");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 
            switch (opcion) {
                case 1:
                    
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = entrada.nextLine();
                    personas.add(nombre);
                    System.out.println("Persona agregada. Lista actual: " + personas);
                    break;

                case 2:
                    
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas en la lista para eliminar.");
                    } else {
                        System.out.println("Lista de personas:");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println(i + ". " + personas.get(i));
                        }
                        System.out.print("Seleccione el índice de la persona a eliminar: ");
                        int indice = entrada.nextInt();
                        entrada.nextLine();
                        if (indice >= 0 && indice < personas.size()) {
                            personas.remove(indice);
                            System.out.println("Persona eliminada. Lista actual: " + personas);
                        } else {
                            System.out.println("Índice no válido.");
                        }
                    }
                    break;

                case 3:
                    
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas en la lista.");
                    } else {
                        System.out.println("Lista de personas:");
                        for (String persona : personas) {
                            System.out.println(persona);
                        }
                    }
                    break;

                case 4:
                    
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas en la lista para buscar.");
                    } else {
                        System.out.print("Ingrese el nombre de la persona a buscar: ");
                        String nombreABuscar = entrada.nextLine();
                        if (personas.contains(nombreABuscar)) {
                            System.out.println("La persona '" + nombreABuscar + "' fue encontrada.");
                        } else {
                            System.out.println("La persona '" + nombreABuscar + "' no fue encontrada.");
                        }
                    }
                    break;

                case 0:
                    
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        
        
        
    }
}
