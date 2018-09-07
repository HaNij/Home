package com.huni.example.collection_example;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
// Коллекции это возможность добавить объекты в одну группу, и работать с этой группой
// Коллекция представляет возможность работать с этой группой, например: добавить в группу, удалить из группы, вывести содержимое группы (группы - читай коллекции)
// Коллекции могут содержать только объекты, примитивные переменные нельзя
// Коллекция в большинстве случаев содержит однотипные объекты, однако бывают исключения

public class CollectionExample {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        Collection col1 = new ArrayList();
        col = createCollection(10);
        col1 = createCollection(20);
        printCollectionContains(col, "col");
        printCollectionContains(col1, "col1");
//        добавить к содержимому коллекции col содержимое col1
        col.addAll(col1);
//        ввывод коллекции при помощи Iterator
        printCollectionWithIterator(col, "col");
        col.clear();
        col = createCollection(10);
        printCollectionWithIterator(col,"col");
//        содержание одинаковых объектов col1 и col убираются в коллекции col1
        col1.removeAll(col);
        printCollectionWithIterator(col1,"col1");
        col1 = createCollection(20);
//        удалить элементы col1, которые не содержатся в col
        col1.retainAll(col);
        printCollectionWithIterator(col1,"col1");
    }

    private static Collection createCollection(int width) {
        Collection col = new ArrayList();
        for (int i = 0; i < width; i++) {
            col.add(i);
        }
        return col;
    }

    private static void printCollectionContains(Collection c, String name) {
        System.out.print(name + " contains: ");
        System.out.print(c + "\n");
    }
    private static void printCollectionWithIterator(Collection c, String name) {
        System.out.print(name + " contains: ");
        for (Iterator it = c.iterator(); it.hasNext();) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
