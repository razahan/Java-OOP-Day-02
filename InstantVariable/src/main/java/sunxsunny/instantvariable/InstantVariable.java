

package sunxsunny.instantvariable;


public class InstantVariable {

    public static void main(String[] args) {
        MyClass MyClassObject = new MyClass();
        MyClassObject.add();
        
        System.out.println(MyClassObject.a);    /* If we want to get value form object */
    }
}
