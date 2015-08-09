package com.jude.happiness.model.bean;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class Gift {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Gift(String id, String image, String name, int cost, String intro) {

        this.id = id;
        this.image = image;
        this.name = name;
        this.cost = cost;
        this.intro = intro;
    }

    private String image;
    private String name;
    private int cost;
    private String intro;

}
