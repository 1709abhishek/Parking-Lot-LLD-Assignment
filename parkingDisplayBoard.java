public class ParkingDisplayBoard {
  private String id;
  private HatchbackSpot hatchbackFreeSpot;
  private SedanSpot sedanFreeSpot;
  private MiniTruckSpot miniTruckFreeSpot;

  public void showEmptySpotNumber() {
    String message = "";
    if(hatchbackFreeSpot.IsFree()){
      message += "Free Hatchback: " + hatchbackFreeSpot.getNumber();
    } else {
      message += "Hatchback is full";
    }
    message += System.lineSeparator();

    if(sedanFreeSpot.IsFree()){
      message += "Free Sedan: " + sedanFreeSpot.getNumber();
    } else {
      message += "Sedan is full";
    }
    message += System.lineSeparator();

    if(miniTruckFreeSpot.IsFree()){
      message += "Free mini truck: " + miniTruckFreeSpot.getNumber();
    } else {
      message += "mini truck is full";
    }
    message += System.lineSeparator();

    

    Show(message);
  }
}