public class HealthRecord {
    private int height;
    private static final int MIN_PERMITTED_HEIGHT = 50;
    private static final int MAX_PERMITTED_HEIGHT = 175;
    private static final int DEFAULT_HEIGHT = 100;

    // TODO: 1 Think about the initial value for maximum and minimum height
    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;
    private static int counter = 0;
    private static double averageHeight = 0.0;
    public HealthRecord(int height) {
        setHeight(height);
    }
    public void setHeight(int height) {
        counter++;

        // TODO: 2 Check if the input height falls within the permitted range
        if ( height >= MIN_PERMITTED_HEIGHT && height <= MAX_PERMITTED_HEIGHT )
            this.height = height;
        else
            this.height = DEFAULT_HEIGHT ;
        // TODO: 3 Update the tallest and shortest height
        if ( this.height > tallestHeight )
            tallestHeight = this.height ;
        if ( this.height < shortestHeight )
            shortestHeight = this.height;

        averageHeight = (averageHeight*(counter-1)+this.height)/counter;
    }

    public int getHeight() {
        return this.height;
    }

    public static int getTallestHeight() {
        return HealthRecord.tallestHeight;
    }

    public static int getShortestHeight(){
        return HealthRecord.shortestHeight;
    }

    public  static double getAverageHeight(){
        return HealthRecord.averageHeight;
    }
    public  void  displayDetails () {
        System.out.println( "ความสูง (ซม.): " + getHeight());
    }
    public static void displayClassDetails() {
        System.out.println("ความสูงที่สูงที่สุด (ซม.): " + getTallestHeight());
        System.out.println("ความสูงที่สั้นที่สุด (ซม.): " + getShortestHeight());
        System.out.println("ความสูงเฉลี่ย (ซม.): " + getAverageHeight());
    }
}
