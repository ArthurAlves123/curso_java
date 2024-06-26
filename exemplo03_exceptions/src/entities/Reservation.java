package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import exceptions.DomainException;

public class Reservation {
    private static DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
        if(!checkOut.isAfter(checkIn)){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public LocalDate getCheckIn() {
        return checkIn;
    }
    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration(){
        Duration t1 = Duration.between(checkIn.atTime(0, 0),checkOut.atTime(0,0));
        return t1.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException{

        LocalDate now = LocalDate.now();

        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        } 
       
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Reservation: "
        + "Room "
        + roomNumber
        + ", check-in: "
        + fmt01.format(checkIn)
        + ", check-out: "
        + fmt01.format(checkOut)
        + ", "
        + duration()
        + " nights";
    }
}
