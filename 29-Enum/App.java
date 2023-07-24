interface Days
{
void show(); // this is public abstract by default in subclasses we sould write public
}

enum Day implements Days {
    SUNDAY(7),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    public final int value; // Most of the case we want to use const variables in enum
    
    private Day(int value) // With this constructor we can set value to enum variables
    {
            this.value = value;
    }
    @Override
    public void show(){
        System.out.println("show");
    }

}
  


public class App {
    public static void main(String[] args) {

        Day day = Day.FRIDAY;
        day.show();

        System.out.println(day.value);
        switch(day){
            case SUNDAY:
            System.out.println("Today is sunday");
            break;
            case FRIDAY:
            System.out.println("Today is FRIDAY");
            break;
            default:
            System.out.println("Today is neither sunday nor monday");
            break;
        }

        if(day.value == 5)
        System.out.println(day + " if statement works");

        System.out.println();

        for(Day i : Day.values())
        {
            System.out.println(i + ":" + i.value);
        }


    }    
}
