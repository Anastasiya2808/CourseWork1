package fitness;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Сlientele {
    private String clientName;
    private String clientSurname;
    private LocalDate clientAge;

    public Сlientele(String clientName, String clientSurname, String clientAge) {
        setClientName(clientName);
        setClientSurname(clientSurname);
        setClientAge(clientAge);
    }

    // геттер для имени клиента
    public String getClientName() {
        return clientName;
    }

    // сеттер для имени клиента
    public void setClientName(String clientName) {
        if (clientName == null) throw new IllegalArgumentException("Имя не может быть пустым");
        this.clientName = clientName;
    }

    // геттер для фамилии клиента
    public String getClientSurname() {
        return clientSurname;
    }

    // сеттер для фамилии клиента
    public void setClientSurname(String clientSurname) {
        if (clientSurname == null) throw new IllegalArgumentException("Фамилия не может быть пустым");
        this.clientSurname = clientSurname;
    }

    // геттер для возраста клиента
    public LocalDate getClientAge() {
        return clientAge;
    }

    // сеттер для возраста клиента
    public void setClientAge(String clientAge) {
        if (ChronoUnit.YEARS.between(LocalDate.parse(clientAge, DateTimeFormatter.ofPattern("dd.MM.yyyy")), LocalDate.now()) < 3) {
            throw new IllegalArgumentException("Клиенту не может быть меньше 3 лет");
        }
        this.clientAge = LocalDate.parse(clientAge, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Override
    public String toString() {
        return "Сlientele{" +
                "clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", clientAge=" + clientAge +
                '}';
    }
}
