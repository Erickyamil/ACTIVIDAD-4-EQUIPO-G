class Land extends Vehicle implements LandVehicle {
    private short type;
    private City city; // Composición

    public Land(int power, int year, String brand, short type, City city) {
        super(power, year, brand);
        this.type = type;
        this.city = city;
    }

    @Override
    public String description() {
        return "Vehículo Land: " + brand + ", Año: " + year + ", Poder: " + power + 
               ", Tipo: " + type + ", Ciudad: " + city.getName() + ", País: " + city.getCountry();
    }

    @Override
    public String moveWheels() {
        return "Moviendo sus ruedas!";
    }
}