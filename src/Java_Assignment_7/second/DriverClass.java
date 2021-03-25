package Java_Assignment_7.second;

public class DriverClass {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        System.out.println("Upcasted to Cycle");
        for (int i=0; i<3;i++){
            //cycles[i].balance();//This doest work because we cannot access child properties when upcasted to parent
        }

        System.out.println("Down-casted to child objects");
        Unicycle unicycle = (Unicycle)cycles[0];
        unicycle.balance();//This works because we down-casted to child class which have balance method

        Bicycle bicycle = (Bicycle) cycles[1];
        bicycle.balance();//This works because we down-casted to child class which have balance method

        Tricycle tricycle = (Tricycle) cycles[2];
        //tricycle.balance();//This doesn't works because we down-casted to child class which doesn't have balance method
    }
}
