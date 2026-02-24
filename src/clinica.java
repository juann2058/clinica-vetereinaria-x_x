public class clinica {


    //atributos//

    private String NomMascota;
    private String Especie;
    private  double Peso;
    private double Edad;
    private boolean Vacuna;


    //constructor


    public clinica(String nomMascota, String especie, double peso, double edad, boolean vacuna) {
        NomMascota = nomMascota;
        Especie = especie;
        Peso = peso;
        Edad = edad;
        Vacuna = false;
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
}
