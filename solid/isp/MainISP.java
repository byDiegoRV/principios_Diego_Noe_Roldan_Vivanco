package isp;

public class MainISP {
    public static void main(String[] args) {
        Trabajable humano = new Humano();
        Trabajable robot = new Robot();

        humano.trabajar();
        robot.trabajar();
    }
}