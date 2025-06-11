public class Overload{
    public static void main(String[] args){
        Over obj=new Over();
        obj.add();
        obj.add(6,7);
        obj.add(9,6,5);
    }
}
class Over{
    void add(){
        System.out.println("There is no arguments");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}