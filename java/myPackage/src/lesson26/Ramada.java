package lesson26;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Ramada extends Hotels implements Reservation {
    String room;
    String address;
    private boolean checkedIn = false;
    private boolean reserved = false;

    RoomType room_category;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public RoomType getRoom_category() {
        return room_category;
    }

    public void setRoom_category(RoomType room_category) {
        this.room_category = room_category;
    }

    // Implementing the bookRoom method
    @Override
    void bookRoom(RoomType roomType) {
        System.out.println("Booking a " + roomType + " room at Ramada.");
        checkedIn = true; // Marking as checked in upon booking
    }

    // Implementing the write method from the Reservation interface
    @Override
    public void write(String details) {
        try {
            FileWriter writer = new FileWriter("reservations.txt", true);
            writer.write(details + "\n");
            writer.close();
            System.out.println("Reservation details written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing reservation details.");
            e.printStackTrace();
        }
    }

    // Implementing the isChecked method from the Reservation interface
    @Override
    public boolean isChecked() {
        return checkedIn;
    }

    // Implementing the reserve method from the Reservation interface
    @Override
    public void reserve(RoomType roomType) {
        if (!reserved) {
            System.out.println("Room of type " + roomType + " reserved at Ramada.");
            reserved = true;
        } else {
            System.out.println("Room already reserved.");
        }
    }
}
