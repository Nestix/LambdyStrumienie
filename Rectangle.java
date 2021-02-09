public class Rectangle{


    private float lenght = 1.0f;
    private float width = 1.0f;

    public Rectangle(float width, float lenght) {
        this.width=width;
        this.lenght=lenght;
    }


    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getRadius() {
        return width*lenght;
    }
    public double getCircut() {
        return lenght*2 + width*2;
    }
    public boolean isSquare() {
        if(lenght==width) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }

}