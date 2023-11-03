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

        OptionalSample optionalSample = new OptionalSample();
        optionalSample.sample1("hello");
        optionalSample.sample1(null);
        System.out.println(optionalSample.sample2("hello"));
        System.out.println(optionalSample.sample2(null));

        InterfaceImpSample interfaceImpSample = new InterfaceImpSample();
        System.out.println(interfaceImpSample.add("one"));

        SortSample sortSample = new SortSample();
        int[] data = {1, 5, 7, 3, 2, 9};
        sortSample.bubbleSort(data);
    }
}
