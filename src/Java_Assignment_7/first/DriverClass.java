package Java_Assignment_7.first;

public class DriverClass {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Hamster();
        rodents[2] = new Gerbil();

        for (int i=0;i<3;i++){
            System.out.println("rodent "+(i+1)+" says : "+rodents[i].say());
        }
    }
}
