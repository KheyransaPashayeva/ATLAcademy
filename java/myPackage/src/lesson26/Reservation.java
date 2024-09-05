package lesson26;

public interface Reservation {
    void write(String details);
    boolean isChecked();
    void reserve(RoomType roomType);
}
