package com.huni.example.static_example;
import java.lang.Math;
class StaticVar {
    private static int sVar = 10;
    static String sText = "text";
//
    int getSvar() {
        return sVar;
    }
    void setSvar(int sVar) {
        StaticVar.sVar = sVar;
    }
//    Статические переменные можно использовать в нестатических методах, а наоборот нельзя
    void test() {
        sVar = 0;
    }
}
class Run {
    String e = "";
    public static void main(String[] args) {
//        static String err = "Неа"; -- Ошибка компиляции, нельзя использовать модификатор static в внутри блока метода
//        System.out.println(e); -- Нельзя использовать не статические переменные в статических методах
//        Статические переменные принадлежат классу, поэтому мы можем использовать имя класса для обращения к статическим полям
        System.out.println("Value of text: "+ StaticVar.sText);
//        Статические переменные принадлежат классу, а не объекту, поэтому статические переменные одинаковые для всех объектам
        StaticVar vr = new StaticVar();
        StaticVar vr1 = new StaticVar();
        vr1.setSvar(15);
        System.out.println(vr.getSvar());
        vr.setSvar(30);
        System.out.println(vr1.getSvar());
        vr.test();
        System.out.println(vr.getSvar());
    }
}