public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Wolf();
        animals[1] = new Cat();
        animals[2] = new Hippo();
        animals[3] = new Lion();

        animals[0].food = "meat";

        for (Animal animal : animals) {
            animal.eat();
            animal.roam();
        }
        System.out.println("---------------------------------------");
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        MyDogList myDogList = new MyDogList();
        myDogList.add(dog);
        myDogList.add(dog2);
        System.out.println(myDogList.getLength());

        MyAnimalList myAnimalList = new MyAnimalList();
        Cat cat = new Cat();
        myAnimalList.add(cat);
        myAnimalList.add(dog);
        System.out.println("---------------------------------------");
        if(dog.equals(cat)) {
            System.out.println("true");
        }else {                         // tells if two objecta are considered equal
            System.out.println("false");
        }
        System.out.println("---------------------------------------");
        System.out.println(cat.getClass()); //give back d cllas d obj was instantiated from
        System.out.println("---------------------------------------");
        System.out.println(cat.hashCode()); // prints out a hashcode for the obj
        System.out.println("---------------------------------------");
        System.out.println(cat.toString()); // ptints out a String message with the name and number
    }
}