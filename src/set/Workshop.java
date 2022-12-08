package set;

abstract class Workshop {

    private double x;
    private double y;
    private String name;
    
    protected Workshop(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return name;
    }
}
