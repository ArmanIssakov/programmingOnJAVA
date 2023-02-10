package OOPLECTURE5;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v){
        model = m;
        view = v;
    }

    public void buttonClick(){
        int x = view.getValueX();
        int y = view.getValueY();
        model.setX(x);
        model.setY(y);
        int result = model.result();
        view.showMessage(result, x, y);
    }
}
