class Animal{

    String color = "white";

    void skill(){

        System.out.println("Animal");

    }

}

class Dog extends Animal{

    String color = "Black";

    void skill(){

        System.out.println("Dog");

    }

    void work(){

        skill();
        super.skill();

        System.out.println(color);
        System.out.println(super.color);

    }

}


public class superr {
    

    public static void main(String[] args) {
        
        Dog d = new Dog();

        d.work();


    }

}
