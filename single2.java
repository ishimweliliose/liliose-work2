class role {
    public static void main(String[] args) {
        Dog myDog = new Dog("Woof", "Labrador");
        myDog.makeSound(); // Inherited from Animal
        myDog.displayInfo();
    }
}class Animal {
    String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    void makeSound() {
        System.out.println("Animal makes a sound: " + sound);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String sound, String breed) {
        super(sound); // Invoking superclass constructor
        this.breed = breed;
    }

    void displayInfo() {
        System.out.println("Dog breed: " + breed);
    }
}

