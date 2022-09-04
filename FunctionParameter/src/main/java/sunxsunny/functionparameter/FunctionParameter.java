

package sunxsunny.functionparameter;


public class FunctionParameter {

    public static void main(String[] args) {
        AddClass objectholder = new AddClass();
        objectholder.add();
        
        AnotherAddClass anotherobjectholder = new AnotherAddClass();
        anotherobjectholder.sum(20, 30);
        anotherobjectholder.sum(10, 30);
        anotherobjectholder.mul(10, 30);
        anotherobjectholder.div(90, 30);
    }
}
