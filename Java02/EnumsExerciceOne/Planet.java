package EnumsExerciceOne;

public enum Planet {
    MARTH("Marth",10);
    private final String name;
    private final double distanceFromSun;

    private Planet(String name, double distanceFromSun){
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName(){
        return name;
    }
    public double getDistanceFromSun(){
        return distanceFromSun;
    }

}
