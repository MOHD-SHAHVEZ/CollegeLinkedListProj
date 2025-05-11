package Stack_By_YT; 
public class ToweOfHanoiQues {

    public static void towerOfHanio(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer disk: " + n + " From " + src + " to " + dest);
            return;
        }
        // Disk Transfer: 
        towerOfHanio(n-1, src, dest, helper);
        System.out.println("Transfer disk: " + n + " From " + src + " to " + dest);
        towerOfHanio(n-1, helper, src, dest);

    }


    public static void main(String[] args) {
        int n = 4; 
        towerOfHanio(n, "S", "H", "D");
    }
}
