public enum EnumSample {
    Orange("オレンジ"),
    Apple("りんご"),
    Cherry("さくらんぼ");

    private String japanese;

    EnumSample(String value) {
        this.japanese = value;
    }

    public String getJapanese() {
        return this.japanese;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
