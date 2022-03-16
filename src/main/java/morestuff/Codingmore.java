package morestuff;

public class Codingmore {
    public static void main(String[] args) {
        int prize = 0;

        switch (prize) {
            case 1:
                System.out.println("You won an Audi");
                break;
            case 2:
                System.out.println("You won a BMW");
                break;
            case 3:
                System.out.println("You won a Volkswagen");
                break;
            case 4:
                System.out.println("You won a Toyota");
            default:
                System.out.println("Here you go a Chevy");

        }


        int age = 17;

        String result = (age <= 20) ? "Get out of here! you cannot buy beer!" : "You look old enough to buy beer";
        System.out.println(result);


        if(age > 18){
            System.out.println("Where is your license");
        } else if (age == 17) {
            System.out.println("Where is your permit");
        } else {
            System.out.println("You are going to jail");
        }
    }
}
