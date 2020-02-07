import com.sun.javafx.scene.layout.region.BorderImageWidthsSequenceConverter;

public class Rectangle {
    private  double Length;
    private  double Width;

    public Rectangle(double Width , double Length){
        this.Width = Width;
        this.Length = Length;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getArea(){
    double area = Width * Length;
    return area;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt((Width * Width)+(Length * Length));
        return diagonal;
    }

    public boolean isSquare(){
        boolean state;
        if(Width == Length){
            state = true;
        }else{
            state = false;
        }
        return state;
    }
}
