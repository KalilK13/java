package phaseomatic;

public class Main {
    public static void main(String[] args) {
        // make three sets of words to choose from. Add your own!
        String [] wordListOne = {"Large","Small"
                        ,"Medium","Xlarge","Xsmall", "Kids"};
        String[] wordListTwo = {"brown", "blue",
                "black", "pink", "orange", "gray"};
        String [] wordListThree = {"jeans", "t-shirt",
            "hoodie", "jacket", "shorts"};
// find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
// generate three random numbers
        int rand1 = (int) (Math.random () * oneLength);
        int rand2 = (int) (Math.random () * twoLength);
        int rand3 = (int) (Math.random () * threeLength);
// now build a phrase
        String phrase = wordListOne [rand1] + " " + wordListTwo[rand2]
                + " " + wordListThree [rand3];
// print out the phrase
        System.out.println ("The customer wants a " + phrase);
    }
}
