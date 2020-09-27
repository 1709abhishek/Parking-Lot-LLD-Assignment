public class ParkingSeries {
  private String name;
  private HashMap<String, HandicappedSpot> hatchbackSpots;
  private HashMap<String, CompactSpot> sedanSpots;
  private HashMap<String, LargeSpot> miniTruckSpots;
  private ParkingDisplayBoard displayBoard;

  public ParkingFloor(String name) {
    this.name = name;
  }

  public void addParkingSpot(ParkingSpot spot) {
    switch (spot.getType()) {
    case ParkingSpotType.HATCHBACK:
      hatchbackSpots.put(spot.getNumber(), spot);
      break;
    case ParkingSpotType.SEDAN:
      sedanSpots.put(spot.getNumber(), spot);
      break;
    case ParkingSpotType.MINITRUCK:
      miniTruckSpots.put(spot.getNumber(), spot);
      break;
    default:
      print("Wrong parking spot type!");
    }
  }

  public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
    spot.assignVehicle(vehicle);
    switch (spot.getType()) {
    case ParkingSpotType.HATCHBACK:
      updateDisplayBoardForHatchback(spot);
      break;
    case ParkingSpotType.SEDAN:
      updateDisplayBoardForSedan(spot);
      break;
    case ParkingSpotType.MINITRUCK:
      updateDisplayBoardForMiniTruck(spot);
      break;
    default:
      print("Wrong parking spot type!");
    }
  }

  private void updateDisplayBoardForHatchback(ParkingSpot spot) {
    if (this.displayBoard.getHatchbackFreeSpot().getNumber() == spot.getNumber()) {
      // find another free hatachback parking and assign to displayBoard
      for (String key : hatchbackSpots.keySet()) {
        if (hatachbackSpots.get(key).isFree()) {
          this.displayBoard.setHatchbackFreeSpot(hatachbackSpots.get(key));
        }
      }
      this.displayBoard.showEmptySpotNumber();
    }
  }

  private void updateDisplayBoardForSedan(ParkingSpot spot) {
    if (this.displayBoard.getSedanFreeSpot().getNumber() == spot.getNumber()) {
      // find another free Sedan parking and assign to displayBoard
      for (String key : SedanSpots.keySet()) {
        if (SedanSpots.get(key).isFree()) {
          this.displayBoard.setSedanFreeSpot(SedanSpots.get(key));
        }
      }
      this.displayBoard.showEmptySpotNumber();
    }
  }

   private void updateDisplayBoardForMiniTruck(ParkingSpot spot) {
    if (this.displayBoard.getMiniTruckFreeSpot().getNumber() == spot.getNumber()) {
      // find another free MiniTruck parking and assign to displayBoard
      for (String key : MiniTruckSpots.keySet()) {
        if (MiniTruckSpots.get(key).isFree()) {
          this.displayBoard.setMiniTruckFreeSpot(MiniTruckSpots.get(key));
        }
      }
      this.displayBoard.showEmptySpotNumber();
    }
  }

  public void freeSpot(ParkingSpot spot) {
    spot.removeVehicle();
    switch (spot.getType()) {
    case ParkingSpotType.HATCHBACK:
      freeHatchbackSpotCount++;
      break;
    case ParkingSpotType.SEDAN:
      freeSedanSpotCount++;
      break;
    case ParkingSpotType.MINITRUCK:
      freeMiniTruckSpotCount++;
      break;
    default:
      print("Wrong parking spot type!");
    }
  }
}