package paquete2;

public class PasajeUniversitario extends PasajeUrbano {

    public PasajeUniversitario(double pasaje) {
        super(pasaje);
    }

    @Override
    public void establecerValorPasaje() {
        double desc = (valorFijo * 30)/100;
        valorPasaje = valorFijo - desc;
    }

    @Override
    public String toString() {
        return String.format("Tipo de pasaje: Universitario\n"
                + "%s",
                super.toString()
        );
    }
}
