public enum Vehicle {
    HATCHBACK, SEDAN, MINITRUCK
}

public enum ParkingSpotType {
  HATCHBACK, SEDAN, MINITRUCK
}

public enum AccountStatus {
  ACTIVE, BLOCKED, BANNED
}

public enum TicketStatus {
  PAID, UNPAID, LOST
}

public class Address {
  private String Address;
  private String city;
  private String state;
  private String pinCode;
  private String country;
}

public class Person {
  private String name;
  private Address address;
  private String email;
  private String phone;
}