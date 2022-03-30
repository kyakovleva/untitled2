package figures;

//1) Создать базовый класс Figure с дробными полями x, y - координаты фигуры и абстрактными методами
//        getArea() - вычисление площади
//        getPerimeter() - вычисление периметра
//
//        Так же необходимо реализовать конструктор Figure(float x, float y)


public abstract class Figure {
    float x;
    float y;
    float S = x*y;
    float P = 2*(x+y);

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
    abstract void getArea(float S);
    abstract void getPerimeter(float P);
}
