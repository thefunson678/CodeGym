package ss15_exception_debug.excercise;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if(a <0 || b<0 || c<0 ){
            throw new IllegalTriangleException("Giá trị âm!");
        } else if (a + b <= c || a+c <= b || b+c <= a) {
            throw new IllegalTriangleException("Không thỏa mãn điều kiện 3 cạnh của tam giác!");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
