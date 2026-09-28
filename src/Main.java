//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //declare parallel arrays to hold the row and column labels for report

    String[] consoles = {"PS5","XBOX","SWITCH"};
    String[] cities = {"CAPE TOWN","PORT ELIZABETH","PRETORIA"};
    int[][] yearlySales = {{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};  //declare 2D array to store values for each console and city

    int[] totalSales = new int[cities.length];
    String highestSales = "";
    String DASHES = "-".repeat(75);

    System.out.println(DASHES);
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println(DASHES);

    System.out.printf("%-18s"," ");

    for(int i = 0; i < consoles.length; i++){
        System.out.printf("%-18s",consoles[i]);
    }

    System.out.println();

    for(int i = 0; i < yearlySales.length; i++){
        System.out.printf("%-18s",cities[i]);
        for(int j = 0; j < yearlySales[i].length; j++){
            System.out.printf("%-18d",yearlySales[i][j]);

            totalSales[i] += yearlySales[i][j]; //accumulate running total for this row/column as we loop

        }
        System.out.println();
    }

    System.out.println(DASHES);
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println(DASHES);

    for(int i = 0; i < totalSales.length; i++){
        System.out.printf("%-18s",cities[i]);
        System.out.printf("%-18d",totalSales[i]);
        System.out.println();
    }

    int indexOfMax = 0;

    for(int i = 0; i < totalSales.length; i++){

        if(totalSales[i] > totalSales[indexOfMax]){
            indexOfMax = i;

        }
    }

    System.out.println("\nCITY WITH THE MOST SALES: " + cities[indexOfMax]);
    System.out.println(DASHES);


}
