package practice4;
public class Season1 {
    public static void main(String[] args){
      Season season = Season.SUMMER;
          System.out.println("My favourite season is "+season+", "+ season.getDescription()+", "+season.getAverageTemperature());
          print(Season.WINTER);
          printAll();
      }
    public static void print(Season season){
        switch (season){
            case WINTER:
                System.out.println("Я люблю Зиму ");
                break;
            case SUMMER:
                System.out.println("Я люблю Лето ");
                break;
            case SPRING:
                System.out.println("Я люблю Весну ");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень ");
                break;
        }
    }
    public static void printAll(){
        for (Season s:Season.values()){
            System.out.println(s+" "+s.getAverageTemperature()+ " "+ s.getDescription());
        }
    }
}
