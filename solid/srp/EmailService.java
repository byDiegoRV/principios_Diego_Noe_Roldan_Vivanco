package srp;

class EmailService {
    public void enviarBienvenida(Usuario usuario) {
        System.out.println("Email enviado a " + usuario.getEmail());
    }
}