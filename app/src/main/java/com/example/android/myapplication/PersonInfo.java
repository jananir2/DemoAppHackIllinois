package com.example.android.myapplication;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private Integer age;
    private String school;

    public ArrayList<PersonInfo> peopleList = new ArrayList<>();

    public String getData() {
        String str = "";
        try {
            URL url = new URL("https://raw.githubusercontent.com/patrickfeltes/sample-hackillinois/master/people.json/");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            while (null != (str = br.readLine())) {
                System.out.println(str);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return str;
    }


    public PersonInfo(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
