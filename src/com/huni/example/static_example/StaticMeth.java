package com.huni.example.static_example;


class StaticMeth {
    public static void main(String[] args) {
        sA sa = new sA();
        sA sb = new sB();
        sA sc = new sC();

        A a = new A();
        A b = new B();
        A c = new C();
        System.out.println("Static hidden overriding");
//        Такой подход переопределения не нужен. Статические методы переопределенные в субклассах скрыты и не вызываются, т.е нет полиморфизма
        sa.print();
        sb.print();
        sc.print();
        System.out.println("Обычное переопределение non-static методов");
        a.print();
        b.print();
        c.print();
    }
}

class sA {
    static void print() {
        System.out.println("A");
    }
}

class sB extends sA{
    static void print() {
        System.out.println("B");
    }
}

class sC extends sB{
    static void print() {
        System.out.println("C");
    }
}

class A {
    void print() {
        System.out.println("A");
    }
}


class B extends A {
    void print() {
        System.out.println("B");
    }
}


class C extends B{
    void print() {
        System.out.println("C");
    }
}