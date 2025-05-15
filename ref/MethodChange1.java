package ref;

    /*
        메서드를 호출할 때 사용하는 매개변수(파라미터)도 결국 변수일 뿐이다. 따라서 메서드를 호출할 떄
        매개변수에 값을 전달하는 것도 앞서 설명한 내용과 같이 값을 복사해서 전달한다.
     */

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 메서드 호출 전 a = 10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // 메서드 호출 후 a = 10

    }

    static void changePrimitive(int x) {
        x = 20;
        // 메서드 안에서 x = 20으로 새로운 값 대입
        // 결과적으로 x의 값만 20으로 변경되고, a의 값은 10으로 유지된다

    }
}
