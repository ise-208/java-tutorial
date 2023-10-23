public class Main {

    public static void main(String[] args) {
        EnumSample enumSample = EnumSample.Apple;
        System.out.println(enumSample.getJapanese());
        RecordSample recordSample1 = new RecordSample(1, 2);
        RecordSample recordSample2 = new RecordSample(1, 2);

        System.out.println(recordSample1.x());
        System.out.println(recordSample2.y());
        if (recordSample1.equals(recordSample2)) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }
    }
}
