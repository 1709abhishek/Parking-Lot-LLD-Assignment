public abstract class ParkingSpot {
  private String number;
  private boolean free;
  private Vehicle vehicle;
  private final ParkingSpotType type;

  public boolean IsFree();

  public ParkingSpot(ParkingSpotType type) {
    this.type = type;
  }

  public String getNumber() {
      return number;
  }

  public void setNumber(String number) {
      this.number = number;
  }

  public boolean assignVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    free = false;
  }

  public boolean removeVehicle() {
    this.vehicle = null;
    free = true;
  }
}

public class HatchbackSpot extends ParkingSpot {
  public HatchbackSpot() {
    super(ParkingSpotType.HATCHBACK);
  }
}

public class SedanSpot extends ParkingSpot {
  public SedanSpot() {
    super(ParkingSpotType.SEDAN);
  }
}

public class MiniTruckSpot extends ParkingSpot {
  public MiniTruckSpot() {
    super(ParkingSpotType.MINITRUCK);
  }
}
