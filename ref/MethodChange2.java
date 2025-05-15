package ref;

public class MethodChange2 {
    /*
        참조형과 메서드 호출

     */

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        System.out.println("dataA=" + dataA);
        changeReference(dataA); // 참조값 넘김
        // 메서드 내부에서 매개변수로 전달된 객체의 멤버 변수를 변경하면 호출자의 객체도 변경된다.
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
    }

    public static void changeReference(Data dataX){
        System.out.println("dataX=" + dataX);
        dataX.value = 20;
    }
    // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
    // 자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다.
}
