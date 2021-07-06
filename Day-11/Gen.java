package prac;

import java.util.ArrayList;
import java.util.Iterator;

class Test<T> {
    T obj1;
    
    Test(T obj1) {                                //Constructor 
        this.obj1 = obj1;
    }
    public T getObject() {
        return this.obj1;
    }

}

class ParaTest<T1,T2> {
    T1 obj1;
    T2 obj2;

    ParaTest(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class GenericFuncTest {
    <T> void genDisp(T val) {
        System.out.println(val.getClass().getName() + " = " + val);
    }
}
class Gen {
    public static void main(String[] args) {
        Test <Integer> int_test = new Test<Integer>(10);
        System.out.println(int_test.getObject());
        Test <String> str_test = new Test<String>("Hello");
        System.out.println(str_test.getObject()); 



        ParaTest<Integer, String> par_test = new ParaTest<Integer, String>(20, "Johnnnnn");
        par_test.print();
        
        GenericFuncTest genfuncobj = new GenericFuncTest();
        genfuncobj.genDisp(1);
        genfuncobj.genDisp("Rick");
        genfuncobj.genDisp(2.2);
        genfuncobj.genDisp(2.2f);
        

        ArrayList arr = new ArrayList();
        arr.add("Hey");
        arr.add('I');
        arr.add(010);

        Iterator i = arr.iterator();

        System.out.println(arr);
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
