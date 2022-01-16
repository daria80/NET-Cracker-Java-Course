package ArrayVector;

/**
 * ЦЕЛЬ ЗАДАЧИ - разобраться с массивами и циклами в Java, принципами написания класса,
 *  вызовом статических методов (стандартных классов).<br/>
 * <p/>
 * ЗАДАНИЕ<br/>
 * Реализовать класс для работы с вектором (набор вещественных чисел, координат)
 *  и базовые операции векторной арифметики.<br/>
 * <p/>
 * ТРЕБОВАНИЯ<br/>
 * Экземпляр класса, реализующего данный интерфейс, должен соответствовать одному вектору
 *  и хранить элементы вектора в поле типа "массив".<br/>
 * НЕЛЬЗЯ пользоваться классами библиотеки Java, кроме классов Math и Arrays.<br/>
 * Среди конструкторов должен быть конструктор без параметров (default constructor), причем public.<br/>
 * Класс должен работать корректно после вызова такого конструктора и без вызова set-метода.<br/>
 * <p/>
 * ПРИМЕЧАНИЕ<br/>
 * Задачу можно решать без явной обработки и генерации исключительных ситуаций (Exceptions).<br/>
 *
 * @author Andrey Gavrilov
 * @author Alexander Kharichkin
 * @author Alexey Evdokimov
 */
public interface ArrayVector {
    /**
     * Задает все элементы вектора (определяет длину вектора).
     * Передаваемый массив не клонируется.
     * @param elements Не равен null
     */
    void set(double... elements);
    /**
     * Возвращает все элементы вектора. Массив не клонируется.
     */
    double[] get();
    /**
     * Возвращает копию вектора (такую, изменение элементов
     *  в которой не приводит к изменению элементов данного вектора).<br/>
     * Рекомендуется вызвать метод clone() у самого массива или использовать
     *   {@link System#arraycopy(Object, int, Object, int, int)}.
     */
    ArrayVector clone();
    /**
     * Возвращает число элементов вектора.
     */
    int getSize();

    /**
     * Изменяет элемент по индексу.
     * @param index В случае выхода индекса за пределы массива:<br/>
     *  а) если index<0, ничего не происходит;<br/>
     *  б) если index>=0, размер массива увеличивается так, чтобы index стал последним.
     */
    void set(int index, double value);
    /**
     * Возвращает элемент по индексу.
     * @param index В случае выхода индекса за пределы массива
     *   должно генерироваться ArrayIndexOutOfBoundsException
     */
    double get(int index) throws ArrayIndexOutOfBoundsException;

    /**
     * Возвращает максимальный элемент вектора.
     */
    double getMax();
    /**
     * Возвращает минимальный элемент вектора.
     */
    double getMin();
    /**
     * Сортирует элементы вектора в порядке возрастания.
     */
    void sortAscending();

    /**
     * Умножает вектор на число.<br/>
     * Замечание: не пытайтесь использовать безиндексный цикл foreach:
     *  для изменения элемента массива нужно знать его индекс.
     * @param factor
     */
    void mult(double factor);
    /**
     * Складывает вектор с другим вектором, результат запоминает в элементах данного вектора.<br/>
     * Если векторы имеют разный размер, последние элементы большего вектора не учитываются<br/>
     *  (если данный вектор - больший, его размер менять не надо, просто не меняйте последние элементы).
     * @param anotherVector Не равен null
     * @return Ссылка на себя (результат сложения)
     */
    ArrayVector sum(ArrayVector anotherVector);
    /**
     * Возвращает скалярное произведение двух векторов.<br/>
     * Если векторы имеют разный размер, последние элементы большего вектора не учитываются.
     * @param anotherVector Не равен null
     */
    double scalarMult(ArrayVector anotherVector);
    /**
     * Возвращает евклидову норму вектора (длину вектора
     *  в n-мерном евклидовом пространстве, n={@link #getSize()}).
     * Квадрат нормы вектора равен скалярному произведению вектора на себя.
     */
    double getNorm();
}
