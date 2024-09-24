import java.util.Scanner;
public class AverageWeight{
    public static void main(String [] args){
        // Scanner s = new Scanner(System.in);
        // int count = s.nextInt();
        // int [] weights = new int [count];
        // for(int i = 0; i < count; i++){
        //     weights[i] = s.nextInt();
        // }
        int [] weights = {30, 45, 55, 58, 47, 60, 69, 55, 51, 49};  // Output : 51.9
        System.out.println(avgWeight(weights));
    }
    public static double avgWeight(int [] weights){
        int sumOfWeights = 0;
        for(int weight : weights){
            sumOfWeights += weight;
        }
        int noOfPeople = weights.length;
        double avgWeight = (double) sumOfWeights/noOfPeople;
        return avgWeight;
    }
}