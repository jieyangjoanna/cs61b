package com.test.JunitPractice;

public class Dog{

    public int WeightInPounds;
    public int Size;

    public Dog(int weight, int size){
        WeightInPounds = weight;
        Size = size;

    }

    public void EatFood(){
        if (WeightInPounds<10 && Size <5){
            System.out.println("Dog Food");
        }
        else {
            System.out.println("Human Food");
        }
    }

}




