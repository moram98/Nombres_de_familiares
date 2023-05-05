import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre1;
        System.out.println("ingrese nombre 1 : ");
        nombre1 = sc.nextLine();
        String nombres=  nombre1.toUpperCase().charAt(1) + "."
                + nombre1.substring(nombre1.length()-2);

        String nombre2;
        System.out.println("ingrese nombre 2 : ");
        nombre2 = sc.nextLine();
        String nombres2 =  nombre2.toUpperCase().charAt(1) + "."
                + nombre2.substring(nombre2.length()-2);

        String nombre3;
        System.out.println("ingrese nombre 3 : ");
        nombre3 = sc.nextLine();
        String nombres3 =  nombre3.toUpperCase().charAt(1) + "."
                + nombre3.substring(nombre3.length()-2);

        System.out.println("Nuevos nombres: " + nombres + "_" + nombres2 + "_" + nombres3);
    }
}
