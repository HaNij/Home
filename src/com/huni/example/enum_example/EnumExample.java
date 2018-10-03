package com.huni.example.enum_example;

/*
 * Перечисления в Java являются ограниченными классами,
 * т.е enum может иметь поля, методы, конструкторы,
 * интерфейсы, но не может наследоваться.
  */

/**
 * Перечисления вид яблок.
 */
enum Apple {
/*
  *  Для каждой константы вызывается свой конструктор,
  *  в этом примере вызывается конструктор,
  *  в котором указывается цена, для каждой константы.
  */
    Green(10), Red(5), Soft(4), Hard;
//    Инкапсуляция разрешена
    private int price;
//    Конструктор, который инициализирует цену
    Apple(int price) {
        this.price = price;

    }
//    Конструктор по умолчанию, если цена не указана
    Apple() {
        price = 0;
    }

    public int getPrice() {
        return price;
    }
/*
  * Все перечисления наследуется от Enum и от Object соотвественно,
  * значит мы можем переопределить метод класса Object - public String toString()
  */

    @Override
    public String toString() {
/*
  * Ссылка this используется для определения конкретного объекта класса (читай перечисления) Apple,
  * который содержит какой-либо сорт яблока
  */
        switch (this){
            case Green: return "Сорт зеленное яблоко";
            case Red: return "Сорт красное яблоко";
            case Soft: return "Сорт мягкий яблок";
            case Hard: return "Сорт твердых яблок";
            default: return "Неизвестный сорт яблока";
        }
    }
}

/**
 * class EnumTest используется для тестирование
 */

class EnumTest {
    public static void main(String[] args) {
        Apple ap1 = Apple.Green;
//        valueOf(String) возращает объект класса Apple по String аргументу
        Apple ap2 = Apple.valueOf("Red");
//        public static [] values() - возвращает массив перечисления
        Apple apm[] = Apple.values();
        System.out.println("Сорта в базе данных: ");
        for (Apple a: apm) {
            System.out.println(a.toString() + ". Цена: " + (!(a.getPrice() <= 0) ? a.getPrice() + " рублей за штуку." : " не указанна"));
        }


    }
}
