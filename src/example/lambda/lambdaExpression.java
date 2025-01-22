package example.lambda;

public class lambdaExpression {
    public static void main(String[] args) {
      /*What is Lambda Expression:-
       It is anonymous function
       What is anonymous function in java
       The method which don,t have access modifier, return type,
       and method name that function we called as anonymous function.
       we can use lambda function with functinal interface only
      */
        Runnable r =()->{
            for(int i=1;i<=5;i++){
                System.out.println("executing thread "+ Thread.currentThread().getName());
            }
        };
        Thread th= new Thread(r);
        th.start();
    }

}
