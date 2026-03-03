import java.util.*;


void main() {

    List<clinica> lstClinica = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);


    int op;
    do {
        System.out.println(" Bienvenido");
        System.out.println("1. Crear objeto");
        System.out.println("2. mostrar toda la informacion");
        System.out.println("3. buscar por nombre");

        op = teclado.nextInt();


        switch (op) {
            case 1:
                System.out.println("añadir una nueva mascota");

                System.out.println("ingrese nombre de la mascota");
                String NomMascota = teclado.next();

                System.out.println("ingrese especie");
                String Especie = teclado.next();

                System.out.println("ingrese peso de la mascota");
                double Peso = teclado.nextInt();

                System.out.println("ingrese edad de la mascota");
                double Edad = teclado.nextInt();

                System.out.println("su mascota esta vacunada?");
                boolean Vacuna = teclado.nextBoolean();

                clinica M1 = new clinica(NomMascota, Especie, Peso, Edad, Vacuna);
                lstClinica.add(M1);

                System.out.println("se agrego mascota");
                break;
            case 2:
                System.out.println(lstClinica);

                for (clinica m : lstClinica) {
                    System.out.println(m.getNomMascota());
                }
                break;
            case 3:
                String NomBusca;
                System.out.println("buscar objeto");
                System.out.println("ingrese el nombre a buscar");
                NomBusca = teclado.next();

                clinica prod1 = null;

                for (clinica m : lstClinica) {
                    if (m.getNomMascota().equalsIgnoreCase(NomBusca)){
                        prod1 = m;
                    }
                }
                System.out.println(prod1.toString());
                int submenu;
                do{
                    System.out.println("""
                            selecciones la actividad a realizar
                            1. alimenta a tu theriam
                            2. vacuna a tu therian
                            3. el therian a cumplidoo años( ˘︹˘ )
                            """);
                    submenu = teclado.nextInt();
                    switch (submenu){
                        case 1:
                            System.out.println("se alimento al therian");
                            double cantidad = teclado.nextDouble();
                            break;
                        case 2:
                            prod1.Vacuna();
                            System.out.println("se vacuna al therian");
                            break;
                        case 3:
                            prod1.cumplirannos();
                            System.out.println("su therian cumplio años");
                            break;
                        case 4:
                            System.out.println("aregresar");
                        default:
                            System.out.println("opcion no valida");
                    }
                }
                break;
                clinica prod1 = null;


        }
    }
}