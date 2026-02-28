package srp;

public class MainSRP {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Noe", "droldanvivanco@gmail.com");
        UsuarioRepository repo = new UsuarioRepository();
        EmailService email = new EmailService();

        repo.guardar(usuario);
        email.enviarBienvenida(usuario);
    }
}