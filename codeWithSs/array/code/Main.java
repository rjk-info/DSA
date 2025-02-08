class Main {
  String model;
  int year;

  // Default constructor
 Main() {
      model = "Unknown";
      System.out.println("Model: " + model + ", Year: " + year);
  }

  // void display() {
  //     System.out.println("Model: " + model + ", Year: " + year);
  // }

  public static void main(String[] args) {
      Main car = new Main(); // Calls the default constructor
      // car.display();
  }
}
