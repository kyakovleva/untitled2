package figures;

public class Rectangle extends Figure implements Moveable{
    float height;
    float width;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    void getArea(float S) {

    }

    @Override
    void getPerimeter(float P) {

    }

    @Override
    public void move(float dx, float dy) {

    }

    @Override
    public void resize(float koeff) {

    }
}
