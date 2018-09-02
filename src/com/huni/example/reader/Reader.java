package com.huni.example.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) {
//        Здесь мы создаем объект-буффер, который будет принимать в буффер поток данных System.in (вводимые значения)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String typedText = "";
//        Создаем форму try-catch для того чтобы отследить, вдруг во время потока произойдет ошибка
        try {
            typedText = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(typedText);

    }
}
