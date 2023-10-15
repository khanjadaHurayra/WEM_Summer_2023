package javaHwOne;
public class EligibleForVote {

    //Write a Java code to check if a person is eligible to vote based on age.
    int age;

    public void vote(int a) {

        this.age = a;

        if (age >= 18) {

            System.out.println("He/She is qualify for vote :D");
        } else {
            System.out.println("Not Qualify for Vote ;(");
        }
    }

    public static void main(String[] args) {

        EligibleForVote obj = new EligibleForVote();
        obj.vote(18);
    }
}
