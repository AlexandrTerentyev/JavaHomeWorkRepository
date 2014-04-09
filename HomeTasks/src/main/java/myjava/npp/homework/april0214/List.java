package myjava.npp.homework.april0214;

/**
 * Created by teren_000 on 04.04.2014.
 */
public interface List <TypeOfValue> {

    /**add new element at the end*/
    public void add(TypeOfValue value);

    /**delete and return last element of the list*/
    public TypeOfValue remove();


    /**return last element of list without delete*/
    public TypeOfValue peek ();

    /**
     *
     * @return number of elements
     */
    int getSize();
}
