package org.javaCourse.Lambda;

import java.util.Arrays;
import java.util.List;

class NewData{
    private String data;

    public NewData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NewData{" +
                "data='" + data + '\'' +
                '}';
    }
}
public class ForEachLambda {
    public static void main(String[] args) {
        List<NewData> list=Arrays.asList(new NewData("saranya"),new NewData("welcome"),new NewData("raj"));
        list.forEach(temp-> {
            System.out.println(temp.getData());
            if(temp.getData().equals("saranya"))
                System.out.println("matched");

        });
    }
}
