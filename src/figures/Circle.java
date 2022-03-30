package figures;

public class Circle extends Figure implements Moveable {

float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
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

//При этом функция move(float dx, float dy) должна перемещать фигуры на величину dx по оси Ox и dy по оси Oy,
// а функция resize(float koeff) увеличивать высоту, ширину и радиус фигуры в koeff раз.
//
// Т.е. на например для move на вход ты подаешь dx и dy, внутри метода мы прибавляем dx к переменной х, а dy прибавляем к y соответственно.
// Т.е никакой сложной логики, просто сложение.