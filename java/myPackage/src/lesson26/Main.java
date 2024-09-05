package lesson26;

public class Main {
    public static void main(String[] args) throws CustomException {
        // Creating an instance of Ramada hotel
        Ramada ramadaHotel = new Ramada();
        if (ramadaHotel instanceof Ramada) {
            System.out.println("okey object in Ramada");
        } else {
            throw new CustomException();
        }
        // Booking rooms at Ramada hotel
        ramadaHotel.bookRoom(RoomType.STANDARD);
        ramadaHotel.bookRoom(RoomType.DELUXE);
        ramadaHotel.bookRoom(RoomType.SUITE);

        // Writing reservation details to file
        ramadaHotel.write("John Doe, Single Room");
        ramadaHotel.write("Jane Smith, Double Room");

        // Reserving a room
        ramadaHotel.reserve(RoomType.STANDARD);
        ramadaHotel.reserve(RoomType.SUITE); // Trying to reserve the same room again
    }
}

