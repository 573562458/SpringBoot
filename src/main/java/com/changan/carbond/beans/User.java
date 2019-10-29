package com.changan.carbond.beans;

public class User {
    private Integer id;

    private String age;

    private String name;

    private String weight;

    public Integer getId() {
        return id;
    }
    public User(Integer id,String age,String name,String weight){
        this.setId(id);
        this.setAge(age);
        this.setName(name);
        this.setWeight(weight);
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }
}