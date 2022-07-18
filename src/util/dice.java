package util;

public class dice {
     public static int getNumberDice(int min, int max){
          double v = Math.random() * ((max - min + 1) + max);
          return (int) v;
     }
}

    //int dice = random.nextInt((max-min+1)+max);
/*public static int getNumberDice(Limit limit){
          return (int)(Math.random()*(limit.getMax()- limit.getMin()+1))+ limit.getMax();
     }*/