// abstract class Shape{  
//     abstract void draw();  
//     }  
    
// class Rectangle extends Shape{ 

//     void draw(){
//         System.out.println("drawing rectangle");}  
//     }  

// class Circle1 extends Shape{  

//     void draw(){
//         System.out.println("drawing circle");}  
//     }  
  
// class TestAbstraction1{  

//     public static void main(String args[]){  

//         Shape s=new Circle1();
//         s.draw();  
//     }  
// }  

abstract class bank{

     void interest(){

        System.out.println("hello");
     }
}

class Abs extends bank{

    
    public static void main(String[] args) {
        

        bank obj = new Abs();

        obj.interest();

    }
}