public class Dog{

    private int age;
    private String breed;
    private String name;

    public void imprime(){
        if(this.age >= 0){
            while (this.age <= 4){
                System.out.println("auau");
                this.age = this.age + 1;
                System.out.println(this.age);
            }

        if (this.age > 5){
            System.out.println("auuuuu");
        }
        }    

        
    }
     // encapsulamento
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setName (String name){
        this.name = name;
    }





}

