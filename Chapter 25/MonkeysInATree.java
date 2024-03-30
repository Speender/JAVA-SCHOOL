/*This program prints the 5 little monkeys nursery rhymes using counting loop
Name: Ramie Theofil D. Pondar
Date: 03/29/24 */
public class MonkeysInATree {
    public static void main(String[] args) {
        //declaration inside the for loop
        for(int i = 5; i > 0; i--){
            
            String str;

            if(i == 5)
                str = "Five";
            else if(i == 4)
                str = "Four";
            else if(i == 3)
                str = "Three";
            else if(i == 2)
                str = "Two";
            else
                str = "One";
            //output
            System.out.println(str + " little monkeys swinging in a tree");
            System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
            System.out.println("Along came the crocodile as quiet as can be");
            System.out.println("and SNAP!\n");
        }

        for(int i = 0; i < 2; i++){
            System.out.println("No little monkeys swinging in a tree");
        }
    }
}
