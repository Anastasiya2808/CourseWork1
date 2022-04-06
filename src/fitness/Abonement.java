package fitness;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum Abonement {

    ONE(1,"08:00:00","22:00:00",true,true,false), // однодневный
    DAY(365,"08:00:00","16:00:00", false,true,true),// дневной
    FULL(365,"08:00:00","22:00:00",true,true,true); // безлимитный

    // свойства
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean swim;
    private boolean gym;
    private boolean groupLesson;

    // параметры для посещения
    Abonement (int days, String startTime, String endTime, boolean swim, boolean gym, boolean groupLesson) {
        startDate = LocalDate.now();
        endDate = startDate.plusDays(days);
        this.startTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        this.endTime = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        this.swim = swim;
        this.gym = gym;
        this.groupLesson = groupLesson;
    }

    // геттер для даты регистрации
    public LocalDate getStartDate() {
        return startDate;
    }

    // геттер для даты истечения срока абонемента
    public LocalDate getEndDate() {
        return endDate;
    }

    // геттер для начала времени посещения
    public LocalTime getStartTime() {
        return startTime;
    }

    // геттер для конца времени посещения
    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean isSwim (){
        return swim;
    }

    public boolean isGym (){
        return gym;
    }

    public boolean isGroupLesson (){
        return groupLesson;
    }

    @Override
    public String toString() {
        return "Abonement{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", swim=" + swim +
                ", gym=" + gym +
                ", groupLesson=" + groupLesson +
                '}';
    }
}
