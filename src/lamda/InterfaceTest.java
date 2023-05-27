package lamda;

//empty interface is called as Marker Inteface..  eg.Serializable, Cloneable, RandomAccess.
//Functional Inteface. SAM.
//@FunctionalInterface annotation.
@FunctionalInterface  //which will make sure there in SAM in an interface....
interface Bank
{
    String loanInfo(String str);  //interface methods public abstract by deault
}
interface Add
{
    int add(int a,int b); //abstract method
}
public class InterfaceTest{
    public static void main(String[] args) {
//        Bank axis=new Bank();  //Bank' is abstract; cannot be instantiated
     /*   Bank axis=new Bank(){

            @Override
            public void loanInfo() {

            }
        };*/
      /*  Bank axis=(String str)->str;*/
       /* Bank axis=(str)->str;*/
        Bank axis=str->str; //Lamda can be implemented only in case of Functional Interfaes.
        System.out.println(axis.loanInfo("PNB"));;

        System.out.println("------------------------------");

        Add add=new Add() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(add.add(10,20));

//        Add add1=(int a,int b)->{return a+b;};
        Add add1=(a,b)-> a+b; //in case of functional Interfaces
        System.out.println(add1.add(111,222));


        //lamda is used to reduce the length of the code.
        //landa is used to achieve functional progamming in java.


    }
}


/*Lamda is called as Annonymous function.
* Lamda is function which does not have name and does not have return type.and access modifer  (->) indicates lamda expression
*  */