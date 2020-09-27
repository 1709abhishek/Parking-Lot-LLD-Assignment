public abstract class Account {
  private String userName;
  private String password;
  private AccountStatus status;
  private Person person;

  public AccountStatus getStatus() {
      return status;
  }

  public void setStatus(AccountStatus status) {
      this.status = status;
  }

  public boolean resetPassword();
}

public class Admin extends Account {
  public bool addParkingSeries(ParkingFloor series);
  public bool addParkingSpot(String seriesName, ParkingSpot spot);
  public bool addParkingDisplay(String seriesName, ParkingDisplayBoard display);
  public bool addCustomerInfoSystem(String floorName, CustomerInfoSystem infoSystem);


}

public class ParkingAttendant extends Account {
  public bool processTicket(string TicketNumber);
}