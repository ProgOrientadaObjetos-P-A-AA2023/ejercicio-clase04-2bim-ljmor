package paquete2;

public class PasajeTerceraEdad extends PasajeUrbano {

    public PasajeTerceraEdad(double pasaje) {
        super(pasaje);
    }

    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo/2;
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Tercera Edad\n"
                + "%s",
                super.toString()
        );
    }
}
