public class Main {

    public static void main(String[] args) {

        Array<String> arr = new Array<>(20);

        for (int i = 0; i < 10; i++) {
            arr.addLast(i + "");
        }

        System.out.println(arr);

        for (int i = 0; i < 3; i++) {
            arr.removeLast();
        }

        System.out.println(arr);
    }
}
