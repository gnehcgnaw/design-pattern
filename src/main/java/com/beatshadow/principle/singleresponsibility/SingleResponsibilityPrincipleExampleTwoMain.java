package com.beatshadow.principle.singleresponsibility;


/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/11/5 14:05
 */
public class SingleResponsibilityPrincipleExampleTwoMain {
    public static void main(String[] args) {
        new AirTravel().run();
        new CatTravel().run();
        new TrainTravel().run();
    }
}


class AirTravel{
    public void run(){
        System.out.println("air"+"....天上行驶");
    }
}

class CatTravel{
    public void run(){
        System.out.println("cat"+"....路上行驶");
    }
}

class TrainTravel{
    public void run(){
        System.out.println("train"+"....轨道上行驶");
    }
}
