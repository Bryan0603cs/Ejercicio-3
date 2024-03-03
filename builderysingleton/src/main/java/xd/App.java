package xd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Conexion conexion1 = Conexion.builder().user("xd").contrasena("12").host("512548855").puerto( (int) 10).build();
    Usuario usuario1= new Usuario("2", "Bryan","xd", conexion1);
    System.out.println(usuario1.getIdentificacion()+usuario1.getConexion().getusuario());
    }
}
