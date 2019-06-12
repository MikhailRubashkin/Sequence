
//Создать массив из 4 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
//   Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью

public class Main {

    public static void main(String[] args) {



       int [] Mas = new int[4];
       for (int i = 0; i<Mas.length; i++){
           Mas[i] = (int)(Math.random()*90+10);
           System.out.println(Mas[i]+" ");
       }
       for (int i = 0; i<Mas.length; i++){
           if (i>0){
               if (Mas[i-1]>=Mas[i]){
                   System.out.println("Прогрессия не возрастающая");
                   break;
               }
           }
           if (i==Mas.length-1){
               System.out.println("Последовательность строго возрастающая");
           }
       }
    }
}
