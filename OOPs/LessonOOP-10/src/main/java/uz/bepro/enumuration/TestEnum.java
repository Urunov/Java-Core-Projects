package uz.bepro.enumuration;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 5:39 PM}
 */
public class TestEnum {
    //
    Day day; // aggregation enum

    public TestEnum(Day day) {
        this.day = day;
    }

    public void daysIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are not well.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }

        }

    public static void main(String[] args) {
      String str = "MONDAY";
      TestEnum testEnum = new TestEnum(Day.valueOf(str));
      testEnum.daysIsLike();

    }
}

