public class Main {
    public void main() {

        //intialized variables of prices that i decided on
        int springMaitenanceCost = 450;
        int summerMaitenanceCost = 550;
        int fallMaitenanceCost = 230;
        int winterMaitenanceCost = 4120;
        int totalCost = 0;

        //sum operation to find total price
        totalCost = springMaitenanceCost + summerMaitenanceCost + fallMaitenanceCost + winterMaitenanceCost;

        //printed out costs of each season and final cost
        System.out.println("The cost of spring maitenance was $" + springMaitenanceCost);
        System.out.println("The cost of summer maitenance was $" + summerMaitenanceCost);
        System.out.println("The cost of fall maitenance was $" + fallMaitenanceCost);
        System.out.println("The cost of winter maitenance was $" + winterMaitenanceCost);
        System.out.println("The total cost of maitenance this year was $" + totalCost);
    }
}
