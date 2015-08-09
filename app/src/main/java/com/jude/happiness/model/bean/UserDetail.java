package com.jude.happiness.model.bean;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class UserDetail {
    private String name;
    private String face;
    private String realName;
    private String gender;
    private String height;
    private String weight;
    private String hobby;
    private String emotion;
    private String manifesto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getManifesto() {
        return manifesto;
    }

    public void setManifesto(String manifesto) {
        this.manifesto = manifesto;
    }

    public UserDetail(String name, String face, String realName, String gender, String height, String weight, String hobby, String emotion, String manifesto) {
        this.name = name;
        this.face = face;
        this.realName = realName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.emotion = emotion;
        this.manifesto = manifesto;
    }
}
