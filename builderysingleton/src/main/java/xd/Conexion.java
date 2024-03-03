package xd;

public class Conexion {
    private static Conexion conexion;

    private String usuario;
    private String contrasena;
    private String host;
    private String codificacion;
    private int tiempoDeEspera;
    private Boolean SSL;
    private int puerto;
    private String nombre;
    private String reintentos;


    private Conexion (String usuario, String contrasena, String host, String codificacion,int tiempoDeEspera,int puerto,Boolean SSL, String nombre,String reintentos){

        this.usuario= usuario;
        this.contrasena = contrasena;
        this.SSL = SSL;
        this.codificacion = codificacion;
        this.host = host;
        this.tiempoDeEspera = tiempoDeEspera;
        this.puerto = puerto;
        this.nombre = nombre;
        this.reintentos= reintentos;
    }

    public Conexion getconexion(String usuario, String contrasena, String host, String codificacion,  int tiempoDeEspera,int puerto, Boolean SSL,String nombre, String reintentos){
        if (conexion == null){
            throw new IllegalStateException("La conexion no existe");
        }
        return conexion;
    }

    public String getusuario (){
        return this.usuario;
    }

    public String getcontrasena (){
        return this.contrasena;
    }


    public Boolean getSSL (){
        return this.SSL;
    }

    public void Reintentos(String reintentos) {
        this.reintentos = reintentos;
    }

    public String getReintentos() {
        return reintentos;
    }

    public String getHost(){
        return this.host;
    }
    public int getTiempoEspera (){
        return this.tiempoDeEspera;
    }

    public int getPuerto (){
        return this.puerto;
    }

    public void Puerto (int puerto){
        this.puerto = puerto;
    }

    public String getNombre (){
        return this.nombre;
    }


    public String getCodificacion (){
        return this.codificacion;
    }
    public void usuario(String usuario){
        this.usuario = usuario;
    }
    public void CodificacionDeCaracteres(String codificacion){
        this.codificacion = codificacion;
    }
    
    public void Nombre (String nombre){
        this.nombre = nombre;
    }
    
    public void SSL (Boolean SSL){
        this.SSL = SSL;
    }
    public void contrasena (String contrasena){
        this.contrasena = contrasena;
    }
    public void Host (String host){
        this.host = host;
    }
    public void TiempoEspera (int tiempoDeEspera){
        this.tiempoDeEspera = tiempoDeEspera;
    }

    public static ConexionBuilder builder(){
        return new ConexionBuilder();
    }
    public static class ConexionBuilder {
        private String usuario;
        private String contrasena;
        private String host;
        private String codificacion;
        private int tiempoDeEspera;
        private Boolean SSL;
        private int puerto;
        private String nombre;
        private String reintentos;

    private ConexionBuilder(){}
        
    public ConexionBuilder user(String usuario){
        this.usuario= usuario;
        return this;
    }

    public ConexionBuilder contrasena (String contrasena){
        this.contrasena = contrasena;
        return this;
    }

    public ConexionBuilder reintentos (String reintentos){
        this.reintentos = reintentos;
        return this;
    }
    public ConexionBuilder host (String host){
        this.host = host;
        return this;
    }

    public ConexionBuilder tiempoDeEspera (int tiempoDeEspera){
        this.tiempoDeEspera = tiempoDeEspera;
        return this;
    }

    public ConexionBuilder puerto (int puerto){
        this.puerto = puerto;
        return this;
    }

    public ConexionBuilder nombre (String nombre){
        this.nombre = nombre;
        return this;
    }

    public ConexionBuilder codificacion(String codificacion){
        this.codificacion = codificacion;
        return this;
    }

    public ConexionBuilder SSL (Boolean SSL){
        this.SSL = SSL;
        return this;
    }

    public Conexion build() {
        if (usuario == null || contrasena == null || host == null) {
            throw new IllegalArgumentException("Debe ingresar usuario, contraseña y host");
        }

        if (conexion == null) {
            conexion = new Conexion (usuario,  contrasena,  host, codificacion, tiempoDeEspera, puerto,SSL,nombre,reintentos);
        }

        return conexion;
    }
}
}

