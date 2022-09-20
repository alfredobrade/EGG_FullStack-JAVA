
package primerapruebajdbc.persistencia;

import java.util.Collection;
import primerapruebajdbc.dominio.usuario.Usuario;


public final class UsuarioDAO extends DAO {
    
    public void guardarUsuario(Usuario user) throws Exception{
        
        try {
            if (user == null){
                throw new Exception("Debe indicar un usuario");
            }
            String sql = "INSERT INTO Usuario (correo_electronico, clave)"
                    +"VALUES ( '"+user.getCorreoElectronico()+" ' , '"
                    + user.getClave() +"' );";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void modificarUsuario(Usuario user){
        
    }
    
    public void eliminarUsuario(String correoElectronico){
        
    }
 
    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception{
        try {
            String sql = "sentencia sql";
            
            consultarBase(sql);
            Usuario user = null;
            
            
            while(resultado.next()){
                user = new Usuario();
                user.setId(resultado.getInt(1)); // columna 1 (empieza desde 1)
                user.setCorreoElectronico(resultado.getNString(2)); //columna 2
                user.setClave(resultado.getNString(3)); //columna 3
                
            }
            
            desconectarBase();
            return user;
            
        } catch (Exception e) {
            
            desconectarBase();
            throw e;
            
        }
        
        
    }
    
    /* metodo para cargar varios usuarios en una lista
    public Collection<Usuario> listarUsuarios() {
        
        
        
        
        return usuarios;
        
    }
    */
}
