
package usuario;


public class AppUsuario {
    public static void main(String[] args){
        Usuario user1 = new Usuario("willder1", "willder9758456747", 2);
        boolean validador;
        validador = user1.validar();
        if(validador==true){
            System.out.println("Usuario cadastrado com sucesso!");
        }else{
            System.out.println("Usuario ou senha invalidos");
        }
    }
    
}
