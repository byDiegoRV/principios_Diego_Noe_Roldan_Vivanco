public class SistemaAlertas {

    public static void main(String[] args) {

        Envia email = new EmailNotificacion( "Bienvenido!","user@mail.com");

        Envia sms = new SMSNotificacion(  "Tu código es 1234", "+525512345678");

        email.enviar();
        sms.enviar();
    }
}
