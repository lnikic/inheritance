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

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        MyDogList myDogList = new MyDogList();
        myDogList.add(dog);
        myDogList.add(dog2);
        System.out.println(myDogList.getLength());

    }
}