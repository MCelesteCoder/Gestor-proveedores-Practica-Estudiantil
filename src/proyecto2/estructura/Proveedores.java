package proyecto2.estructura;

import javax.swing.JOptionPane;

public class Proveedores {

    private int id;
    private String descripcion;

    public static Proveedores[] almaProveedor = new Proveedores[100];
    private Juego[] juegosAr;
    
    private int capacidad;//Atributo para la capacidad actual de la pila
    private static int contador = 0;

    public Proveedores(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.juegosAr = new Juego[100]; // Inicializar el arreglo de juegos
        this.capacidad = 0; // Inicializar la capacidad en 0

    }

    //Metodos getter's y setter's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodo id generado de manera automatica
    public int idGenerado() {
        id++;
        return id;
    }

    //Metodo alamacenamiento de proveedores en arreglo de objetos
    public static void registroPro(Proveedores proveedor) {
        almaProveedor[contador] = proveedor;
        contador++;
    }

    public static Proveedores[] getArreglo() {
        return almaProveedor;
    }

    //metodo para agregar juegos a la pila
    public void agregarJuegos(Juego juegos) {

        if (capacidad < 100) {
            juegosAr[capacidad] = juegos;
            capacidad++;
            juegos.setProveedor(this);
        }
    }

    //Metodo para devolver el arreglo de objetos Juegos
    public Juego[] getJuegosAr() {
        return juegosAr;
    }

    //Metodo para eliminar el ultimo juego
    public void eliminarUltimoJuego() {
        if (capacidad > 0) {
            juegosAr[capacidad - 1] = null;
            capacidad--;
        }
    }

    //Metodo para eliminar el primer proveedor
    public void eliminarPrimerProveedor() {

        //Si la pila JuegosAr en la posicion 0 esta en null se elimina el pimer proveedor del arreglo de objetos en almaProveedor porque no tiene ningun juego registrado
        if (juegosAr[0] == null) {
            for (int i = 0; i < contador - 1; i++) {
                almaProveedor[i] = almaProveedor[i + 1];

            }
            almaProveedor[contador - 1] = null;
            contador--;
        } else {
            //Se indica si el primer proveedor no puede ser eliminado si posee juegos registrados
            JOptionPane.showMessageDialog(null, "No se puede eliminar el primer proveedor porque tiene juegos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
