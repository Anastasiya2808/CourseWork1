package fitness;

import java.time.LocalDate;

public class Card {
    private Abonement abonement;
    private Сlientele clientele;
    private LocalDate startDate;
    private LocalDate endDate;

    public Card(Abonement abonement, Сlientele clientele) {
        startDate = LocalDate.now();
        this.abonement = abonement;
        setClientele(clientele);
        if (abonement == Abonement.ONE){
            endDate = LocalDate.now().plusDays(1);
        } else
            endDate = LocalDate.now().plusDays(180);
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

    // геттер для даты регистрации
    public LocalDate getStartDate() {
        return startDate;
    }

    // cеттер для даты регистрации
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    // геттер для даты истечения срока абонемента
    public LocalDate getEndDate() {
        return endDate;
    }

    // сеттер для даты истечения срока абонемента
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
