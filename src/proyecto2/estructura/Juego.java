package proyecto2.estructura;

public class Juego {

    private String dni;
    private String nombre;
    private String catInteraccion;
    private String catAccesorios;
    private String mecanica;
    private String numParticipantes;
    private int edadMin;
    private Proveedores proveedor;// se referencia al proveedor del juego

    //Se crea el constructor de la clase Juego
    public Juego(String dni, String nombre, String catInteraccion, String catAccesorios, String mecanica, String numParticipantes, int edadMin) {
        this.dni = dni;
        this.nombre = nombre;
        this.catInteraccion = catInteraccion;
        this.catAccesorios = catAccesorios;
        this.mecanica = mecanica;
        this.numParticipantes = numParticipantes;
        this.edadMin = edadMin;
    }

    //Metodos getter's y setter's correspondientes
    
     public Proveedores getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCatInteraccion() {
        return catInteraccion;
    }

    public void setCatInteraccion(String catInteraccion) {
        this.catInteraccion = catInteraccion;
    }

    public String getCatAccesorios() {
        return catAccesorios;
    }

    public void setCatAccesorios(String catAccesorios) {
        this.catAccesorios = catAccesorios;
    }

    public String getMecanica() {
        return mecanica;
    }

    public void setMecanica(String mecanica) {
        this.mecanica = mecanica;
    }

    public String getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(String numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }
}
