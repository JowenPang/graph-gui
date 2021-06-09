package sample;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;


import java.util.ArrayList;
import java.util.List;

//singleton class
public class Component {
    static Component com = new Component();
    ArrayList<Circle> circleList = new ArrayList<Circle>();
    ArrayList<Line> lineList = new ArrayList<Line>();
    ArrayList<Location> location = new ArrayList<>();
    ArrayList<ImageView> truckList = new ArrayList<>();
    Tour mctsTour;

    ArrayList<Vehicle> dfsVehicleList = new ArrayList<>();
    StringBuilder dfsInfo = new StringBuilder();

    private Component(){}

    public static Component getInstance(){
        return com;
    }

    public void addCircle(Circle c){
        circleList.add(c);
    }

    public void addLine(Line l){
        lineList.add(l);
    }

    public void setCircleList(ArrayList<Circle> c){
        circleList = c;
    }

    public void setTruckList(ArrayList<ImageView> tl){
        truckList = tl;
    }

    public void setLineList(ArrayList<Line> l){
        lineList = l;
    }

    public ArrayList<Circle> getCircleList(){
        return circleList;
    }

    public ArrayList<Line> getLineList(){
        return lineList;
    }

    public void setLocationList(ArrayList<Location> list){
        location = list;
    }

    public ArrayList<Location> getLocationList(){
        return location;
    }

    public void setMctsTour(Tour t){
        mctsTour = t;
    }

    public Tour getMctsTour() {
        return mctsTour;
    }

    public void clearMCTSTour(){
        mctsTour = null;
    }

    public ArrayList<Vehicle> getDfsVehicleList() {
        return dfsVehicleList;
    }

    public void setDfsVehicleList(ArrayList<Vehicle> dfsVehicleList) {
        this.dfsVehicleList = dfsVehicleList;
    }

    public StringBuilder getDfsInfo() {
        return dfsInfo;
    }

    public void setDfsInfo(StringBuilder dfsInfo) {
        this.dfsInfo = dfsInfo;
    }
}