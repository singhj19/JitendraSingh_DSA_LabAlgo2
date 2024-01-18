package paymoney.dailytarget;

public class Main {
    public static void main(String[] args) {

        DailyTargetDeterminator determinator = new DailyTargetDeterminator();
        determinator.collectTransactionValues();
        determinator.collectDailyTargets();
        determinator.determine();
    }
}
