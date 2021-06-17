public class Helloworld {

    public static void main(String[] args) {
        // int hour = 3; int minute = 5;
        // System.out.println(hour + "시간" + minute + "분");
        // int totalMinute = (hour+60)+minute;
        // System.out.println("총 "+totalMinute+"분");

        // int x = 3; int y=5;
        // System.out.println("x:" + x + ",y:" + y);
        // int temp = x;
        // x=y;
        // y=temp;
        // System.out.println("x:" + x + "y:" + y);

        // int v1=15;
        // if(v1>10)
        // {
        // int v2;
        // v2 = v1 - 10;
        // }
        // int v3=v1+v2+5; //v2변수를 사용할 수 없기 때문에 컴파일 에러 발생

        // int var1 = 0b1011;
        // int var2 = 0206;
        // int var3 = 365;
        // int var4 = 0xB3;

        // System.out.println("var1: " + var1);
        // System.out.println("var2: " + var2);
        // System.out.println("var3: " + var3);
        // System.out.println("var4: " + var4);

        // long balance = 3000000000L; //L을 붙여서 선언을 해야함
        // long var1= 10;
        // long var2 = 20L;/
        // long var3 = 10000000000L;

        // System.out.println(var1)/
        // System.out.println(var2);
        // System.out.println(var3);

        // 유니코드는 정수이므로 char도 정수 타입에 속함.
        // 따라서 char 변수에 10진수 또는 16진수 형태로 유니코드를 저장할 수 있음
        // char c = 65;
        // char c= 0x0041;
        // 정수에 유니코드를 넣을 경우에는 유니코드 자체가 출력된다.
        // int var = 'A';
        // System.out.println(var); 65출력

        // 문자열은 String으로 출력을 해야함 (대문자 S)
        // String name = "홍길동";
        // String job = "프로그래머";
        // System.out.println(name);
        // System.out.println(job);

        // 문자열 내부에 역슬래시(\)가 붙은 문자를 사용할 수 있음
        // 이것을 이스케이스 문자라고 함
        // 이스케이프 문자를 사용하면 문자열 내부에 특정 문자를 포함할 수 있음
        // \t \n \r \" \' \\ \u 16진수

        //String str = "나는 \"자바\"를 좋아합니다.";
        //System.out.println(str);
        
        // String str = "번호\t이름\t나이";
        //System.out.println(str)

        // String str="홍길동\n안녕";
        // System.out.println(str);
        
        
        //자바는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에 double 타입 변수에 저장해야함
        //float를 쓰려면 float var = 3.14f;처럼 뒤에 f를 붙여야함
        //자바는 참과 거짓을 으미하는 논리 리터럴로 true와 false를 사용함
        //논리 리터럴은 다음과 같이 1byte 크기의 boolean 타입 변수에 저장할 수 있음
        //boolean stop = true;
        //boolean state = false;
        // if(stop) {
        //     System.out.println("중지합니다.");
        // }


        //자동타입변환은 말 그대로 자동으로 타입 변환이 일어나는 것을 의미함
        //자동 타입 변환은 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생함
        //long longValue = 50000000000L;
        //float floatValue = longValue;    5.0E9f로 저장됨
        //douable doubleValue = longValue; 5.0E9로 저장됨
        //char charValue = 'A';
        //int intValue = charValue;   65가 저장됨
        //단 char 타입보다 허용범위가 작은 byte 타입은 char 타입으로 자동 타입 변환될 수 없다
        //char 타입의 허용범위는 음수를 포함하지 않는데, byte 타입은 음수를 포함하기 때문이다.

        // byte byteValue = 10;
        // int intValue = byteValue;
        // System.out.println("intValue:" + intValue);

        // char charValue='가';
        // int intValue=charValue;
        // System.out.println("intValue:" +intValue);

        // intValue=50;
        // long longValue=intValue;
        // System.out.println("longValue:" +longValue);

        // longValue=100;
        // float floatValue=longValue;
        // System.out.println("floatValue:"+floatValue);

        // floatValue=100.5F;
        // double doubleValue=floatValue;
        // System.out.println("doubleValue:" +doubleValue);

        //강제 타입 변환
        //큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 나눠서 저장하는 것
        // int intValue=44032;
        // char charValue=(char) intValue;
        // System.out.println(charValue);
        // //가
        // long longValue=500;
        // intValue=(int) longValue;
        // System.out.println(intValue);
        // //500
        // double doubleValue=3.14;
        // intValue = (int) doubleValue;
        // System.out.println(intValue);
        // //3

        //정수 연산에서의 자동 타입 변환
        //정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int 타입보다 작은 byte, short 타입의 변수는 int 타입으로 자동 타입 변한되어 연산을 수행함
        // byte x=10;
        // byte y=20;
        //byte result = x + y; 컴파일 에러
        // int result=x+y;

        
    }
}