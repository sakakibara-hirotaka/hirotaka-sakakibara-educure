package Main2;

public class Rectangle extends Shape{
    
    double width;
    double height;

    public Rectangle(double width , double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        double rectangle = (this.height * this.width);
        return rectangle;
    }
}
