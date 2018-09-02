package com.huni.example.final_example;

// Методы в классе объявленные как final нельзя переопределать при наследовании, но можно перегружать в даннов классе

class FinalMethod {
//    Этот метод нельзя при наследевонии переопределять
    final void method() {
        System.out.println("Мой программист, считает, что я идеальный метод и меня никто не должен трогать своими грязными руками");
    }
//    Перегрузка метода final void method
    void method(int a){}
    int method(int a, int b) {
       return 0;
    }

//    Этот метод можно переопределять при наследовании
    void test() {
        System.out.println("Test1");
    }
}

class Test extends FinalMethod {
//        void method(){} -- Ошибка компиляции, данный метод нельзя переопределять
//        Перегруженный метод можно переопределять
    void method(int a) {
        System.out.println("А я бестолковый метод, который клонирует метод, который нельзя трогать, но с аргументом int a");
    }
    void test() {
        System.out.println("Test2");
    }

}

class Run {
    public static void main(String[] args) {
        FinalMethod m = new FinalMethod();
        Test t = new Test();
        m.test();
        t.test();
        m.method();
        t.method(10);

    }
}