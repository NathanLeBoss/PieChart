package piechart;

public class ConsoleView implements PercentageView{
    @Override
    public void notify(PercentageModel model) {
        System.out.println("la nouvelle valeur est : " + model.getValue());
    }
}
