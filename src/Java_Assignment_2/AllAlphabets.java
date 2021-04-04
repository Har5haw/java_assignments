package Java_Assignment_2;

import Java_Assignment_2.Interfaces.AllAlphabetsInterface;
import Java_Assignment_2.Models.AllAlphabetModel;

import java.util.HashSet;

public class AllAlphabets implements AllAlphabetsInterface {
    AllAlphabetModel allAlphabets;

    public AllAlphabets(AllAlphabetModel allAlphabets) {
        this.allAlphabets = allAlphabets;
    }

    @Override
    public boolean check() {

        HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i < allAlphabets.getInput().length(); i++){
            char ch = Character.toLowerCase(allAlphabets.getInput().charAt(i));
            if(Character.isAlphabetic(ch)) {
                hashSet.add(ch);
            }
        }

        return hashSet.size() == 26;
    }
}
