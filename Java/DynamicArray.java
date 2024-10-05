// import java.util.ArrayList;
/*
    dynamic array also named
    ArrayList in Java
    Vector in C++
    Array in JS
    List in Py
*/
public class DynamicArray {
    public static void main(String[] args) {
        // ArrayList<String> arrayList = new ArrayList<String>();

        InnerDynamicArray dynamicArray = new InnerDynamicArray();
        // System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");

        dynamicArray.insert(0, "x");
        dynamicArray.delete("C");
        System.out.println(dynamicArray.search("O"));
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.err.println("empty: " + dynamicArray.isEmpty());
    }
    
}


/**
 * InnerDynamicArray
 */
class InnerDynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public InnerDynamicArray() {
        this.array = new Object[capacity];
    }
    public InnerDynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if (size >= capacity){
            grow();
        }
        for (int i = size; i > index; i-- ){
            array[i] = array[i -1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){
        for (int i = 0; i < size; i++){
            if (array[i] == data) {
                for(int j = 0; j< (size - i - 1); j++){
                    array[i + j] = array[i + j +1];
                }
                array [size - 1] = null;
                size--;
                if (size <= (int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
        for(int i = 0; i < size; i++){
            if (array[i] == data){
                return i;
            }
        }
        return -1;
    }
    private void grow(){
        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    private void shrink(){
        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){

        String string = "";
        for(int i = 0; i < size; i++){ // if {size} change to {capacity} it display full capacity {not filed-in} 
            string += array[i] + ", ";
        } 
        if(string != ""){
            string = "[" + string.substring(0, string.length() -2) + "]";
        }
        else{
            string = "[]";
        }
        return string;
    }
}