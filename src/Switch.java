import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {
    new Switch().go();
  }

  public void go(){
    Scanner in = new Scanner(System.in);
    int number;
    String text;

    System.out.print("enter number: ");
    number = in.nextInt();
    /*
    if (number == 2)
      text ="one";

    else if (number ==2)
      text ="two";

    else if (number == 3)
      text ="three";

    else
      text = "unknowen number";
    */

    switch (number) {

      case 1:
        text = "one";
        break;
      case 2:
        text = "two";
        break;
      case 3:
        text = "three";
        break;
      case 4,5,6:
        text ="Between four and six";
        break;
      default:
        text = "Unknown number";
    }
    System.out.println(text);

    }
  }

