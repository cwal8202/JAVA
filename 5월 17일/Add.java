public class Add {
    public static void main(String args []){
        //변수이름
        //영소문자로 시작 (대소문자를 구별) abc aBC 다름
        //숫자도 올수 있음
        //공백 X 
        // ex) bookTitle or book_title book-title

        // int : 정수형 data type (자료형)
        int x; // 변수 선언 (variable declare)
        int y;
        int sum;
        
        // 초기화 (initialize) 변수에 처음으로 값을 집어 넣는것.
        x = 100; // 대입연산자 (assignment) 오른쪽에 있는것을 왼쪽으로 집어 넣는다.
        y = 200;
        sum = x + y;

        System.out.println(sum);
        //return;     종료한다는 뜻이다 중괄호랑 같은느낌. return; 이후엔 적어도 error가 나고 안뜬다.
        
        System.out.println(x - y);

        int minus;
        minus = x - y;
        System.out.println(minus);
    }
}

