package fitness;

public class Card {
    private Abonement abonement;
    private Сlientele clientele;

    public Card (Abonement abonement, Сlientele clientele){
        setClientele(clientele);
        setAbonement(abonement);
    }

    //геттер клиента
    public Сlientele getClientele() {
        return clientele;
    }

    // сеттер клиента
    public void setClientele(Сlientele clientele) {
        if (clientele == null) throw new IllegalArgumentException("Клиент не может быть null");
        this.clientele = clientele;
    }

    // геттер абонемента
    public Abonement getAbonement() {
        return abonement;
    }

    // сеттер абонемента
    public void setAbonement(Abonement abonement) {
        if (abonement == null) throw new IllegalArgumentException("Абонемент не может быть null");
        this.abonement = abonement;
    }

    @Override
    public String toString() {
        return "Card{" +
                "abonement=" + abonement +
                ", clientele=" + clientele +
                '}';
    }
}
