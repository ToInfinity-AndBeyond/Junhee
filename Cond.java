public class Cond {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // switch-case
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day of the week: " + dayName);

        boolean isRaining = true;

        // && (logical AND), || (logical OR), ! (logical NOT)   


        if (isRaining && dayOfWeek == 3) {
            System.out.println("It's raining on Wednesday.");
        } else if (isRaining || dayOfWeek == 3) {
            System.out.println("It's either raining or it's Wednesday.");
        } else {
            System.out.println("It's not raining and it's not Wednesday.");
        }
    }
}
