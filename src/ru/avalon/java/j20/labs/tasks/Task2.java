package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

/**
 * Задание №2.
 *
 * <p>Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {
  
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        
        Point<Integer> intPoint = new Point (x:10, y:10);
        Point<Double> floatPoint = new Point (x:100.00f, y:10.0f);
            

//                getDistance(intPoint x, intPoint y, floatPoint x, floatPoint y);
//        Distance = Math.sqrt((intPoint x - floatPoint x) * (intPoint x - floatPoint x) + (intPoint y - floatPoint y) * (intPoint y - floatPoint y));

        System.out.println(intPoint.distanceTo(floatPoint));
        /*
         * TODO(Студент): Выполнять задание №2
         *
         * 1. Выполнить обобщение класса Point с использованием
         *    шаблона так, чтобы в качестве координат точки
         *    можно было использовать любые числовые типы данных.
         *
         * 2. Создать  экземпляр типа Point:
         *
         *    - Создать точку, использующую для описания координат
         *      значения типа float.
         *
         *    - Создайте точку, использующую для описания координат
         *      значение типа int.
         *
         * 3. Вычислите дистанцию между точками.
         *
         * 4. С использованием отладчика проверьте корректность
         *    работы программы.
         */
    }
}
