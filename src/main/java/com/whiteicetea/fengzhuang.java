package com.whiteicetea;

public class fengzhuang {
    public static void main(String[] args) {
        Personm p1 = new Personm("234",15,454545,"asd");

        System.out.println(p1.getAge());
    }
}

class Personm{
    public String name;
    private int age;
    private double salary;
    private String job;


    public Personm(String name, int age, double salary, String job) {
        setName(name);
        setAge(age);
        setSalary(salary);
        setJob(job);
    }
    public void setName(String name){

        this.name = name;
    }
    public void setAge(int age){
        if(age > 120||age<0){
            this.age = 18;
        }else{
            this.age = age;
        }

    }
    public void setSalary(double salary){
        this.salary = salary;

    }
    public void setJob(String job){
        this.job = job;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public String getJob(){
        return job;
    }
}
