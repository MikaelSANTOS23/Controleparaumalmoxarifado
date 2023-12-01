
package Classes;

public class Dados {
    public boolean ValidarUsuario(String usuário, String senha){
       if(usuário.equals("usuario2023")&& senha.equals("2023")){
          return true;
       }else{
           return false;
       }
    }
}
