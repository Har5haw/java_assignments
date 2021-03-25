package Java_Assignment_6;


class StringArgument {
    public StringArgument(String argument){
        System.out.println(argument);
    }
}

public class StringArgumentMain{
    public static void main(String[] args) {

        System.out.println("-----without creating objects output--------");
        StringArgument[] stringArgumentList = new StringArgument[2];


        System.out.println("-----with creating objects output--------");
        stringArgumentList[0] = new StringArgument("1st object");
        stringArgumentList[1] = new StringArgument("2st object");
    }
}
