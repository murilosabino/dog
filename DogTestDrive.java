public class DogTestDrive {

    public static void main(String[] args) {
        Dog one = new Dog();
        one.setName("Tommy");
        one.setAge(22);

        if(one.getAge()<0){
            System.out.println("o nome do cachorro é " + one.getName() + " mas ele ainda nem nasceu" );
        }

        else if(one.getAge()==1){
            System.out.println("o nome do cachorro é " + one.getName() + " e sua idade é " + one.getAge() + 
            " ano" );
        }

        else{
            System.out.println("o nome do cachorro é " + one.getName() + " e sua idade é " + one.getAge() + 
            " anos");
            
        }

        one.imprime();
       
        } 
    }

