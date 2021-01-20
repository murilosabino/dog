public class Dog{

    int size;
    String breed;
    String name;

    public void bark(){
        System.out.println("au au");
    }

    public void puppy(){
        while (this.size <= 4){
            System.out.println("auau");
            this.size = this.size + 1;
            System.out.println(this.size);
        }
    }

    public void oldDog(){
        if (this.size > 5){
            System.out.println("auuuuu");
        }
    }

}

