public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog("pug", "tommy");
        one.size = 1;

        System.out.println("o nome do cachorro é " + one.name + " e sua idade é " + one.size);

        one.puppy();

        one.oldDog();
        } 
    }

