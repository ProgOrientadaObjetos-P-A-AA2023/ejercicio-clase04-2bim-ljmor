package paquete2;

public class PasajeNormal extends PasajeUrbano {

    public PasajeNormal(double pasaje) {
        super(pasaje);
    }

    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo;
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Normal\n"
                + "%s",
                super.toString()
        );
    }
}
