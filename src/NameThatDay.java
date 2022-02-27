import java.util.Scanner;

public class NameThatDay {
  public static void main(String[] args) {
    new NameThatDay().go();
  }
  public void go(){

    Scanner inPut = new Scanner(System.in);
    int day =0;
    String string;

    while (day <=7){

      System.out.print("Enter day of week (1-7) : ");
      day = inPut.nextInt();

      switch (day) {

        case 1:
          string = "I call that day Monday";
          break;
        case 2:
          string = "I call that day Tuesday ";
          break;
        case 3:
            string = "I call that day Wednesday";
            break;
        case 4:
          string = "I call that day Thursday";
          break;
        case 5:
          string = "I call that day Friday";
          break;
        case 6:
          string = "I call that day Saturday";
          break;
        case 7:
          string = "I call that day Sunday";
          break;
        default:
          string = "I call thar day UNKNOWN";
      }
      System.out.println(string);
      }
  }
}

