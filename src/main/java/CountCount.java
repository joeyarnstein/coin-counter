

public class CountCount {
  public static String CountCents(String cents){
    int centTotal = Integer.parseInt(cents);




    // while cents is larger than 100, add to dollar count, remove 100
    Integer dollars = 0;
    while ( centTotal>=100 ){
      centTotal -= 100;

      dollars += 1;
    }
    String outDollars = Integer.toString(dollars);
    System.out.println("dolls " +dollars);


    //same for quarters
    Integer quarters = 0;
    while ( centTotal >= 25 ){
      centTotal -= 25;
      quarters += 1;
    }
    String outQuarts = Integer.toString(quarters);
    System.out.println("dolls " +dollars);




    System.out.println("leftOver " + centTotal);

    String outTotal = Integer.toString(centTotal);

    if (centTotal == 1){
      outTotal = "$" +outDollars+ " " + outQuarts + " quarters" + " and " + outTotal + " penny.";
    } else {
      outTotal = "$" +outDollars+ " " + outQuarts + " quarters" + " and " + outTotal + " pennys.";
    }

    System.out.println(outTotal);
    return outTotal ;
  }
}
