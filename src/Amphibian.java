class Amphibian extends Vehicle implements LandVehicle, WaterVehicle {
    private String type;

    public Amphibian(int power, int year, String brand, String type) {
        super(power, year, brand);
        this.type = type;
    }

    @Override
    public String description() {
        return "Vehículo Amphibio: " + brand + ", Año: " + year + ", Poder: " + power + 
               ", Tipo: " + type;
    }

    @Override
    public String moveWheels() {
        return "Moviendo ruedas como un Amphibian!";
    }

    @Override
    public String moveJetPropulsion() {
        return "Usando jet de propulsión a chorro!";
    }

    public String pathProgramming() {
        return "Path programming para " + type;
    }
}