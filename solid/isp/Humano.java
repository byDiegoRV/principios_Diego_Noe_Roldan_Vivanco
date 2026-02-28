package isp;

class Humano implements Trabajable, Comible {
    public void trabajar() {
        System.out.println("Humano trabajando");
    }

    public void comer() {
        System.out.println("Humano comiendo");
    }
}
