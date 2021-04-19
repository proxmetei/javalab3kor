import java.util.*;

public class ListTest {



    /**
     * Функция тестирования удаления элементов из списка
     * @param list список для тестирования
     * @return время удаления всех элементов из списка
     */
    public Long testRemove(List<Double> list){
        Long start = System.currentTimeMillis();
        for(int i =0;i< list.size();i++){
            list.remove(i);
        }
        Long end = System.currentTimeMillis();
        return end-start;
    }

    /**
     * Функция тестирования получения всех элементов из списка
     * @param list список для тестирования
     * @return время получения всех элементов из списка
     */
    public Long testGet(List<Double> list){
        Long start = System.currentTimeMillis();
        for(int i =0;i< list.size();i++){
            list.get(i);
        }
        Long end = System.currentTimeMillis();
        return end-start;
    }

    /**
     * Функция тестирования сортировки списка
     * @param list список для тестирования
     * @return время сортировки списка
     */
    public Long testSort(List<Double> list){
        Long start = System.currentTimeMillis();
        list.sort((a,b)-> { return a.compareTo(b);});
        Long end = System.currentTimeMillis();
        return end-start;
    }

    /**
     * Функция тестирования получения размера списка
     * @param list список для тестирования
     * @return время получения размера списка
     */
    public Long testSize(List<Double> list){
        Long start = System.currentTimeMillis();
        list.size();
        Long end = System.currentTimeMillis();
        return end-start;
    }

    /**
     * Функция тестирования проверки нахождения элемента в списке
     * @param list список для тестирования
     * @param obj элемент для поиска
     * @return время проверки нахождения элемента в списке
     */
    public Long testContains(List<Double> list, Double obj){
        Long start = System.currentTimeMillis();
        list.contains(obj);
        Long end = System.currentTimeMillis();
        return end-start;
    }
    /**
     * Функция тестирования добавления элементов в конец списка
     * @param list список для тестирования
     * @param k число добавляемых элементов
     * @return время добавления k элементов в переданный List
     */
    public Long testAdd(List<Double> list, int k){
        Long start = System.currentTimeMillis();
        for(int i=0;i<k;i++){
            list.add(Math.random()*100);
        }
        Long end = System.currentTimeMillis();
        return end-start;
    }
    /**
     * Функция тестирования добавления элементов в начало списка
     * @param list список для тестирования
     * @param k число добавляемых элементов
     * @return время добавления k элементов в переданный List
     */
    public Long testAddBegin(List<Double> list, int k){
        Long start = System.currentTimeMillis();
        for(int i=0;i<k;i++){
            list.add(0,Math.random()*100);
        }
        Long end = System.currentTimeMillis();
        return end-start;
    }
}
