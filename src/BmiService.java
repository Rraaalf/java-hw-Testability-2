public class BmiService {
    public int calculator(double heightInMeters, int weightInKilograms){
        return (int) (weightInKilograms / Math.pow(heightInMeters, 2));
    }
}
