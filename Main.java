import java.util.*;
public class Main
{
    public static boolean[] generate_test_data(int size){
        boolean[] test_data = new boolean[size];
        for(int index = 0; index < size; index++){
            int rand = new Random().nextInt();
            if(rand < 1){
                test_data[index] = false;
            }
            else{
                test_data[index] = true;
            }
        }
        return test_data;
    }
	public static void main(String[] args) {
		
        int PERIOD = 6; //can be fixed by every PERIOD

		boolean[] test_data = generate_test_data(PERIOD);

        
		
	}
}
