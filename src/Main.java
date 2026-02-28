import java.util.*;


void main() {

Scanner teclado = new Scanner(System.in);


clinica mascota =new clinica ("Tito", "Perro", 3, 3);



int op;
do {
    System.out.println(" Bienvenido");
    System.out.println("1. Crear objeto");
    System.out.println("2. mostrar toda la informacion");
    System.out.println("3. buscar por nombre");

    System.out.println("2. alimentar mascota");
    System.out.println("3. vacunar");
    System.out.println("4. cumpleaños");
    System.out.println("5. mostrar informacion final mascota");
    op = teclado.nextInt();


    switch (op){
        case 1:
            System.out.println("mostrando inf mascota");
            System.out.println("ingrese nombre de la mascota");
            String NomMascota = teclado.next();
            System.out.println("ingrese especie");
            String Especie = teclado.next();
            System.out.println("ingrese peso de la mascota");
            double Peso = teclado.nextInt();
            System.out.println("ingrese edad de la mascota");
            double Edad = teclado.nextInt();
            System.out.println("su mascota esta vacunada?");
            String Vacuna = teclado.nextBoolean();
            break;
        case 2:

            break;


    }while (op!=4)
}




}
