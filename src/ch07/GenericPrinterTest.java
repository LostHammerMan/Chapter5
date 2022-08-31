package ch07;



public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        // 제네릭 클래스를 사용하는 클래스에서 타입 지정
        GenericPrinter<ch07.Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        ch07.Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());
    }
}
