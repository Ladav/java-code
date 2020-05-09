import java.io.*;

class ex extends Exception  {
    ex() {}

    void msg() {
        System.out.println("error msg!");
    }
}

class demo {
    public static void main(String la[]) {
        if(18 < 20) {
            try {
                throw new ex();
            }
            catch(ex err) {
                err.msg();
            }
        }
        else {
            System.out.println("hi there");
        }
    }
}