package zTest;

public class ProduceString {
    public static void main(String[] args) {
        String str = "INSERT INTO user_test VALUES($, 'mark#', '4297f44b13955235245b2497399d7a93');";
        for (int i = 1000; i < 1080; i++) {
            int num = i - 1;
            String temp = str.replace("$", String.valueOf(i)).replace("#", String.valueOf(num));
            System.out.println(temp);
        }
    }
}
