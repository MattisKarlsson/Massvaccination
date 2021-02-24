package Com.Massvaccination;

class Country {
    public int population;
    public String name;
    public void printInfo(){
        System.out.println("You've chosen " + this.name + ".\n" + this.name + "'s current population is "+ this.population + ".\n");
    }}
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
        super.population = 5_385_000;
        super.name = "Norway";
    }
}
class Finland extends Country {
    public Finland() {
        super.population = 5_545_000;
        super.name = "Finland";
    }
}