package lesson12;

public class Main {
    public static void main(String[] args) {
        Human person=new Human("Xeyransa","Pashayeva",1997);
        Human person3=new Human("Tariyel","Pashayev",1986);
        Human person1=new Human("Inci","Pashayeva",2019, person.getMother(), person.getFather());
        String[] arr ={"eat","drink","sleep"};
        Pet pet = new Pet("dog","Rock",5,75,arr);
        Human person2=new Human("Xeyransa","Pashayeva",2017,100,pet,person,person3);

        System.out.println(person1);
        System.out.println(person3);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(pet);

        person2.describePet();
        person2.greetPet();

        pet.eat();
        pet.respond();
        pet.foul();
    }

}


