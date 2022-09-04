
package sunxsunny.instantvariable;

/* instant variable means we create a value insde class and call from function or method */

public class MyClass {
    
    public int a = 20;
    public int b = 30;
    public int c;
    public int d;
    
    public void add(){
        this.c = this.a + this.b;       /* When we use this value, we have to use "this" to get from outside of function */
        this.d = this.a * this.b;
        
        System.out.println(this.c);
        System.out.println(this.d);
    }
    
}
