package com.huni.example.final_example;

// Final класс обозначает, что этот класс не может иметь подклассы, т.е нельзя унаследовать
// Такой класс нужен из соображений безопастности, и это означает что класс эффективен и не нуждается в наследовании
// Все методы в финальном классе являются неявно финальными
final class FinalClass {
    // Данный метод имеет свойство final даже без префикса final, т.е в неявном виде
    void test() { }
}
/*class Test extends FinalClass{ --Ошибка компиляции
}
*/