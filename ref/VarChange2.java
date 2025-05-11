package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;// dataA와 dataB에 들어있는 참조값은 같다. 둘다 같은 참조값 가짐

        System.out.println("dataA 참조값=" + dataA); // ref.Data@2f4d3709
        System.out.println("dataB 참조값=" + dataB); // ref.Data@2f4d3709
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20 a와b가 같은 참조값을 가지고있기 떄문에 20임
        System.out.println("dataB.value = " + dataB.value); // 20


        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30
    }

    /*
        여기서 핵심
        Data dataB = dataA라고 했을 때 변수에 들어있는 값을 복사해서 사용한다는 점
        그런데 그 값이 참조값이다.
        dataA 와 dataB는 같은 참조값을 가지게 되고, 두 변수는 같은 인스턴스를 참조하게 된다.

     */
}
