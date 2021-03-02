package usuario;

public class Usuario {

    String usuario, senha;
    int nivelAcesso;

    public Usuario(String usuario, String senha, int nivelacesso) {
        setUsuario(usuario);
        setSenha(senha);
        setNivelAcesso(nivelAcesso);
    }

    public void setUsuario(String addUsuario) {
        if (!addUsuario.isEmpty()) {
            usuario = addUsuario;
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(String addSenha) {
        if (!addSenha.isEmpty()) {
            senha = addSenha;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setNivelAcesso(int addNielAcesso) {
        if (addNielAcesso > 0) {
            nivelAcesso = addNielAcesso;
        }
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }
//Valida os dados cadatrados
    public boolean validar() {
        if (getUsuario().length() <= 8) {
            if (getSenha().length() > 7 && getSenha().length() < 17) {
                return true;
            }
        }
        return false;
    }
}
