public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    
    public void checkIn(String plateNumber, int numberOfCarts) {
        System.out.println("=== Check-In ===");
        valet.parkVehicle(plateNumber);
        cart.requestCart(numberOfCarts);
        System.out.println("Check-in complete. Welcome!\n");
    }

    
    public void checkOut(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("=== Check-Out ===");
        cart.requestCart(numberOfCarts);
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        System.out.println("Check-out complete. Thank you for staying with us!\n");
    }

    public void requestRoomCleaning(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestVehiclePickUp(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestLuggageCarts(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}