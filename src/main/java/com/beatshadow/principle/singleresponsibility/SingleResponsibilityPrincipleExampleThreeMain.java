package com.beatshadow.principle.singleresponsibility;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/11/5 14:16
 */
public class SingleResponsibilityPrincipleExampleThreeMain {
    public static void main(String[] args) {
        new TravelMethodService().airRun();
        new TravelMethodService().catRun();
        new TravelMethodService().trainRun();
    }
}

class TravelMethodService{
    public void trainRun(){
        System.out.println("train"+"....轨道上行驶");
    }

    public void airRun(){
        System.out.println("air"+"....空中行驶");
    }

    public void catRun(){
        System.out.println("cat"+"....路上行驶");
    }
}

