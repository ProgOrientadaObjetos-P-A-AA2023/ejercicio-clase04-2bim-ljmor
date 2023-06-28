package paquete2;

public class PasajeMenorEdad extends PasajeUrbano {

    public PasajeMenorEdad(double pasaje) {
        super(pasaje);
    }

    @Override
    public void establecerValorPasaje() {
        double desc = (valorFijo * 20) / 100;
        valorPasaje = valorFijo - desc;
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Menor de edad\n"
                + "%s",
                super.toString()
        );
    }
}
