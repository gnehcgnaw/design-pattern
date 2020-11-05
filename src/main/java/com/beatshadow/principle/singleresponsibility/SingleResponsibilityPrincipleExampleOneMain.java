package com.beatshadow.principle.singleresponsibility;

/**
 * SRP 单一职责原则
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/11/4 01:14
 */
public class SingleResponsibilityPrincipleExampleOneMain {
    public static void main(String[] args) {
        TravelService travelService = new TravelService();
        travelService.run("飞机");
        travelService.run("火车");
        travelService.run("轿车");
    }
}

/**
 *
 */
class  TravelService{
    public void run(String transport){
        System.out.println(transport+"....路上行驶");
    }
}