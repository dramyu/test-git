package org.example;

public class Man {
    public void sayHello(){
        System.out.println("Hello everybody");
    }
    public void eat(String food){
        System.out.println("男人吃"+food);
    }
    public void run(){
        System.out.println("快跑");
    }
    public void gohome(){
        this.run();
        System.out.println("跑着跑着就到家了");
    }
}
