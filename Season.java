package practice4;
import java.lang.*;
public enum Season {
    WINTER(-20){
        public String getDescription() {
            return "Холодное время года ";
        }
    },
    AUTUMN(13),
    SPRING(9),
    SUMMER(24);
    private int averageTemperature;
    Season(int averageTemperature){
        this.averageTemperature=averageTemperature;
    }
    public int getAverageTemperature() {
        return averageTemperature;
    }
    public String getDescription(){
        return "Теплое время года ";
    }
}
