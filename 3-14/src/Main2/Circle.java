package Main2;

public class Circle extends Shape{
    
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double cirle =(radius* radius * Math.PI);
        return cirle;
    }

}
