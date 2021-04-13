public class whileLoopTest {


    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        whileLoopTest test = new whileLoopTest();
        test.loop(a,b);
    }


    public void loop(int a, int b){
        while(a > b){
            b++;
        }
    }

}
