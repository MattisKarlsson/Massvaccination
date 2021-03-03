package Com.Massvaccination;

// Class to declare varibles and call on Display.countryInfo with args
class Country {
    public int population;
    public String name;
    public void printInfo(){
        Display.countryInfo(name, population);
    }}

    // Following classes to extend and store info per country.
class Sweden extends Country{
    public Sweden(){
        super.population = 10_300_000;
        super.name = "Sweden";
    }
}
class Denmark extends Country {
    public Denmark() {
        super.population = 5_806_000;
        super.name = "Denmark";
    }
}
class Norway extends Country{
    public Norway() {
        this.population = 5_385_000;
        this.name = "Norway";
    }
}
class Finland extends Country {
    public Finland() {
        this.population = 5_545_000;
        this.name = "Finland";
    }
}