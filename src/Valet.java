public class Valet implements HotelService {

    @Override
    public String getServiceName() {
        return "Valet";
    }

    public void parkVehicle(String plateNumber) {
        System.out.println("[Valet] Vehicle " + plateNumber + " has been parked.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("[Valet] Vehicle " + plateNumber + " has been brought to the entrance.");
    }
}