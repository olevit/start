package com.company.JavaTheCopmleteReference2019;

public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("Name chosenis: " + name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("Puppy age is: " + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable Value: " + myPuppy.puppyAge);
    }
}
