package primerapruebajdbc.dominio.usuario;

import primerapruebajdbc.persistencia.UsuarioDAO;


public class Usuario_servicios {
    
    private UsuarioDAO dao;
    
    public Usuario_servicios(){
        this.dao = new UsuarioDAO();
    }
    
    public void crearUsuario(String correoElectronico, String clave) throws Exception {
        
        //agregar validaciones
        
            //creamos el usuario
            Usuario user = new Usuario();
            user.setCorreoElectronico(correoElectronico);
            user.setClave(clave);
            dao.guardarUsuario(user);
        
        
        
        
    }
    
    
    
    
    
}
