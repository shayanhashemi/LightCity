package org.example;

import org.example.defualtSystem.Bank;
import org.example.defualtSystem.Life;
import org.example.models.Character;
import org.example.models.*;

import java.util.ArrayList;

public class Data {
    public static ArrayList<User> users = new ArrayList<>();

    public static void plus(Object data_R){
        if (data_R instanceof User) {
            users.add((User) data_R);
        }
    }
    public static void ommit(Object data_R){
        if (data_R instanceof User) {
            users.remove((User) data_R);
    }
}
}

