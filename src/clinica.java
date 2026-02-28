import java.sql.SQLOutput;

public class clinica {


    //atributos//

    private String NomMascota;
    private String Especie;
    private  double Peso;
    private double Edad;
    private boolean Vacuna;


    //constructor


    public clinica(String nomMascota, String especie, double peso, double edad, boolean vacuna) {
        this.NomMascota = nomMascota;
        this.Especie = especie;
        this.Peso = peso;
        this.Edad = edad;
        this.Vacuna = false;
    }


    // getter setter


    public String getNomMascota() {
        return NomMascota;
    }

    public void setNomMascota(String nomMascota) {
        NomMascota = nomMascota;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getEdad() {
        return Edad;
    }

    public void setEdad(double edad) {
        Edad = edad;
    }

    public boolean isVacuna() {
        return Vacuna;
    }

    public void setVacuna(boolean vacuna) {
        Vacuna = false;
    }


    // to string


    @Override
    public String toString() {
        return "clinica{" +
                "NomMascota='" + NomMascota + '\'' +
                ", Especie='" + Especie + '\'' +
                ", Peso=" + Peso +
                ", Edad=" + Edad +
                ", Vacuna=" + Vacuna +
                '}';
    }





    //////////////////////////////////////////////////////////////






    public void Vacuna(){
        if(!Vacuna) {
            Vacuna = true;
            System.out.println("la mascota fue vacunada");
        }
        else {
            System.out.println("ya esta vacunado");
        }
    }


    public void alimentar (double cantidad){
        if (cantidad >0){
            Peso += cantidad;
            System.out.println("ha sido alimentado");
        }else {
            System.out.println("no se permiten cantidades negativas");
        }
    }

    public void cumplirannos(){
        Edad++;
        System.out.println("la mascota acaba de cumplir" + Edad + "años");
    }

    public void mostraInf (){
        System.out.println("inf mascota");
        System.out.println("nombre: " + NomMascota);
        System.out.println("especie: " + Especie);
        System.out.println("edad: " + Edad);
        System.out.println("peso: " + Peso + "KG");
        System.out.println("vacuna "+ Vacuna);

    }


}
