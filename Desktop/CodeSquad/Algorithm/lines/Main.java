package lines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<String> users =  new ArrayList<String>();
        ArrayList<String> results = new ArrayList<String>();
        HashMap<String,String> userValue = new HashMap<String,String>();
        try (final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(br.readLine());


            for (int i = 0; i < n; i++) {
                final StringTokenizer tokenizer = new StringTokenizer(br.readLine());
                String method = tokenizer.nextToken();
                String url = tokenizer.nextToken();
                String body = null;

                //body value가 여러개 인지는 확인 못했음. 여러개라면 수정이 필요
                if (tokenizer.hasMoreTokens()) {
                    body = tokenizer.nextToken();
                    body = body.substring(body.indexOf("=")+1,body.length());
                    //System.out.println(body);

                }

                // url을  /(슬래쉬) 문자 기반으로 잘라서 따로 저장하기
                StringTokenizer urlTokens = new StringTokenizer(url,"/");
                String[] urlList = new String[urlTokens.countTokens()];
                int tmpCnt =0;
                while(urlTokens.hasMoreTokens()) {
                    urlList[tmpCnt] = urlTokens.nextToken();
                    tmpCnt++;
                }

                // url 기반 API 유효성 확인
                if(!urlList[0].toString().equals("users")  && urlList.length <2){// users가 아니고 2보다 길이가 작을때
                    results.add("404 NOT_FOUND");
                    continue;
                }
                else if(urlList.length == 3 && !urlList[2].toString().equals("data")){// 3번째 url이 data가 아닐때
                    results.add("404 NOT_FOUND");
                    continue;
                }

                if(method.toString().equals("POST")){
                    //사용자 유효성 검사 ( 데이터를 생성하는데 유저가 없는 경우 또는 유저 중복 등록 경우)
                    if (users.contains(urlList[1].toString())) {//사용자 등록 여부 확인
                        //에러 메시지 ArrayList에 저장
                        results.add("error");
                        continue;
                    }


                    //사용자 생성         POST /users/{user}
                    if(urlList.length == 2) {

                        users.add(urlList[1].toString());
                        results.add("생성 성공 문자열");
                        continue;
                    }
                    //사용자 데이터 생성    POST /users/{user}/data value=WHERE_IS_SALLY
                    if(urlList.length == 3){
                        //userValue.put(urlList[2].toString(),body);
                        continue;

                    }
                }
                if(method.toString().equals("GET")) {
                    // 사용자 등록 여부 확인 ( 등록되지 않은 사용자인데 데이터 조회하는것 방지
                    //Post부분과 중복되는데 고칠 수 있으면 고치기
                    if (users.contains(urlList[1].toString())) {//사용자 등록 여부 확인
                        //에러 메시지 ArrayList에 저장
                        continue;
                    }
                    // 사용자 데이터 조회   GET /users/{user}/data

                }

            }

        }
        for(int r=0;r<results.size();r++){
            System.out.println(results.get(r));
        }
    }
}
