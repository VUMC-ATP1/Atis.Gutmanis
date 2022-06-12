package homework.classHomework;

public class trīsstūris {

    public int side1, side2, side3;
    double area;

    public trīsstūris() {
        System.out.println("We are making a triangle!");
    }


    public trīsstūris(int side1, int side2, int side3) {
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

            double heron1 = (this.side1 + this.side2 + this.side3) / 2.0d;
            double heron2 = Math.sqrt(heron1 * (heron1 - this.side1) * (heron1 - this.side2) * (heron1 - this.side3));
            this.area = (int) heron2;

        }

    }

    public boolean allSidesEqual() {
        return this.side1 == this.side2 && this.side2 == this.side3;
    }

    public boolean twoSidesEqual() {
        return this.side1 == this.side2 || this.side2 == this.side3 || this.side3 == this.side1;
    }


}
