package com.example.androidthings.myproject;

import com.google.android.things.pio.Gpio;

/**
 * Template for IDD Fall 2017 HW2 (text entry device)
 * Created by bjoern on 9/5/17.
 */

public class Hw2TemplateApp extends SimplePicoPro {

    int i=0;
    int j=0;
    @Override
    public void setup() {
        //set two GPIOs to input

        pinMode(GPIO_39,Gpio.DIRECTION_IN);
        setEdgeTrigger(GPIO_39,Gpio.EDGE_BOTH);

        pinMode(GPIO_35,Gpio.DIRECTION_IN);
        setEdgeTrigger(GPIO_35,Gpio.EDGE_BOTH);

        pinMode(GPIO_34,Gpio.DIRECTION_IN);
        setEdgeTrigger(GPIO_34,Gpio.EDGE_BOTH);

        pinMode(GPIO_32,Gpio.DIRECTION_IN);
        setEdgeTrigger(GPIO_32,Gpio.EDGE_BOTH);

        pinMode(GPIO_10,Gpio.DIRECTION_IN);
        setEdgeTrigger(GPIO_10,Gpio.EDGE_BOTH);

        pinMode(GPIO_174,Gpio.DIRECTION_IN);
        setEdgeTrigger(GPIO_174,Gpio.EDGE_BOTH);

        pinMode(GPIO_175,Gpio.DIRECTION_IN);
        setEdgeTrigger(GPIO_175,Gpio.EDGE_BOTH);


    }

    @Override
    public void loop() {
        //nothing to do here

    }

    @Override
    void digitalEdgeEvent(Gpio pin, boolean value) {
        println("digitalEdgeEvent"+pin+", "+value);


        if(pin==GPIO_39 && value==LOW ) {
            i=i++;
            j=1;
            println("pin39");
        }
        if (pin==GPIO_35 && value==LOW){
            i++;
            j=2;
        }
        if (pin==GPIO_34 && value==LOW){
            i++;
            j=3;
        }
        if (pin==GPIO_32 && value==LOW){
            i++;
            j=4;
        }
        if (pin==GPIO_10 && value==LOW){
            i++;
            j=5;
        }
        if (pin==GPIO_174 && value==LOW){
            i++;
            j=6;
        }



        if (pin==GPIO_175 && value==LOW && i==1 && j==1){
            printCharacterToScreen('a');
            i=0;j=0;
            println("print");
        }
        else if (pin==GPIO_175 && value==LOW && i==2 && j==1) {
            printCharacterToScreen('b');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==3 && j==1) {
            printCharacterToScreen('c');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==4 && j==1) {
            printCharacterToScreen('d');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==5 && j==1) {
            printCharacterToScreen('e');
            i=0;j=0;
        }


        if(pin==GPIO_175 && value==LOW && i==1 && j==2){
            printCharacterToScreen('f');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==2 && j==2) {
            printCharacterToScreen('g');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==3 && j==2) {
            printCharacterToScreen('h');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==4 && j==2) {
            printCharacterToScreen('i');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==5 && j==2) {
            printCharacterToScreen('j');
            i=0;j=0;
        }


        if(pin==GPIO_175 && value==LOW && i==1 && j==3){
            printCharacterToScreen('k');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==2 && j==3) {
            printCharacterToScreen('l');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==3 && j==3) {
            printCharacterToScreen('m');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==4 && j==3) {
            printCharacterToScreen('n');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==5 && j==3) {
            printCharacterToScreen('o');
            i=0;j=0;
        }


        if(pin==GPIO_175 && value==LOW && i==1 && j==4){
            printCharacterToScreen('p');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==2 && j==4) {
            printCharacterToScreen('q');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==3 && j==4) {
            printCharacterToScreen('r');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==4 && j==4) {
            printCharacterToScreen('s');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==5 && j==4) {
            printCharacterToScreen('t');
            i=0;j=0;
        }


        if(pin==GPIO_175 && value==LOW && i==1 && j==5){
            printCharacterToScreen('u');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==2 && j==5) {
            printCharacterToScreen('v');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==3 && j==5) {
            printCharacterToScreen('w');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==4 && j==5) {
            printCharacterToScreen('x');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==5 && j==5) {
            printCharacterToScreen('y');
            i=0;j=0;
        }


        if(pin==GPIO_175 && value==LOW && i==1 && j==6){
            printCharacterToScreen('z');
            i=0;j=0;
        }
        else if (pin==GPIO_175 && value==LOW && i==2 && j==6) {
            printCharacterToScreen(' ');
            i=0;j=0;
        }


    }
}
