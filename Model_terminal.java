public class Model_terminal{
    boolean[] learning_decision;
    int PERIOD;
    public Model_terminal(int PERIOD_input){
        PERIOD = PERIOD_input;
        learning_decision = new boolean[PERIOD];
    }
    
    public void model_learning(boolean[] learn_part_data){
        for(int i = 0 ; i < learn_part_data.length; i++){
            learning_decision[i] = learn_part_data[i];
        }
    }
    
    public boolean[] model_testing(boolean[] test_part_data){
        boolean[] result_accuracy = new boolean[PERIOD];
        for(int i = 0; i < test_part_data.length; i++){
            result_accuracy[i] = learning_decision[i] == test_part_data[i];
        }
        return result_accuracy;
    }
}
