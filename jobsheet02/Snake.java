package jobsheet02;

public class Snake {
    int x, y, width, height;

    // construction
    Snake(int hor, int ver, int w, int h) {
        x = hor;
        y = ver;
        width = w;
        height = h;
    }
    // method
     void moveLeft() {
       x -= 1;
       detectCollision(x, y);
    }
    void moveRight() {
        x += 1;
        detectCollision(x, y);
    }
    void moveUp() {
        y -= 1;
        detectCollision(x, y);
    }
    void moveDown() {
        y+= 1;
        detectCollision(x, y);
    }
    void printPosition(){
        System.out.println("Posisi ular berada pada x : " + x + "\ndan berada pada sumbu : " + y);
    }
    void detectCollision(int x, int y) {
        if (x < 0 || x > width || y < 0 || y > height) {
           System.out.println("////// Game Over //////");
        //    System.out.println("Posisi ular berada pada x over : " + x + "\ndan berada pada sumbu over : " + y);
           System.exit(0);
        }
    }

}
