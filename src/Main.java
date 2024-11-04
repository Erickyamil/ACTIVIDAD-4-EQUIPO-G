public class Main {
    public static void main(String[] args) {
        City city = new City("CDMx", "México");
        Land landVehicle = new Land(450, 2004, "SUZUKI", (short) 1, city);
        Amphibian amphibianVehicle = new Amphibian(300, 2005, "CarroAmphibian", "Vehículo Amphibio");

        System.out.println(landVehicle.description());
        System.out.println(landVehicle.moveWheels());

        System.out.println(amphibianVehicle.description());
        System.out.println(amphibianVehicle.moveJetPropulsion());
    }
}