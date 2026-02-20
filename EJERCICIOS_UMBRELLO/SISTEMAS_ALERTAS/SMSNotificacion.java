
public class SMSNotificacion extends Notificacion implements Envia {

    private static final double COSTO = 0.10;

    public SMSNotificacion(String mensaje, String destinatario) {
        super(mensaje, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al número " + destinatario +
                " [Costo: $" + String.format("%.2f", COSTO) + "]");
        registrarLog();
    }
}