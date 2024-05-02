package classprograms;

class Animall {
 public void move() {
     System.out.println("Animal moves");
 }
}


class Cheetah extends Animall {
 @Override
 public void move() {
     System.out.println("Cheetah runs");
 }
}

public class Programs3 {
 public static void main(String[] args) {
     Animall animal = new Animall();
     animal.move();
     Cheetah cheetah = new Cheetah();
     cheetah.move();
 }
}
