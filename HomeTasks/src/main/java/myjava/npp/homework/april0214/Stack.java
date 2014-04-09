package myjava.npp.homework.april0214;

/**
 * Created by teren_000 on 04.04.2014.
 */
public class Stack<TypeOfValue> {
    LinkedList<TypeOfValue> list;

    Stack(){
        list=new LinkedList<TypeOfValue>();
    }

    Stack(TypeOfValue val){
        list=new LinkedList<TypeOfValue>(val);
    }

    Stack(Stack<TypeOfValue> stack){
        list=new LinkedList<TypeOfValue>(stack.list);
    }

    /**add new element to stack
     * @param val
     */
    void push(TypeOfValue val){
        list.add(val);
    }

    /**return and remove last element from stack
     *
     * @return last element of stack
     */
    TypeOfValue pop (){
        return list.remove();
    }

    /**return last element without remive
     *
     * @return last element
     */
    TypeOfValue peek(){
       return list.peek();
    }

    /**size of stack
     *
     * @return size of stack
     */
    int size(){
        return list.getSize();
    }


}
