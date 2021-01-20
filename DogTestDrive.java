public class DogTestDrive {
    public static void main(String[] args) {
        Dog tomy = new Dog();
        tomy.name = "Tommy";
        tomy.size = 1;

        System.out.println("o nome do cachorro é " + tomy.name + " e sua idade é " + tomy.size);

        tomy.puppy();

        tomy.oldDog();
        } 
    }

