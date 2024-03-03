package xd;

public class Usuario {
    private static Usuario usuario;
    private String nombre;
    private String identificacion;
    private String email;
    private Conexion conexion;

    public Usuario (String nombre, String identificacion, String email, Conexion conexion){
        
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.conexion = conexion;

    
    }


    public Conexion getConexion(){
        return this.conexion;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }


    public void Identificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    public void Email(String email) {
        this.email = email;
    }


    public void Conexion(Conexion conexion) {
        this.conexion = conexion;
    }


    public String getNombre(){
        return this.nombre;
    }

    public String getIdentificacion (){
        return this.identificacion;
    }

    public String getEmail (){
        return this.email;
}
public static UsuarioBuilder builder(){
    return new UsuarioBuilder();
}
public static class UsuarioBuilder {
    private String nombre;
    private String identificacion;
    private String email;
    private Conexion conexion;
    
private UsuarioBuilder(){}
        
    public UsuarioBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder identificacion (String identificacion){
        this.identificacion = identificacion;
        return this;
    }
    public UsuarioBuilder email (String email){
        this.email = email;
        return this;
  }
    public UsuarioBuilder conexion (Conexion conexion){
            this.conexion = conexion;
            return this;
}
public Usuario build() {
    if (conexion == null) {
        throw new IllegalArgumentException("No existe conexion");
    }

    if (usuario == null) {
        usuario = new Usuario (nombre, identificacion, email, conexion);
    }

    return usuario;
}
}
}