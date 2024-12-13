public class Profesor extends ComunidadEPN {

    String materias_dictadas;
    String facultad;
    String tipo_contrato;

    public Profesor() {
    }


    public Profesor(String cedula, String nombre, int edad, String direccion, String telefono, String correo, String materias_dictadas, String facultad, String tipo_contrato) {
        super(cedula, nombre, edad, direccion, telefono, correo);
        this.materias_dictadas = materias_dictadas;
        this.facultad = facultad;
        this.tipo_contrato = tipo_contrato;
    }

    public String getMaterias_dictadas() {
        return materias_dictadas;
    }

    public void setMaterias_dictadas(String materias_dictadas) {
        this.materias_dictadas = materias_dictadas;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Materias dictadas: " + this.materias_dictadas);
        System.out.println("Facultad: " + this.facultad);
        System.out.println("Tipo de contrato: " + this.tipo_contrato);
    }
}
