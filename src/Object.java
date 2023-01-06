public class Object {
    public static void main(String[] args) {
//className objectname = new ClassName();
        ObjectExample a = new ObjectExample();
        ObjectExample b = new ObjectExample();
        a.name = "kanna";
        a.suji();
        b.name="kutty";
        b.suji();

    }
}

class ObjectExample {
    //variable definition - datatype variablename;
    //variable declaration - datatype variablename = value;
    //function definition  - accessModifier returntype functionname(){   }
    //function calling - functionName();
    String name = "Ragul";

    public void suji() {
        //fun declare
        System.out.println(name);
    }
}


