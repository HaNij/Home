package com.huni.example.collection_example.ArrayList_example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kirill
 * @param <T> Любой объект.
 * @version 0.1
 * Данный пример иллюстрирует работу коллекций
 */

public class ArrayGenericExample<T> {
    public static void main(String ... args) {
        /* TODO
         * Добавить больше примеров работы с методами
         */

        /*
         * Создание нового объекта с ёмкостью 10
         */

        ArrayList<Integer> obj = new ArrayList<>(10);
        System.out.println("Первоначальное создание объекта.");
        for (int i = 0; i < 10; i++) {
            obj.add(i);
        }

        for (Integer anObj : obj) {
            System.out.println(anObj);
        }

        /*
         * Создаём новый объект
         */

        ArrayList<Integer> obj1 = new ArrayList<>(obj);
        System.out.println("Инициализирован объектом obj");
        for(Integer anObj: obj1) {
            System.out.println(anObj);
        }
    }
}
