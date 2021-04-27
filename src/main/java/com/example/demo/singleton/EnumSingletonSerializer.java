package com.example.demo.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonSerializer {
    static void saveToFile(EnumSingleton singleton, String fileName) throws  Exception
    {
        try(FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ){
            out.writeObject(singleton);
        }
    }

    static EnumSingleton readFromFile(String fileName) throws Exception{
        try(FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (EnumSingleton) in.readObject();
        }
    }
}
