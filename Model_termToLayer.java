public class Model_termToLayer{
    int[] learning_decision;
    int PERIOD;
    
    public Model_termToLayer(int PERIOD_input){
        PERIOD = PERIOD_input;
        learning_decision = new int[PERIOD];
    }
    
    public void model_learning(Model_terminal[] prev_layer, boolean[] learn_part_data){
        for(int m = 0; m < prev_layer.length; m++){
            boolean[] result_accuracy = prev_layer[m].model_testing(learn_part_data);
            for(int i = 0; i < result_accuracy.length; i++){
                if(result_accuracy[i])
                    learning_decision[i] = m;
            }
        }
    }
    
    public boolean[] model_testing(Model_terminal[] prev_layer, boolean[] test_part_data){
        boolean[] result_accuracy = new boolean[PERIOD];
        for(int i = 0; i < test_part_data.length; i++){
            result_accuracy[i] = prev_layer[learning_decision[i]].model_testing(test_part_data)[i] == test_part_data[i];
        }
        return result_accuracy;
    }
}
