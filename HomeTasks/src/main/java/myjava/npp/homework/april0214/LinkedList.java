package myjava.npp.homework.april0214;

import java.lang.reflect.Type;

/**
 * Created by teren_000 on 04.04.2014.
 */
public class LinkedList <TypeOfValue> implements List<TypeOfValue> {





    private class Refer<TypeOfValue>{
        TypeOfValue value;
        Refer<TypeOfValue> next;
        Refer(){
            next=null;
        }
        Refer(TypeOfValue val, Refer<TypeOfValue> nextRefer){
            this.value=val;
            this.next = nextRefer;
        }
    }


    private Refer head;
    private Refer tail;

    private int size;

    public LinkedList(){
        tail=new Refer<TypeOfValue>();
        head=tail;
        size=0;
    }

    public LinkedList(TypeOfValue val){
        tail=new Refer<TypeOfValue>();
        head=new Refer<TypeOfValue>(val, tail);
        tail.next=head;
        size=1;
    }

    public LinkedList(LinkedList<TypeOfValue> secondList){
        if (secondList.head==secondList.tail){
            tail=new Refer<TypeOfValue>();
            head=tail;
        }
        else{
            Refer<TypeOfValue>secondListRefer=secondList.head;
            head=new Refer<TypeOfValue>(secondListRefer.value,secondListRefer.next);
            Refer<TypeOfValue> thisListRef=head;
            while(secondListRefer.next!=secondList.tail){
                thisListRef.next=new Refer<TypeOfValue>(secondListRefer.value, null);
                thisListRef=thisListRef.next;
                secondListRefer=secondListRefer.next;
            }
            thisListRef.value=secondListRefer.value;
            tail=new Refer<TypeOfValue>(null,thisListRef);
            thisListRef.next=tail;
        }
        size=secondList.size;
    }

    @Override
    public void add(TypeOfValue value) {
        if (head==tail){
            head=new Refer<TypeOfValue>(value, tail);
            tail.next=head;
        }
        else{
            tail.next.next=new Refer<TypeOfValue>(value, tail);
            tail.next=tail.next.next;
        }
        size++;
    }

    @Override
    public TypeOfValue remove() {
        if (head==tail){
            return null;
        }
        else{
            size--;
            TypeOfValue result = (TypeOfValue) tail.next.value;
            if (head.next==tail){
                head=tail;
                tail.next=null;
                return result;
            }

            else{
                Refer<TypeOfValue>ref = head;
                while (ref.next.next!=tail){
                    ref=ref.next;
                }
                ref.next=tail;
                tail.next=ref;
                return result;
            }
        }

    }

    @Override
    public TypeOfValue peek() {
        if (tail==head){
            return null;
        }
        else{
            TypeOfValue result = (TypeOfValue) tail.next.value;
            return result;
        }

    }

    @Override
    public int getSize() {
        return size;
    }
}
