package Homework.day16;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;


    private boolean checkSideSize(int size) {
        return size >= 1 && size <= 20;
    }

    private boolean isTriangleValid() {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    private boolean isRightTriangle(Triangle tr) {
        if (!isTriangleValid()) return false;
        return (tr.sideA * tr.sideA + tr.sideB * tr.sideB == tr.sideC * tr.sideC) ||
                (tr.sideB * tr.sideB + tr.sideC * tr.sideC == tr.sideA * tr.sideA) ||
                (tr.sideA * tr.sideA + tr.sideC * tr.sideC == tr.sideB * tr.sideB);
    }

    public int Naxaverjin(Triangle tr) {
        if (isRightTriangle(tr)) {
            int max = tr.sideA;
            if (tr.sideB > max) max = tr.sideB;
            if (tr.sideC > max) max = tr.sideC;

            if (max == tr.sideA) return (sideB * sideC) / 2;
            else if (max == tr.sideB) return (sideA * sideC) / 2;
            else return (sideA * sideB) / 2;
        } else return tr.sideA + tr.sideB + tr.sideC;
    }

    public boolean check(Triangle tr) {
        return tr.isTriangleValid();
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (checkSideSize(sideA)) this.sideA = sideA;
        else System.out.println("Wrong size");
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (checkSideSize(sideB)) this.sideB = sideB;
        else System.out.println("Wrong size");
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (checkSideSize(sideC)) this.sideC = sideC;
        else System.out.println("Wrong size");
    }

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA < 1 || sideB < 1 || sideC < 1) {
            System.out.println("Negative size is unacceptable you SUCKER");
            return;
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
