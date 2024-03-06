package Tuan02;

public class Main {
    public static void main(String[] args) {
        person person1 = new person(123,"Mi",19, 45);
        person person2 = new person(456,"Nghi",19, 47);

        System.out.println(person1);
        System.out.println(person2);

        car car1 = new car("123","Toyota","Green",1995);
        car car2 = new car("456","Ford","Black",2011);
       
        System.out.println(car1);
        System.out.println(car2);
    }


}
