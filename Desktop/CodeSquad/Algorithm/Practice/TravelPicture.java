package Practice;

import java.util.*;

public class TravelPicture {
    /*
    * 3. 여행 사진
        ex) 입력(string으로 전체가 들어옴)
            photo1.jpg, Seoul, 2017-06-12 13:01:35
            photo2.jpg, Incheon, 2017-07-12 11:04:42
            photo3.jpg, Incheon, 2017-07-11 11:04:42
            photo4.jpg, Incheon, 2017-07-10 11:04:42
            test9878.png, Seoul, 2017-07-03 13:03:31
            test12334.png, Seoul, 2017-07-02 13:03:31
            test34543.png, Seoul, 2017-07-01 13:03:31
            test86.png, Seoul, 2017-07-11 13:03:31
            test264.png, Seoul, 2017-07-07 13:03:31
            test412.png, Seoul, 2017-07-15 13:03:31
            test65.png, Seoul, 2017-07-19 13:03:31
            test43.png, Seoul, 2017-07-18 13:03:31
            test2145.png, Seoul, 2017-07-12 13:03:31
            test76.png, Seoul, 2017-07-09 13:03:31
            test484.png, Seoul, 2017-07-10 13:03:31
            test266.png, Seoul, 2017-07-13 13:03:31
            test050.png, Seoul, 2017-07-14 13:03:31

            입력의 날짜/시간은 yyyy-MM-dd HH:mm:ss 형식이고, 같은 도시에서 같은 시간에 찍힌 사진은 없다.
                -> '도시명 + 숫자 + . + 확장자' 형식으로 바꿔서 출력하는데 '숫자'는 같은도시끼리 모아서 날짜순서로 정렬했을때 순서를 의미,
                    '숫자'의 최대 자리수가 두자리면 한자리인 수들은 0으로 자리수를 맞춰야 함

ex) 출력(string으로 전체 출력)
Seoul08.jpg
Incheon2.jpg
Incheon1.jpg
Seoul03.png
Seoul02.png
Seoul01.png
Seoul07.png
Seoul04.png
Seoul12.png
Seoul14.png
Seoul13.png
Seoul09.png
Seoul05.png
Seoul06.png
Seoul10.png
Seoul11.png
    * */
    public static void main(String[] args) {
        Map<String, String> cityMap = new TreeMap<>();
        Map<String, String> formatMap = new HashMap<>();
        String input =  "photo1.jpg, Seoul, 2017-06-12 13:01:35\n" +
                        "photo2.jpg, Incheon, 2017-07-12 11:04:42\n" +
                        "photo3.jpg, Incheon, 2017-07-11 11:04:42\n" +
                        "photo4.jpg, Incheon, 2017-07-10 11:04:42\n" +
                        "test9878.png, Seoul, 2017-07-03 13:03:31\n" +
                        "test12334.png, Seoul, 2017-07-02 13:03:31\n" +
                        "test34543.png, Seoul, 2017-07-01 13:03:31\n" +
                        "test86.png, Seoul, 2017-07-11 13:03:31\n" +
                        "test264.png, Seoul, 2017-07-07 13:03:31\n" +
                        "test412.png, Seoul, 2017-07-15 13:03:31\n" +
                        "test65.png, Seoul, 2017-07-19 13:03:31\n" +
                        "test43.png, Seoul, 2017-07-18 13:03:31\n" +
                        "test2145.png, Seoul, 2017-07-12 13:03:31\n" +
                        "test76.png, Seoul, 2017-07-09 13:03:31\n" +
                        "test484.png, Seoul, 2017-07-10 13:03:31\n" +
                        "test266.png, Seoul, 2017-07-13 13:03:31\n" +
                        "test050.png, Seoul, 2017-07-14 13:03:31\n";
        String[] allSplited = input.split("\n");
        for(int i = 0; i < allSplited.length; i++) {
            String[] lineSplited = allSplited[i].split(", ");
            cityMap.put(lineSplited[2], lineSplited[1]);
            formatMap.put(lineSplited[2], lineSplited[0]);
        }

        List<String> keySetList = new ArrayList<>(cityMap.keySet());
        Collections.sort(keySetList, (o1, o2) -> cityMap.get(o1).compareTo(cityMap.get(o2)));

        for(String key : keySetList) {
            System.out.println(key + " : " + cityMap.get(key) + " : " + formatMap.get(key));
        }
    }
}
