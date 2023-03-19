import java.util.Scanner;
    public class Rectangle {
        private int p1x;
        private int p1y;
        private int p2x;
        private int p2y;

        public Rectangle(Point p1, Point p2) {

            this.p1x = p1.getX();
            this.p1y = p1.getY();
            this.p2x = p2.getX();
            this.p2y = p2.getY();
        }

        public void moveBy(int x, int y) {
            this.p1x = this.p1x + x;
            this.p1y = this.p1y + y;
            this.p2x = this.p2x + x;
            this.p2y = this.p2y + y;
        }

        public void moveBy(int position) {
            this.p1x = this.p1x + position;
            this.p1y = this.p1y + position;
            this.p2x = this.p2x + position;
            this.p2y = this.p2y + position;
        }

        public String toString() {
            System.out.printf("Rectangle[(%d,%d), (%d,%d)]", this.p1x, this.p1y, this.p2x, this.p2y);
            return "";
        }

    }


