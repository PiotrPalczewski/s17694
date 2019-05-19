package domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OMW {

    private int id;
    private String name;
    private OMWMain main;
    private OMWClouds clouds;
    private OMWWind wind;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public OMWMain getMain() {
        return main;
    }
    public void setMain(OMWMain main){
        this.main=main;
    }

    public OMWClouds getClouds(){
        return clouds;
    }
    public void setClouds(OMWClouds clouds){
        this.clouds=clouds;
    }

    public OMWWind getWind(){
        return wind;
    }
    public void setWind(OMWWind wind) {
        this.wind = wind;
    }
}
