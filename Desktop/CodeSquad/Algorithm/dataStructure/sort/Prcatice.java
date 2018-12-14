package dataStructure.sort;

public class Prcatice {

    public class Person {
        private String name;
        private int money;
        private int height;
        private int weight;

        public Person(String name, int money, int height, int weight) {
            this.name = name;
            this.money = money;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", money=" + money +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void main(String[] args) {
        Prcatice prcatice = new Prcatice();
        Person[] people = {
                prcatice.new Person("LEE", 1000, 100, 100)
                , prcatice.new Person("CHOI", 500, 10, 10)
                , prcatice.new Person("KIM", 700, 5, 200)

        };

        /*long start = System.currentTimeMillis();
        Arrays.sort(people, (o1, o2) -> (o2.money - o1.money));
        long end = System.currentTimeMillis();
        System.out.println(String.format("%.3fs", (double)(end - start) / 1000));
        printArr(people);*/

        int[] arr = {5, 4, 2, 1, 3};
        //bubbleSort(arr);
        insertionSort(arr);
        //printArr(arr);
    }

    public static void printArr(Person[] people) {
        for (int i = 0; i < people.length; i++)
            System.out.println(people[i].toString());
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    /*Function<Person[], Person[]> operator = (people) -> {
        //Arrays.sort(people, (o1, o2) -> (o2.money - o1.money));
        people;
    };*/

    /*
        Counting sort, Radix sort
        Reflection : class 타입을 알려주는
        Proxy :
        Proxy Pattern
    */

    /*
        Bubble Sort loop ivaliant 끝에서 i번째부터는 정렬되어있다.
          --> Bubble < 선택정렬이 조금 더 빠름 왜? swap하는 횟수가 다르기 때문에
          --> 삽입정렬이 좀 더 빠름 --> 정렬이 된게 많으먄 빠르다(왜냐면 정렬된것은 별도로 작업을 하지않고 그대로 두기떄문에)
          --> 삽입정렬은 최상의 조건에서는 (N)
    */

    /* 퀵솔트는 앞 중간 뒤에서 가장 작은 값! */

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArr(arr);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArr(arr);
        }
    }
}
