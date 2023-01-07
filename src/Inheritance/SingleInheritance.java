package Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        ChildDove child = new ChildDove();
        child.fly();
        child.petBirds();
    }
}

class ParentBird {
    public void fly() {
        System.out.println("Birds will fly");
    }
}

class ChildDove extends ParentBird {
    public void petBirds() {
        System.out.println("Dove is pet bird");
    }
}
